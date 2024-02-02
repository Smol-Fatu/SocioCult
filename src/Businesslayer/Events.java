package Businesslayer;

public class Events {
	private String name;
	private String date;
	private String time;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String purpose) {
		this.name = purpose;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void registerevent() {
		registrationform();
	}
	public void selectevent(String name) {
		System.out.println(name);
	}
	public void registrationform() {
		System.out.print(date);
	}
}
