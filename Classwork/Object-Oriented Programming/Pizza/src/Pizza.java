
public class Pizza {
	private int size, numCheese, numPep, numHam;
	
	public double calcCost() {
		double price = 0;
		switch (this.size) {
		case 0:
			price += 10;
			break;
		case 1:
			price += 12;
			break;
		case 2:
			price += 14;
			break;
		default:
			System.err.println("Invalid size.");
			break;
		}
		
		price = price + (this.numCheese * 2);
		price = price + (this.numPep * 2);
		price = price + (this.numHam * 2);
		
		return price;
	}
	
	public String getDescription() {
		String sizeStr = "", str;
		switch (this.size) {
		case 0:
			sizeStr = "Small";
			break;
		case 1:
			sizeStr = "Medium";
			break;
		case 2:
			sizeStr = "Large";
			break;
		default:
			System.err.println("Invalid size.");
		}
		
		str = "Pizza Size: " + sizeStr + ", "
				+ "\nQuantity of Cheese: " + this.numCheese + ", "
				+ "\nQuantity of Pepperoni: " + this.numPep + ", "
				+ "\nQuantity of Ham: " + this.numHam;
				
		return str;
	}
	
	public Pizza() {
		size = 0;
		numCheese = 0;
		numPep = 0;
		numHam = 0;
	}
	
	public Pizza(int size, int numCheese, int numPep, int numHam) {
		this.size = size;
		this.numCheese = numCheese;
		this.numPep = numPep;
		this.numHam = numHam;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNumCheese() {
		return numCheese;
	}

	public void setNumCheese(int numCheese) {
		this.numCheese = numCheese;
	}

	public int getNumPep() {
		return numPep;
	}

	public void setNumPep(int numPep) {
		this.numPep = numPep;
	}

	public int getNumHam() {
		return numHam;
	}

	public void setNumHam(int numHam) {
		this.numHam = numHam;
	}
	
	@Override
	public boolean equals(Object object) {
		if(!(object instanceof Pizza)) {
			System.err.println("Error: Incompatable types - must pass Pizza Object");
			return false;
		}
		
		//Down casting
		Pizza p = (Pizza)object;
		boolean isEqual = (this.size == p.size
				&& this.numCheese == p.numCheese
				&& this.numPep == p.numPep
				&& this.numHam == p.numHam);
			
		return isEqual;
	}
	
	@Override
	public String toString() {
		String PizzaInfo = " Size: " + this.size
				+ "\n Quantity of Cheese: " + this.numCheese
				+ "\n Quantity of Pepperoni: " + this.numPep
				+ "\n Quantity of Ham: " + this.numHam;
		return PizzaInfo;
	}
	
	
}
