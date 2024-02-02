package Businesslayer;

import DBLayer.DBHandler;

public class Society {
	private String name;
	private String domain;
	private EventCalender calender;
	private Finances finances;
	private Admin admin;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	} 
	
	public void administerbudget() {
		finances.displaycurrentfinances();
	}
	public void budgetrequest(double amount, String purpose, String societyn) {
		DBHandler db=new DBHandler();
		db.savebudget(purpose, societyn,amount);
	}
	public void enterapplicantdetails(String society, String position, String rollno) {
		DBHandler db=new DBHandler();
		db.savemember(rollno,society);
	}
	public void enterbudgetdetails(double amount) {
		admin.budgetproposal(amount);
	}
	public void enterevent(String name, String venue,String date,String time) {
		Events event=new Events();
		event.setName(name);
		event.setLocation(venue);
		event.setDate(date);
		event.setTime(time);
		calender=new EventCalender();
		calender.addevent(event,"");
	}
	public int entersocietyname(String name) {
		DBHandler DB=new DBHandler();
		return DB.searchSociety(name);
	}
	public void sendinfochanges(int id, String presname,String domain) {
		DBHandler db=new DBHandler();
		db.updateSociety(id, presname, domain);
	}
	public void enterusername() {
		System.out.println(name);
	}
	public void registersociety(String name2, String domain2, String presname, String rollno, String pass) {
		this.name=name2;
		this.domain=domain2;
		DBHandler db=new DBHandler();
		db.savepres(presname,rollno,rollno,pass);
		db.savesociety(name,domain);
	}
	public void entersocietydetails() {
		
	}
	public void schedulerecruitmentdrive(String date, String societyname, String eventname, String time, String venue) {
		Events event=new Events();
		event.setName(eventname);
		event.setLocation(venue);
		event.setDate(date);
		event.setTime(time);
		calender=new EventCalender();
		calender.addevent(event,societyname);
	}

}
