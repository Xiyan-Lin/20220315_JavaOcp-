
package day02;


public class Student {
    // 屬性
    private String name;
    private double height;
    private double weight;
    private int score;
    
    //方法
    //設定名稱
    void setName(String name){
        this.name = name;
    }
    //設定身高
    void setHeight(double h){
        if(h <= 0 || h > 250){
            System.out.println("身高資料錯誤");
            return;
        }
        height = h;
    }
    //設定體重
    void setWeight(double w){
        if(w <= 0 || w > 300){
            System.out.println("體重資料錯誤");
            return;
        }
        weight = w;
    }
    //設定分數 
    void setScore(int score){
        if(score < 0 || score > 100){
            System.out.println("分數資料錯誤");
            return;
        }
        this.score = score;
    }
    //印出資料
    void print(){
        System.out.printf("name: %s height: %.1f weight: %.1f score: %d\n", name, height, weight, score);
    }
    
    
}
