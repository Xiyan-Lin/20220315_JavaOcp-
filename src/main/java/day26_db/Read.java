
package day26_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Read {
    public static void main(String[] args) throws ClassNotFoundException {
        // 若是 JDBC 4.0以下可以不配置
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        // 何謂 JDBC 4.0
        // 就是在 xxx.jar 中有包含 META-INF > services > java.sql.Driver 的結構內容
        // 讓 Java 程式可以自動根據默認位置META-INF > services > java.sql.Driver 找到 Driver 名稱並且自動建立
        String url = "jdbc:derby://localhost:1527/mydb";
        String user = "app";
        String password = "app";
        String sql = "select id, name, salary, dept_id from emp";
        try(Connection conn = DriverManager.getConnection(url,user,password);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);) {
                
            while(rs.next()) {
                //逐筆取欄位內容
                int id = rs.getInt("id"); // rs.getInt("欄位名稱")
                String name = rs.getString("name");
                int salary = rs.getInt("salary");
                int dept_id = rs.getInt("dept_id");
                // 逐筆拋出
                System.out.printf("%d\t%s\t%d\t%d\n",id,name,salary,dept_id);
            }    
        }catch(SQLException e){
            e.getErrorCode();
            
        }
    }
}
