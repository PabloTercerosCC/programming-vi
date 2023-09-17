package proxy.real;

import proxy.subject.LoginMethod;

public class Google implements LoginMethod {

    @Override
    public void login(String username, String password) {
        System.out.println("Logging in to Google account with username: " + username);
    }
}
