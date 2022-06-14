
package day26_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Delete {
    public static void main(String[] args) throws Exception{
        String sql = "delete from emp where id=?";
        String url = "jdbc:derby://localhost:1527/mydb";
        String user = "app";
        String password = "app";
        try(Connection conn = DriverManager.getConnection(url,user,password);
        PreparedStatement pstmt = conn.prepareStatement(sql);){
            
        pstmt.setInt(1,9); // 第3個問號?放 3
        
        int rowcount = pstmt.executeUpdate();
        System.out.printf("有 %d 修改\n", rowcount);
        
        } catch (Exception e){
            e.printStackTrace();
        }  
    }
}
