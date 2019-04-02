package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMain {
	public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");	
            //데이터 베이스와의 연결 과정 구문
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
                "javauser", "javapass");	
            
            String query = "insert into song (title, lyrics) values (?,?);";
            
            PreparedStatement pStmt = conn.prepareStatement(query);
            pStmt.setString(1, "가시나");
            pStmt.setString(2, "가시나");
            
            pStmt.executeUpdate();
            
            conn.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

}
