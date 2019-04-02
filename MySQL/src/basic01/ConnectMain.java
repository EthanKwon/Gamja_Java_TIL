package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMain {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");	
            //데이터 베이스와의 연결 과정 구문
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
                "javauser", "javapass");	
            
            //st : , sql : SQL 명령어 입력 , rs : 명령어로 불러온 결과
            st = conn.createStatement();
            String sql = "select id, date_format(datetime, '%Y-%m-%d %r') FROM date_table;";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int Id = rs.getInt(1); // 데이터베이스에서 int변수를 얻어오는 작업
                String date = rs.getString(2); //데이터베이스에서 문자열을 얻어오는 작업
                System.out.printf("%8d %-20s\n", Id, date);
            }
            rs.close();
            st.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (st != null)
                    st.close();
            } catch (SQLException se2) { }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}


