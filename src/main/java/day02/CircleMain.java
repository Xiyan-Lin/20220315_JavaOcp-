
package day02;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.serR(7.5);
        circle.print();
        circle.calcAndPrintArea();
        //εεΎ area θ³ζ\
        double area = circle.calcAndReturnArea();
        System.out.printf("area : %.3f\n", area);
    }
}
