
package day02;


public class RectMain {
    public static void main(String[] args) {
        Rect rect = new Rect();
        rect.setWidthAndHeight(30, 50);
        int area = rect.getArea();
        System.out.printf("area = %,d\n", area);
    }
}
