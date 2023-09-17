package proxy.real;

import proxy.subject.LoginMethod;

public class Apple implements LoginMethod {
    
    @Override
    public void login(String username, String password) {
        System.out.println("Logging in to Apple account with username: " + username);
    }
}