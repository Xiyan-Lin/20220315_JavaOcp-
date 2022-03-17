
package day02;


public class Rect {
    private int width;
    private int height;
    private int area;
    
    void setWidthAndHeight(int w, int h){
        width = w;
        height = h;
        area = w * h;
    }
    
    int getArea() {
        return area;
    }
}
