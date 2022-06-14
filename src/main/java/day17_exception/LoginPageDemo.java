
package day17_exception;

import java.util.logging.Level;
import java.util.logging.Logger;


public class LoginPageDemo {
    public static void main(String[] args) {
        String username = "admin";
        String password = "12345";
        
        LoginService loginService = new LoginService();
        try {
            boolean check = loginService.login(username, password);
        } catch (LoginException ex) {
            System.out.println(ex);
            System.out.println(ex.getMessage());
            ex.forgotPassword();
            ex.forgotUsername();
        }
    }
}
