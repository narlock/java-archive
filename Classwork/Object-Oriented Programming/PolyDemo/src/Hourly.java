
public class Hourly extends Employee {
	private double hours;
	final int HOURS_WORKED = 80;

	public Hourly(String name, int id, double hours) {
		super(name,id);
		this.hours = hours;
	}

	public double getSalary() {
		return hours;
	}

	public void setSalary(double salary) {
		this.hours = salary;
	}
		
	@Override
	public double getBiWeeklyPay() {
		double biWeeklyPay = hours * HOURS_WORKED;
		return biWeeklyPay;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nHourly Pay: " + hours + "BiWeeklyPay= " + getBiWeeklyPay();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
