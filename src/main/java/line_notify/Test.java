
package line_notify;

import com.sun.org.apache.xerces.internal.impl.io.MalformedByteSequenceException;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Test {
    // 存取權杖
    private static final String TOKEN = "rgjFyMGTa5a4gJ6wULmUya81sjGvUI2rtnvGTc8bFZk";
    // 發送位置
    private static final String LINE_NOTIFY_URL = "https://notify-api.line.me/api/notify";
    public static void main(String[] args) {
        // 1. 要發送的資料
        String message = "Hello 我是...";
        // 2. 發送前設定
        byte[] postData = null;
        try {
            
            postData = ("message=" + message).getBytes("UTF-8");
        } catch (UnsupportedEncodingException ex) {
            System.out.println("無法編碼" + ex);
            return;
        }
        System.out.println(Arrays.toString(postData));
        // 3. 建立 URL 物件
        URL url = null;
        try {
            url = new URL(LINE_NOTIFY_URL);
        } catch (MalformedURLException ex) {
            System.out.println("請確認網址是否正確?" + ex);
            return;
        }
        
        // 4. 建立 HttpURLConnection 物件
        HttpURLConnection conn = null;
        try {       
             conn = (HttpURLConnection)url.openConnection();
             // conn 設定
             conn.setDoOutput(true); // 可以傳送資料
             conn.setRequestMethod("POST"); // 傳送方式
             conn.addRequestProperty("Authorization", "Bearer " + TOKEN ); //授權 + Bearer 加密
             conn.setUseCaches(false);
        } catch (IOException ex) {
            System.out.println("連線失敗: " + ex);
            
        }
        
        // 5. 傳送出去
        try(DataOutputStream out = new DataOutputStream(conn.getOutputStream())){
            out.write(postData); //資料寫入(傳送)
            out.flush();
        }catch(IOException ex){
            System.out.println("資料傳送失敗: " + ex);
            return;
            
        }
        
        // 6. 顯示回應資料
        try{
        if(conn.getResponseCode() != HttpURLConnection.HTTP_CREATED){// 過濾掉建立連線的回應
            int statuscode = conn.getResponseCode();
            System.out.println(statuscode);
            if(statuscode == 200){ // HTTP Code 的回應碼 = 200 表示成功
                System.out.println("發送成功");
            }
        }
        }catch(IOException ex){
            System.out.println("資料回應有誤: " + ex);
        }    
        
    }
}
