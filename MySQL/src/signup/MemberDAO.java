package signup;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;


public class MemberDAO {
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";
	
	public MemberDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void insertMember(MemberDTO member) {
		String query = "insert into info_member (password,name,birthday,address) values(?,?,?,?);";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, member.getPassword());
			pStmt.setString(2, member.getName());
			pStmt.setString(3, member.getBirthday());
			pStmt.setString(4, member.getAddress());
			
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
	
	public void initPassword() {
		List<MemberDTO> mList = selectAll();
		for(MemberDTO member : mList) {
			int id = member.getId();
			String plainPassword = member.getPassword();
			String hashedPassword = BCrypt.hashpw(plainPassword,BCrypt.gensalt());
			updatePassword(id,hashedPassword);
		}
	}
	
	public void updatePassword(int id, String hashed) {
		String query = "update info_member set hashed=? where id=?;";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, hashed);
			pStmt.setInt(2, id);
			
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
	
	public void updateMember(MemberDTO member) {
		String query = "update info_member set password=?, name=?, birthday=?, address=? where id=?;";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, member.getPassword());
			pStmt.setString(2, member.getName());
			pStmt.setString(3, member.getBirthday());
			pStmt.setString(4, member.getAddress());
			pStmt.setInt(5, member.getId());
			
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
	
	public List<MemberDTO> selectAll(){
		String sql = "select * from info_member ;";
		List<MemberDTO> memberList = selectCondition(sql);
		return memberList;
	}
	
	public List<MemberDTO> selectAlldesc(){
		String sql = "select * from info_member order by id desc;";
		List<MemberDTO> memberList = selectCondition(sql);
		return memberList;
	}
	
	public List<MemberDTO> selectIdLookUp(String name){
		String sql = "select * from info_member where name like '"+ name +"' ;";
		List<MemberDTO> memberList = selectCondition(sql);
		return memberList;
	}
	
	public List<MemberDTO> selectCondition(String query) {
		PreparedStatement pStmt = null;
		List<MemberDTO> memberList = new ArrayList<MemberDTO>();
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()){
				MemberDTO member = new MemberDTO();
				member.setId(rs.getInt("id"));
				member.setPassword(rs.getString("password"));
				member.setName(rs.getString("name"));
				member.setBirthday(rs.getString("birthday"));
				member.setAddress(rs.getString("address"));
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
	
	public MemberDTO selectOne(int id) {
		String query = "select * from info_member where id=?;";
		PreparedStatement pStmt = null;
		MemberDTO member = new MemberDTO();
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, id);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()){
				member.setId(rs.getInt("id"));
				member.setPassword(rs.getString("password"));
				member.setName(rs.getString("name"));
				member.setBirthday(rs.getString("birthday"));
				member.setAddress(rs.getString("address"));
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

	public void deleteMember(int id) {
		String query = "delete from info_member where id=?;";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, id);
			
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
	
	public boolean searchMember(String name) {
		PreparedStatement pStmt = null;
		boolean findMember = false;
		String query = "select name from info_member";
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()){
				if(rs.getString("name").equals(name)) {
					findMember = true;
					break;
				}
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
		return findMember;	
	}
	
	public boolean IsMember(int id, String password) {
		PreparedStatement pStmt = null;
		boolean findMember = false;
		String query = "select id,password from info_member";
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()){
				if(rs.getInt("id")==id) {
					if(rs.getString("password").equals(password)) {
						findMember = true;
						break;
					}
				}
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
		return findMember;	
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
