package proxy.proxy;

import proxy.real.Apple;
import proxy.real.Google;
import proxy.real.Microsoft;
import proxy.subject.LoginMethod;

public class LoginProxy implements LoginMethod {
    private LoginMethod realLoginMethod;

    public LoginProxy(String provider) {
        switch (provider.toLowerCase()) {
            case "microsoft":
                realLoginMethod = new Microsoft();
                break;
            case "google":
                realLoginMethod = new Google();
                break;
            case "apple":
                realLoginMethod = new Apple();
                break;
            default:
                throw new IllegalArgumentException("Unsupported login provider: " + provider);
        }
    }

    @Override
    public void login(String username, String password) {
        System.out.println("Proxy is verifying credentials...");
        realLoginMethod.login(username, password);
        System.out.println("Logged in successfully! :)");
    }
}
