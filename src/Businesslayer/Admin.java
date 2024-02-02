package Businesslayer;

import DBLayer.DBHandler;

public class Admin extends Account{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void budgetproposal(double amount) {
		System.out.println(amount);
	}

	public int searchadmin(String username, String pass) {
		// TODO Auto-generated method stub
		DBHandler db=new DBHandler();
		return db.searchadmin(username, pass);
	}
}
