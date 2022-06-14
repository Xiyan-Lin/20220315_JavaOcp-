
package day20_thread;


public class Shower {
    Runnable worker = () -> {
        System.out.println("瓦斯工人送瓦斯");
        try {
            for(int i=1 ; i<=5 ; i++){
                System.out.println(i + "秒鐘 ");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("\n瓦斯工人發生意外: " + e);
        }
         System.out.println("\n瓦斯工人家瓦斯送到");
        
    };
    
    Runnable father = () -> {
        System.out.println("爸爸下班回家");
        System.out.println("爸爸準備洗澡");
        System.out.println("爸爸發現沒瓦斯");
        System.out.println("爸爸打電話請瓦斯工人送瓦斯");
        Thread workerThread = new Thread(worker);
        workerThread.start();
        try {
            workerThread.join();
        } catch (Exception e) {
            
        }
        System.out.println("爸爸開始洗澡");
        System.out.println("爸爸洗完澡");
    };
    
    
    
    public static void main(String[] args){
        Shower shower = new Shower();
        Thread fatherThread = new Thread(shower.father);
        fatherThread.start();
    } 
}
