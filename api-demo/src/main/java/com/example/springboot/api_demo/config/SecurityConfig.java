package com.example.springboot.api_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // h2-consoleとspring-boot-practiceのAPIへのアクセスを許可
    private static final String[] ALLOW_PATTERNS = {
        "/h2-console/**", "/api/**"
    };

    @SuppressWarnings("removal")
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        /**
         * 認可設定
         * アクセス権限でエラーが表示されるため、下記内容により指定したパスへのアクセスを緩和する
        */
        http.authorizeHttpRequests(authz -> authz
            // パスのアクセス許可
            // - h2コンソール + 当該プロジェクトでアクセスするAPIのパス
            .requestMatchers(ALLOW_PATTERNS).permitAll()
            // - 上記パス以外のリクエストは認証要求される
            // - 例）http://localhost:8080 のみだと、Sample1appApplicationにある「Hello World」は表示されない
            .anyRequest().authenticated())
            // CSRF（クロスサイトリクエストフォージェリ）:
            // - 脆弱性（認証を他人に譲渡するようなセキュリティホールなど）
            // - h2-console、spring-boot-practiceのAPIのみセキュリティホールを許す
            .csrf(csrf -> csrf.ignoringRequestMatchers(ALLOW_PATTERNS))
            // X-Frame-Options:
            // - 脆弱性（視認できない導線を配置して他有害サイトなどへの遷移を行うクリックジャッキングなど）
            // - h2コンソールへアクセスするために無効
            .headers(headers -> headers.frameOptions().disable());

        return http.build();
    }
}
