# VT Spring Boot 学習用

## 環境構築

### JDKの設定

1. JDK インストール
    * 対象バージョン: 17
    * Oracle: https://www.oracle.com/java/technologies/downloads/?er=221886
        * Intel Macと、M1やM2は異なるインストーラーを使用するため適切なものをダウンロードしインストールする
2. インストール済みのJDKのパスの確認
    * `/usr/libexec/java_home -V`
        * インストール済みのものがある場合、以下のようなjdkの一覧が表示される
        * jdkにも色々種類があるが、今回はOracleのJDKを使用する
            * 補足: Eclipse（Pleiades All in One）をダウンロード済みの場合は基本的にはJDKをダウンロードする必要はない

```log
/usr/libexec/java_home -V
Matching Java Virtual Machines (10):
    21.0.5 (arm64) "Oracle Corporation" - "Java SE 21.0.5" /Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home
    17.0.3 (x86_64) "Eclipse Adoptium" - "OpenJDK 17.0.3" /Library/Java/JavaVirtualMachines/jdk-17.0.3+7/Contents/Home
    16.0.1 (x86_64) "AdoptOpenJDK" - "AdoptOpenJDK 16" /Library/Java/JavaVirtualMachines/adoptopenjdk-16.jdk/Contents/Home
    15.0.1 (x86_64) "AdoptOpenJDK" - "AdoptOpenJDK 15" /Library/Java/JavaVirtualMachines/adoptopenjdk-15.jdk/Contents/Home
    11.0.16 (x86_64) "Amazon.com Inc." - "Amazon Corretto 11" /Users/ユーザー名/Library/Java/JavaVirtualMachines/corretto-*********/Contents/Home
    11.0.15 (x86_64) "Eclipse Adoptium" - "OpenJDK 11.0.15" /Library/Java/JavaVirtualMachines/jdk-11.0.15+10/Contents/Home
    11.0.15 (x86_64) "Eclipse Adoptium" - "OpenJDK 11.0.15" /Library/Java/JavaVirtualMachines/temurin-11.jdk/Contents/Home
    11.0.10 (x86_64) "AdoptOpenJDK" - "AdoptOpenJDK 11" /Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home
    1.8.333.02 (x86_64) "Oracle Corporation" - "Java" /Library/Internet Plug-Ins/JavaAppletPlugin.plugin/Contents/Home
    1.8.0_265 (x86_64) "AdoptOpenJDK" - "AdoptOpenJDK 8" /Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home
/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home
```

3. jdkのパスの設定
    * `ls ~/.zshrc` で `.zshrc` ファイルの確認
        * 存在しない場合 `touch ~/.zshrc` で新規作成
    * `view .zshrc` で中身を確認
    * `i` を押下して、INSERTモードへ変更する
        * 十字キーで移動し、以下を入力（貼り付けでもOK）
    * `esc` を押下し、`:wq!` と入力して `Enter` を押下し保存する

【.zshrc】
以下2行を追加する

```zsh: .zshrc
export JAVA_HOME=$(/usr/libexec/java_home)
export PATH=$JAVA_HOME/bin:$PATH
```

4. 設定の適用
    * `source ~/.zshrc`
5. Java バージョン確認
    * `java -version`

## Tips

### Z Shell（Zシェル）とは

* システム内の設定処理を行うことができるインターフェース
    * 今回はJavaを利用するためのJDKのパス設定を行うために利用
* macOS Catalina（10.15）以降のデフォルトシェル、それまではBashと呼ばれる下位互換のシェルが普及していた
* MacがM1やM2の場合、「.bashrc」ではなく、「.zshrc」こちらがデフォルト
