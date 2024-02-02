package DBLayer;

import java.sql.*;

public class DBHandler {
	private String usrname = "root";
	private String pass = "fatima2001";
	static Connection con; // connection object

	public DBHandler() {
		// connect to DB
		try {
			// university is the database name
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smsdatabase", usrname, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static int stdid=2;
	public void saveStudent(String username,String pass) {
		try {
			String query="INSERT INTO student (idStudent,Studentrollno ,Studentname) VALUES (?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, stdid);
			stmt.setString(2,username);
			stmt.setString(3, pass);
			
			int rows=stmt.executeUpdate();
			if (rows>0) {
				System.out.println("A student was added...");
			}
			stdid++;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	private static int societyid=4;
	public void savesociety(String name, String domain) {
		try {
			String query="INSERT INTO society (idSociety, Societyname, Societydomain) VALUES (?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, societyid);
			stmt.setString(2,name);
			stmt.setString(3, domain);
			
			int rows=stmt.executeUpdate();
			if (rows>0) {
				System.out.println("A society was added...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public int searchStudent(String username, String pass) {
		try {
			String query="SELECT * FROM student WHERE Studentrollno=? AND Studentname=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1,username);
			stmt.setString(2, pass);
			
			ResultSet rows=stmt.executeQuery();
			if (rows.next()) {
				System.out.println("A student was found...");
				return rows.getInt(1);
			}
			return 0;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	public void deleteStudent(int id) {
		String query="DELETE FROM student WHERE idstudent=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);

			int rows=ps.executeUpdate();
			if (rows>0) {
				System.out.println("A student was deleted...");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	private static int presid=2;
	public void savepres(String name, String rollno, String username, String pass2) {
		try {
			String query="INSERT INTO societypresident (idSocietyPresident, SocietyPresidentname, SocietyPresidentrollno, SocietyPresidentusername, SocietyPresidentpassword) VALUES (?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, presid);
			stmt.setString(2, name);
			stmt.setString(3,rollno);
			stmt.setString(4,username);
			stmt.setString(5,pass2);
			
			int rows=stmt.executeUpdate();
			if (rows>0) {
				System.out.println("A pres was added...");
			}
			presid++;
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static int calid=5;
	
	public void saveevent(String name, String venue,String date,String time) {
		try {
			String query="INSERT INTO event (idEvent, Eventname, Eventpurpose, Eventdate, Eventtime, Eventlocation) VALUES (?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, calid);
			stmt.setString(2, name);
			stmt.setString(3,"");
			stmt.setString(4,date);
			stmt.setString(5,time);
			stmt.setString(6,venue);
			
			int rows=stmt.executeUpdate();
			if (rows>0) {
				System.out.println("A event was added...");
			}
			calid++;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void addtocalender(String name,String date, String societyname) {
		try {
			
			String query="INSERT INTO eventcalender (idEventCalender, Eventdate, hostsociety, Eventname) VALUES (?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, calid);
			stmt.setString(2, date);
			stmt.setString(3,societyname);
			stmt.setString(4,name);
			
			int rows=stmt.executeUpdate();
			if (rows>0) {
				System.out.println("A event was added to calender...");
			}
			calid++;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public double searchfinance(String name) {
		try {
			String query="SELECT idSociety FROM society WHERE Societyname=? ";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1,name);
			
			ResultSet rows=stmt.executeQuery();
			if (rows.next()) {
				int id=rows.getInt(1);
				query="SELECT Financesamount FROM finances WHERE idSociety=? ";
				stmt = con.prepareStatement(query);
				stmt.setInt(1,id);
				
				rows=stmt.executeQuery();
				if (rows.next()) {
					System.out.println(rows.getDouble(1));
					return rows.getDouble(1);
				}
				return 0.0;
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0.0;
		
	}
	public int searchpres(String username, String pass) {
		try {
			String query="SELECT * FROM societypresident WHERE SocietyPresidentusername=? AND SocietyPresidentpassword=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1,username);
			stmt.setString(2, pass);
			
			ResultSet rows=stmt.executeQuery();
			if (rows.next()) {
				System.out.println("A pres was found...");
				return 1;
			}
			return 0;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	public void deletepres(int id) {
		String query="DELETE FROM societypresident WHERE idSocietyPresident=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);

			int rows=ps.executeUpdate();
			if (rows>0) {
				System.out.println("A pres was deleted...");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	public void closeConnection() {
		try {

			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static int memberid=1;
	public void savemember(String rollno, String society) {
		// TODO Auto-generated method stub
		try {
			String query="INSERT INTO societymembers (idSocietymembers, Societymembersrollno, Society) VALUES (?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, memberid);
			stmt.setString(2,rollno);
			stmt.setString(3,society);
			
			int rows=stmt.executeUpdate();
			if (rows>0) {
				System.out.println("A member was added...");
			}
			memberid++;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public int searchadmin(String username, String pass2) {
		// TODO Auto-generated method stub
		try {
			String query="SELECT * FROM admin WHERE Adminusername=? AND Adminpassword=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1,username);
			stmt.setString(2, pass2);
			
			ResultSet rows=stmt.executeQuery();
			if (rows.next()) {
				System.out.println("A admin was found...");
				return 1;
			}
			return 0;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	public int searchStudent(String rollno) {
		// TODO Auto-generated method stub
		try {
			String query="SELECT * FROM student WHERE Studentrollno=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1,rollno);
			
			ResultSet rows=stmt.executeQuery();
			if (rows.next()) {
				System.out.println("A student was found...");
				return rows.getInt(1);
			}
			return 0;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	public int searchSociety(String name) {
		// TODO Auto-generated method stub
		try {
			String query="SELECT * FROM society WHERE Societyname=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1,name);
			
			ResultSet rows=stmt.executeQuery();
			if (rows.next()) {
				System.out.println("A student was found...");
				return rows.getInt(1);
			}
			return 0;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	public int updateStudent(int id, String name,String rollno) {
		String query="UPDATE student SET Studentname=? WHERE idStudent=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(2, id);
			//ps.setString(2, rollno);
			ps.setString(1, name);
			
			int rows=ps.executeUpdate();
			if (rows>0) {
				System.out.println("A student was updated...");
				return 1;
			}
			return 0;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
			
	}
	public void updateSociety(int id, String presname,String domain) {
		String query="UPDATE society SET Societydomain=? WHERE idSociety=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(2, id);
			//ps.setString(2, rollno);
			ps.setString(1, domain);
			
			int rows=ps.executeUpdate();
			if (rows>0) {
				System.out.println("A society was updated...");
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		query="UPDATE societypresident SET SocietyPresidentname=? WHERE idSocietyPresident=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(2, id);
			//ps.setString(2, rollno);
			ps.setString(1, presname);
			
			int rows=ps.executeUpdate();
			if (rows>0) {
				System.out.println("A societypres was updated...");
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	private static int budid=1;
	public void savebudget(String purpose, String societyn, double amount) {
		try {
			String query="INSERT INTO budgetreq (budgetID, amount, purpose, society) VALUES (?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, budid);
			stmt.setDouble(2, amount);
			stmt.setString(3,purpose);
			stmt.setString(4, societyn);
			
			int rows=stmt.executeUpdate();
			if (rows>0) {
				System.out.println("A request was added...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public String searchbudgname() {
		// TODO Auto-generated method stub
		try {
			String query="SELECT * FROM budgetreq WHERE budgetID=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1,budid);
			
			ResultSet rows=stmt.executeQuery();
			if (rows.next()) {
				System.out.println("A sname was found...");
				return rows.getString("society");
			}
			return "";
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}
	public String searchbudgpurpose() {
		// TODO Auto-generated method stub
		try {
			String query="SELECT * FROM budgetreq WHERE budgetID=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1,budid);
			
			ResultSet rows=stmt.executeQuery();
			if (rows.next()) {
				System.out.println("A sname was found...");
				return rows.getString("purpose");
			}
			return "";
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}
	public double searchbudgamount() {
		// TODO Auto-generated method stub
		try {
			String query="SELECT * FROM budgetreq WHERE budgetID=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1,budid);
			
			ResultSet rows=stmt.executeQuery();
			if (rows.next()) {
				System.out.println("A sname was found...");
				return rows.getDouble("amount");
			}
			return 0.0;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0.0;
	}
	public void deletebdgreq() {
		String query="DELETE FROM budgetreq WHERE budgetID=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, budid);

			int rows=ps.executeUpdate();
			if (rows>0) {
				System.out.println("A req was deleted...");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
