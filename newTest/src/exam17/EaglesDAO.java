package exam17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EaglesDAO {
	
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";
	
	public EaglesDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertMember(EaglesDTO member) {
		String query = "insert into eagles (back_no,name,posi,highschool,use_hand,hit_hand,birth,salary) values(?,?,?,?,?,?,?,?);";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, member.getBack_no());
			pStmt.setString(2, member.getName());
			pStmt.setString(3, member.getPosi());
			pStmt.setString(4, member.getHighschool());
			pStmt.setString(5, member.getUse_hand());
			pStmt.setString(6, member.getHit_hand());
			pStmt.setString(7, member.getBirthday());
			pStmt.setInt(8, member.getSalary());
			
			pStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pStmt != null && !pStmt.isClosed())
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
	
	public void updateMember(EaglesDTO member,int back_no) {
		String query = "update eagles set back_no=?,name=?, posi=?, highschool=?,use_hand=?,hit_hand=?,birth=?,salary=? where back_no=?;";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, member.getBack_no());
			pStmt.setString(2, member.getName());
			pStmt.setString(3, member.getPosi());
			pStmt.setString(4, member.getHighschool());
			pStmt.setString(5, member.getUse_hand());
			pStmt.setString(6, member.getHit_hand());
			pStmt.setString(7, member.getBirthday());
			pStmt.setInt(8, member.getSalary());
			pStmt.setInt(9, back_no);
			
			pStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pStmt != null && !pStmt.isClosed())
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
	
	public List<EaglesDTO> selectAll(){
		String sql = "select * from eagles ;";
		List<EaglesDTO> memberList = selectCondition(sql);
		return memberList;
	}
	
	public List<EaglesDTO> selectCondition(String query) {
		PreparedStatement pStmt = null;
		List<EaglesDTO> memberList = new ArrayList<EaglesDTO>();
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()){
				EaglesDTO member = new EaglesDTO();
				member.setBack_no(rs.getInt("back_no"));
				member.setName(rs.getString("name"));
				member.setPosi(rs.getString("posi"));
				member.setHighschool(rs.getString("highschool"));
				member.setUse_hand(rs.getString("use_hand"));
				member.setHit_hand(rs.getString("hit_hand"));
				member.setBirthday(rs.getString("birth"));
				member.setSalary(rs.getInt("salary"));
				memberList.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pStmt != null && !pStmt.isClosed())
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return memberList;
	}
	
	public EaglesDTO selectOne(int back_no) {
		String query = "select * from eagles where back_no=?;";
		PreparedStatement pStmt = null;
		EaglesDTO member = new EaglesDTO();
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, back_no);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()){
				member.setBack_no(rs.getInt("back_no"));
				member.setName(rs.getString("name"));
				member.setPosi(rs.getString("posi"));
				member.setHighschool(rs.getString("highschool"));
				member.setUse_hand(rs.getString("use_hand"));
				member.setHit_hand(rs.getString("hit_hand"));
				member.setBirthday(rs.getString("birth"));
				member.setSalary(rs.getInt("salary"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pStmt != null && !pStmt.isClosed())
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return member;
	}
	
	
	public void close() {
		try {
			if (conn != null && !conn.isClosed())
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
