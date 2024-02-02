package Businesslayer;

public class Finances {
	private double budget;
	private String sponsor;
	public void displaycurrentfinances() {
		System.out.println(budget);
	}
	public String getSponsor() {
		return sponsor;
	}
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
}
