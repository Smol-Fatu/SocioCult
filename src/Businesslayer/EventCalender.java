package Businesslayer;

import DBLayer.DBHandler;

public class EventCalender {
	private String name;
	private String date;
	private String hostsociety;
	private Events event;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHostsociety() {
		return hostsociety;
	}
	public void setHostsociety(String hostsociety) {
		this.hostsociety = hostsociety;
	}
	public void registerforevents(){
		event.registerevent();
	}
	public void addevent(Events e, String societyname){
		DBHandler db=new DBHandler();
		db.addtocalender(e.getName(), e.getDate(),societyname);
		db.saveevent(e.getName(), e.getLocation(), e.getDate(), e.getTime());
	}

	public void displayallevents(){
		System.out.print(event);
	}

	public void selectevent(){
		System.out.print(event);
	}

	public void schedulerecruitmentdrive(){
		System.out.println(event);
	}
	
	
}
