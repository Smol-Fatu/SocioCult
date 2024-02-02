package Businesslayer;

import DBLayer.DBHandler;

public class SocietyPresident extends Account{
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
	public int searchpres(String username, String pass) {
		// TODO Auto-generated method stub
		DBHandler db=new DBHandler();
		return db.searchpres(username, pass);
	}
}
