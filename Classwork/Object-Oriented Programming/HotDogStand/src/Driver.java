import java.util.Random;

public class Driver {
	public static void main(String[] args) {
		Random rand = new Random();
		HotDogStand s1 = new HotDogStand(rand.nextInt(10000),10);
		HotDogStand s2 = new HotDogStand(rand.nextInt(10000),1);
		HotDogStand s3 = new HotDogStand(rand.nextInt(10000),20);
		HotDogStand s0 = new HotDogStand();
		
		System.out.println(s1.getTotalHotDogsSold());
		s1.justSold();
		System.out.println(s1.getTotalHotDogsSold());
		System.out.println(s1.getId());
		System.out.println(s0.getId());
	}
}
