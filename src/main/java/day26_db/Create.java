
package day26_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Create {
    public static void main(String[] args) throws Exception{
        String sql = "insert into emp(name, salary, dept_id) values (?,?,?)";
        String url = "jdbc:derby://localhost:1527/mydb";
        String user = "app";
        String password = "app";
        try(Connection conn = DriverManager.getConnection(url,user,password);
        PreparedStatement pstmt = conn.prepareStatement(sql);){
            
        pstmt.setString(1,"Happy"); // 第1個問號? 放"Happy"
        pstmt.setInt(2,67000); // 第2個問號? 放 67000
        pstmt.setInt(3,3); // 第3個問號?放 3
        int rowcount = pstmt.executeUpdate();
        System.out.printf("有 %d 新增\n", rowcount);
        
        } catch (Exception e){
            e.printStackTrace();
        }  
    }
}
