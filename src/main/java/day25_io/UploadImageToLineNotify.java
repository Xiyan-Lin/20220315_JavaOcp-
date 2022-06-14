
package day25_io;

// 將f18.jpg上傳到line notify

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

public class UploadImageToLineNotify {
    public static void main(String[] args) throws Exception {
        // 1. 準備發送的文字資料
        String message = "f18 大黃蜂";
        // 2. 圖檔位置
        File file = new File("src/main/java/day25_io/f18.jpg");
        // 3. Token
        String token = "rgjFyMGTa5a4gJ6wULmUya81sjGvUI2rtnvGTc8bFZk";
        // 4. 發送位置
         String lineNotifyUrl = "https://notify-api.line.me/api/notify";
        // 5. 發送前設定
        // 標頭檔 header
        Map<String,String> headers = new LinkedHashMap<>();
        headers.put("Authorization", "Bearer " + token);
        
        // POST 參數
        HttpPostMultipart multipart = new HttpPostMultipart(lineNotifyUrl, "utf-8", headers);
        multipart.addFormField("message", message); //文字
        multipart.addFilePart("imageFile", file); // 檔案
        // 6. 傳送並取得回傳直
        String response = multipart.finish();
        System.out.println(response);
    
    
    
    
    
    
    
    
    
    
    }
    
}
