package Businesslayer;
import DBLayer.*;

public class Student extends Account{
	private String name;
	private String rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public int searchstudent(String username,String pass) {
		DBHandler db=new DBHandler();
		return db.searchStudent(username, pass);
	}
	public int searchstudent(String rollno) {
		DBHandler db=new DBHandler();
		return db.searchStudent(rollno);
	}
	public int updatestud(String name2, int id,String num) {
		// TODO Auto-generated method stub
		DBHandler db=new DBHandler();
		return db.updateStudent(id, name2, num);
	}
	
}
