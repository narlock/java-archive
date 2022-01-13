
public class Customer {
	private String username;
	private String number;
	private String email;
	private String password;
	private String address;
	private String city;
	private String state;
	private int zip;
	
	private Order customerOrder;
	
	public Customer() {
		this.username = null;
		this.number = null;
		this.email = null;
		this.password = null;
		this.address = null;
		this.city = null;
		this.state = null;
		this.zip = -1;
		
		this.customerOrder = new Order();
		
	}
	
	public Customer(String username, String number, String email, String password, String address, String city, String state, int zip) {
		this.username = username;
		this.number = number;
		this.email = email;
		this.password = password;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		
		this.customerOrder = new Order();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return "Username: " + username +
				"\nNumber: " + number +
				"\nEmail: " + email +
				"\nAddress: " + address +
				"\nCity: " + city +
				"\nState: " + state +
				"\nZip: " + zip;
	}

	public Order getCustomerOrder() {
		return customerOrder;
	}

	public void setCustomerOrder(Order customerOrder) {
		this.customerOrder = customerOrder;
	}
	
}
