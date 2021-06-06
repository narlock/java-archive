
public class HotDogStand {
	
	private int id;
	private int hotDogsSold;
	private static int totalHotDogsSold;
	
	public HotDogStand() {
		this.setId(0);
		this.hotDogsSold = 0;
	}
	
	public HotDogStand(int id, int hotDogsSold) {
		this.setId(id);
		this.hotDogsSold = hotDogsSold;
		this.totalHotDogsSold += hotDogsSold;
	}
	
	public void justSold() {
		this.hotDogsSold++;
		this.totalHotDogsSold++;
	}
	
	public static int getTotalHotDogsSold() {
		return totalHotDogsSold;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
