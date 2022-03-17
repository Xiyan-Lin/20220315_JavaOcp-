
package day02;


public class Circle {
    private double r;
    void serR(double r){
        if(r < 0){
            System.out.println("半徑設定錯誤");
            return;
        }
        this.r = r;
    }
    void calcAndPrintArea(){
        double area = Math.PI * Math.pow(r, 2);
        System.out.printf("area: %.1f\n", area);
    }
    // 計算並回傳面積
    double calcAndReturnArea(){
        double area = Math.PI * Math.pow(r, 2);
        return area; //return double 
    }
    
    void print(){
        System.out.printf("r = %.1f\n", r);
    }
}
