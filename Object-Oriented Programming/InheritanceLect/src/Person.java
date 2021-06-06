
public class Person {
	private String name;
	private String address;
	private String starId;
	
	public Person() {
		System.out.println("Inside person()");
	}
	
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		this.starId = starId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStarId() {
		return starId;
	}
	public void setStarId(String starId) {
		this.starId = starId;
	}
	
	@Override
	public String toString() {
		return "Name: " + name
			+ "\nAddress: " + address
			+ "\nstarID: " + starId;
	}
	
	
	
	
}
