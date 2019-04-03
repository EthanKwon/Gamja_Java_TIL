package basic03;

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
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public EaglesDTO selectOne(int backNo) {
		String query = "select * from eagles where back_no=?;";
		PreparedStatement pStmt = null;
		EaglesDTO eagles = new EaglesDTO();
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, backNo);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()){
				eagles.setBackNo(rs.getInt("back_no"));
				eagles.setName(rs.getString("name"));
				eagles.setPosition(rs.getString("posi"));
				eagles.setHighschool(rs.getString("highschool"));
				eagles.setUseHand(rs.getString("use_hand"));
				eagles.setHitHand(rs.getString("hit_hand"));
				eagles.setBirthDay(rs.getString("birth"));
				eagles.setSalary(rs.getInt("salary"));
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
		return eagles;
	}
	
	public List<EaglesDTO> selectPlayersByPosition(String position){
		String sql = "select * from eagles where posi like '" + position + "';";
		List<EaglesDTO> playerList = selectCondition(sql);
		return playerList;
	}
	
	public List<EaglesDTO> selectPlayersBySalary(int salary) {
		String sql = "select * from eagles where salary >= " + salary + ";";
		List<EaglesDTO> playerList = selectCondition(sql);
		return playerList;
	}
	
	public List<EaglesDTO> selectAll(){
		String sql = "select * from eagles ;";
		List<EaglesDTO> playerList = selectCondition(sql);
		return playerList;
	}
	
	public List<EaglesDTO> selectCondition(String query) {
//		String query = "select * from eagles";
		PreparedStatement pStmt = null;
		List<EaglesDTO> playerList = new ArrayList<EaglesDTO>();
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()){
				EaglesDTO player = new EaglesDTO();
				player.setBackNo(rs.getInt("back_no"));
				player.setName(rs.getString("name"));
				player.setPosition(rs.getString("posi"));
				player.setHighschool(rs.getString("highschool"));
				player.setUseHand(rs.getString("use_hand"));
				player.setHitHand(rs.getString("hit_hand"));
				player.setBirthDay(rs.getString("birth"));
				player.setSalary(rs.getInt("salary"));
				playerList.add(player);
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
		return playerList;
	}

	public void insertEagles(EaglesDTO player) {
		String query = "insert into eagles values(?,?,?,?,?,?,?,?);";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, player.getBackNo());
			pStmt.setString(2, player.getName());
			pStmt.setString(3, player.getPosition());
			pStmt.setString(4, player.getHighschool());
			pStmt.setString(5, player.getUseHand());
			pStmt.setString(6, player.getHitHand());
			pStmt.setString(7, player.getBirthDay());
			pStmt.setInt(8, player.getSalary());
			
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
	
	public void updateEagles(EaglesDTO player) {
		String query = "update eagles set name=?, posi=?, highschool=?, use_hand=?, hit_hand=?, birth=?, salary=? where back_no=?;";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, player.getName());
			pStmt.setString(2, player.getPosition());
			pStmt.setString(3, player.getHighschool());
			pStmt.setString(4, player.getUseHand());
			pStmt.setString(5, player.getHitHand());
			pStmt.setString(6, player.getBirthDay());
			pStmt.setInt(7, player.getSalary());
			pStmt.setInt(8, player.getBackNo());
			
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
	
	public void deleteEagles(int backNo) {
		String query = "delete from eagles where back_no=?";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, backNo);
			
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
	
	public void close() {
		try {
			if (conn != null && !conn.isClosed())
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
