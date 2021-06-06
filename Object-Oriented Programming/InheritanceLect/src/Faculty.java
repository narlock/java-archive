
public class Faculty extends Person {
	private String title;
	
	public Faculty(String name, String address, String title) {
		super(name, address);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}
	
	
}
