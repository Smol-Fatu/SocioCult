package Businesslayer;

public class SMS {
	
	private Society society=new Society();
	private Student student=new Student();
	private EventCalender calender=new EventCalender();
	
	public void administerbudget() {
		society.administerbudget();
	}
	public void applytosociety(String society2, String position, String rollno) {
		society.enterapplicantdetails(society2,position,rollno);
	}
	public void budgetrequest(double amount,String purpose, String societyn) {
		society.budgetrequest(amount,purpose,societyn);
	}
	public void enterbudgetdetails(double amount) {
		society.enterbudgetdetails(amount);
	}
	public void enterevent(String name, String venue,String date,String time) {
		society.enterevent(name,venue,date,time);
	}
	public int entersocietyname(String soname) {
		return society.entersocietyname(soname);
	}
	public void registerforevents() {
		calender.displayallevents();
	}
	public void scheduleevents() {
		calender.displayallevents();
	}
	public void selectevent() {
		calender.selectevent();
	}
	public void sendinfochanges(String name,int id,String rollno) {
		student.updatestud(name, id, rollno);
	}
	public void enterusername() {
		society.enterusername();
	}
	public void registersociety(String name, String domain, String presname, String rollno, String pass) {
		society.registersociety(name,domain,presname,rollno,pass);
	}
	public void entersocietydetails(int id, String presname,String domain) {
		society.sendinfochanges(id, presname, domain);
	}
	public void schedulerecruitmentdrive(String date, String societyname, String eventname, String time, String venue) {
		society.schedulerecruitmentdrive(date,societyname,eventname,time,venue);
	}
}
