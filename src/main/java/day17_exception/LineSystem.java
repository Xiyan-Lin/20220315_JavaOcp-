
package day17_exception;


public class LineSystem {
    public static void main(String[] args) {
        LineService lineService = new LineService();
        int statusCode = 0;
        try {
            statusCode = lineService.sendText("https://www.youtube.com/watch?v=xF_EqPBTJLs");
            statusCode = lineService.sendSticker("貼圖", 6362, 11087923);
            String imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Image_created_with_a_mobile_phone.png/220px-Image_created_with_a_mobile_phone.png";
            statusCode = lineService.sendWebImage("web", imageUrl);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        System.out.println(statusCode);
    }
 
}
