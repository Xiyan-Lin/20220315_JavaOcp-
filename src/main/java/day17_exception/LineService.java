package day17_exception;

import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Arrays;

public class LineService {
    // 存取權杖
    private static final String TOKEN = "rgjFyMGTa5a4gJ6wULmUya81sjGvUI2rtnvGTc8bFZk";
    // 發送位置
    private static final String LINE_NOTIFY_URL = "https://notify-api.line.me/api/notify";
    
    private int lineNotify(byte[] postData) throws ProtocolException, IOException {
        URL url = null;
        url = new URL(LINE_NOTIFY_URL);
        // 4. 建立 HttpURLConnection 物件
        HttpURLConnection conn = null;
        conn = (HttpURLConnection) url.openConnection();
        // conn 設定
        conn.setDoOutput(true); // 可以傳送資料
        conn.setRequestMethod("POST"); // 傳送方式
        conn.setRequestProperty("Authorization", "Bearer " + TOKEN); // 授權 + Bearer 加密
        conn.setUseCaches(false);
        // 5. 訊息發送
        DataOutputStream out = new DataOutputStream(conn.getOutputStream());
        out.write(postData); // 資料寫入(傳送)
        out.flush();
        // 6. 顯示回應資料
        int statusCode = 0;
        if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) { // 過濾掉建立連線的回應
            statusCode = conn.getResponseCode();
            System.out.println(statusCode);
            if (statusCode == 200) { // HTTP Code 的回應碼 = 200 表示成功
                System.out.println("發送成功");
            }
        }
        return statusCode;
    }
    
    // 傳送文字
    public int sendText(String message) throws Exception {
        // 準備 postData 後進行發送
        byte[] postData = null;
        postData = ("message=" + message).getBytes("UTF-8");
        System.out.println(Arrays.toString(postData));
        int statusCode = lineNotify(postData);
        return statusCode;
    }
    
    // 傳送文字 + 貼圖
    public int sendSticker(String message, int packageId, int id) throws Exception {
        byte[] postData = null;
        // 範例: message=Hello&stickerPackageId=1&stickerId=113
        postData = ("message=" + message + "&stickerPackageId=" + packageId + "&stickerId=" + id).getBytes("UTF-8");
        System.out.println(Arrays.toString(postData));
        int statusCode = lineNotify(postData);
        return statusCode;
    }
    
    // 傳送文字 + 網路圖片
    public int sendWebImage(String message, String imageUrl) throws Exception {
        // 準備 postData 後進行發送
        byte[] postData = null;
        postData = ("message=" + message+ "&imageThumbnail=" + imageUrl + "&imageFullsize=" + imageUrl).getBytes("UTF-8");
        System.out.println(Arrays.toString(postData));
        int statusCode = lineNotify(postData);
        return statusCode;
    }
    // 傳送文字 + 本地圖片
    public int sendLocalImage(String message, File imageFile) throws Exception {
        // 準備 postData 後進行發送
        return 0;
    }
    
}
