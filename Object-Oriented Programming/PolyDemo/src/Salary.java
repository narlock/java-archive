
public class Salary extends Employee{
	private double salary;
	final int NUMBER_PAY_PERIODS = 26;

	public Salary(String name, int id, double salary) {
		super(name,id);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
		
	@Override
	public double getBiWeeklyPay() {
		double biWeeklyPay = (salary / NUMBER_PAY_PERIODS);
		return biWeeklyPay;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nHourly Pay: " + salary + "BiWeeklyPay= " + getBiWeeklyPay();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
