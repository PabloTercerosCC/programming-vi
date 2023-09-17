package proxy.real;

import proxy.subject.LoginMethod;

public class Microsoft implements LoginMethod {

    @Override
    public void login(String username, String password) {
        System.out.println("Logging in to Microsoft account with username: " + username);
    }
}
