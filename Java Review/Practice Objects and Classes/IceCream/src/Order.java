
public class Order {
	private String cupOrCone;
	private int size;
	private int flavor;
	
	private String[] flavors = {"Vanilla","Chocolate","Mint","Strawberry","Chocolate Chip Cookie Dough","Chocolate Vanilla Swirl"};
	
	public Order() {
		this.cupOrCone = null;
		size = -1;
		flavor = -1;
	}

	public String getCupOrCone() {
		return cupOrCone;
	}

	public void setCupOrCone(String cupOrCone) {
		this.cupOrCone = cupOrCone;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getFlavor() {
		return flavor;
	}

	public void setFlavor(int flavor) {
		this.flavor = flavor;
	}
	
	public String getSizeFromIntSize() {
		if(size == 1)
			return "Small";
		else if (size == 2)
			return "Medium";
		else 
			return "Large";
	}
	
	@Override
	public String toString() {
		return "Cup/Cone: " + cupOrCone +
				"\nSize: " + getSizeFromIntSize() +
				"\nFlavor: " + flavors[flavor - 1];
	}
	
}
