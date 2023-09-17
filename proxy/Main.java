package proxy;

import java.util.Scanner;
import proxy.proxy.LoginProxy;
import proxy.subject.LoginMethod;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the login provider (Microsoft/Google/Apple): ");
        String provider = scanner.nextLine();
        
        LoginMethod loginMethod = null;
        
        switch (provider.toLowerCase()) {
            case "microsoft":
                loginMethod = new LoginProxy("Microsoft");
                break;
            case "google":
                loginMethod = new LoginProxy("Google");
                break;
            case "apple":
                loginMethod = new LoginProxy("Apple");
                break;
            default:
                System.out.println("Unsupported login provider: " + provider);
                break;
        }

        if (loginMethod != null) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            loginMethod.login(username, password);
        }
        
        scanner.close();
    }
}
