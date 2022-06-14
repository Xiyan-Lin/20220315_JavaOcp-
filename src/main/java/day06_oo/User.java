
package day06_oo;

// 類別變數
// 物驗變數
public class User {
    private static String companyName; //類別變數
    private Integer age; // 物件變數
    
    public void print1(){ //物件方法
        System.out.println(companyName); //印出類別變數
        System.out.println(age); //印出物件變數
        print2(); //調用類別方法
        copyRight(); //調用物件方法
}
    public static void print2(){ //類別方法 (只可以調用類別的屬性/方法)
        System.out.println(companyName); //印出類別變數
        //System.out.println(age); //不可[直接]印出物件變數
        print3(); //調用類別方法
        //copyRight(); //不可[直接]調用物件方法
        
        
    }
    
    public static void print3(){
        System.out.println(companyName); //印出類別變數
        print2(); //調用類別方法
        // 若硬要執行物件方法/屬姓
        // 則必須自行建立物件
        User user = new User();
        System.out.println(user.age); //透過物件變數User 來間接印出物件變數 age
        user.copyRight(); //透過物件變數 user 來間接調用物件方法 copyright()
    }
    
    public void copyRight(){ //物件方法
        System.out.println(companyName + "版權所有");
    }
}
