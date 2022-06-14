
package day26_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Update {
    public static void main(String[] args) throws Exception{
        String sql = "update emp set salary=? where id=?";
        String url = "jdbc:derby://localhost:1527/mydb";
        String user = "app";
        String password = "app";
        try(Connection conn = DriverManager.getConnection(url,user,password);
        PreparedStatement pstmt = conn.prepareStatement(sql);){
            
        pstmt.setInt(1,77000); // 第2個問號? 放 67000
        pstmt.setInt(2,3); // 第3個問號?放 3
        
        int rowcount = pstmt.executeUpdate();
        System.out.printf("有 %d 修改\n", rowcount);
        
        } catch (Exception e){
            e.printStackTrace();
        }  
    }
}
