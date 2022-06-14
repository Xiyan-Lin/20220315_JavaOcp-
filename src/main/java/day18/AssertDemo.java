
package day18;


public class AssertDemo {
    public static void main(String[] args) {
        //針對考試
        int score = -90;
        assert score > 0 : "發生了 Assert 錯誤";
        System.out.println("score= " + score);
    }
}
