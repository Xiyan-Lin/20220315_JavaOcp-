
package day17_exception;


public class LoginService {
    
    public boolean login(String username, String password) throws LoginException{
        if(username.equals("admin") && password.equals("1234")){
            return true;
        }else{
            LoginException loginException = new LoginException("登入失敗");
            throw loginException;
        }
    }
}
