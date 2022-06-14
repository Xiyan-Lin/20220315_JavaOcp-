
package day11_inner3;


public class ButtonMain {
    public static void main(String[] args) {
        Button manualButton = new ManualButton();
        manualButton.action();
        
        Button autoButton = new AutoButton();
        autoButton.action();
        
        Button yoyoButton = new Button() {//由於Button是介面 所以須多開一個實作來new
            
            @Override
            public void action() {
                System.out.println("悠遊卡登入");
            }
        };
        yoyoButton.action();
        
        Button creditCardButton = new Button() {
            @Override
            public void action() {
                System.out.println("信用卡登入");



    }
};
        creditCardButton.action();
        
        //Java 8 Lambda
        Button yoyoButton2 = ()-> System.out.println("悠遊卡2.0登入");
        yoyoButton2.action();
    }
}
        
