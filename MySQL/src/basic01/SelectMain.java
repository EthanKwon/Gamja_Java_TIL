package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectMain {
	public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");	
            //데이터 베이스와의 연결 과정 구문
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
                "javauser", "javapass");	
            
            //필요한 값을 불러와서 검색
            st = conn.createStatement();
            String sql = "select * FROM song where title like ?;";
            PreparedStatement pStmt = conn.prepareStatement(sql);
            pStmt.setString(1, "Gee");
            ResultSet rs = pStmt.executeQuery();
            
            //필요한 값을 같이 적어 검색
           /* st = conn.createStatement();
            String sql = "select * FROM song where title like 'Gee';";
            ResultSet rs = st.executeQuery();*/
            
            while (rs.next()) {
                int songId = rs.getInt(1); // 데이터베이스에서 int변수를 얻어오는 작업
                String title = rs.getString(2); //데이터베이스에서 문자열을 얻어오는 작업
                String lyrics = rs.getString(3); //데이터베이스에서 문자열을 얻어오는 작업
                System.out.printf("%8d %-20s\t%s\n", songId, title,lyrics);
            }
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

}
