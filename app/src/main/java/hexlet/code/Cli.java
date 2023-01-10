package hexlet.code;

import static hexlet.code.Engine.userName;

public class Cli {

    public static void nameRequest() {
        Engine.userNameScanner();
        System.out.println("Hello, " + userName  + " !");
    }
}
