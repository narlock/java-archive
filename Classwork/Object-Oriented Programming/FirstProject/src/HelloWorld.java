import java.text.NumberFormat;

public class HelloWorld {
	NumberFormat nf = NumberFormat.getCurrencyInstance();
	
	public static void bubbleSort(int[] numbers) {
		
		boolean done = false;
		
		while (!done) {
			
			for(int i = 0; i < numbers.length - 1; i++) {
				if(numbers[i] > numbers[i+1]) {
					int tmp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = tmp;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; ++i) 
			numbers[i] = i * 2;
		
		for(int i = 0; i < numbers.length; ++i)
			System.out.print(numbers[i] / 2 + "");
		
		System.out.println();
		
		
	}
}
