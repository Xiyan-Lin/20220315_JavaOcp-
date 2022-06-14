
package day17_exception;


public class FinallyDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int result = 0 ;
        try {
            result = x/y;
            System.out.println("result: " + result);
            // return; // 方法中止 (仍會執行 finally 區段程式碼)
            System.exit(0); // 強制離開(不會執行funally區段程式碼)
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            return; //方法中止(仍會執行 finally 區段程式碼)
        } finally{
            System.out.println("程式結束"); // 一定要執行
        }
        
       
       
        
    }
}
