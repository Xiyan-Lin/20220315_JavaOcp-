
package day11_inner;


public class LoginMain {
    // 在登入表單中輸入John
    public static void main(String[] args) {
        
   
    LoginForm loginForm = new LoginForm("John");
    // 按下登入按鈕
    LoginForm.Button button = loginForm.new Button();
    button.action();
    
    // 在登入表單中輸入Mary 後就直接按下按鈕登入
    LoginForm.Button button2 = new LoginForm("Mary").new Button();
    button2.action();
    
    // 在登入表單中輸入Mary 後就直接按下按鈕後直接登入
    new LoginForm("Helen").new Button().action();
}
}