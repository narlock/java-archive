
public class SortDemo {
	//O(n^2) - it's slow, but it gets the job done.
	public static void bubbleSort(int[] numbers) {
		boolean swapDone = false;
		
		while(!swapDone) {
			swapDone = true;
			
			for(int i = 0; i < numbers.length - 1; i++) {
				
				if(numbers[i] > numbers[i + 1]) {
					int temp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
					swapDone = false;
				}
			}
		}
	}
	
	public static void bubbleSort(double[] numbers) {
		boolean swapDone = false;
		
		while(!swapDone) {
			swapDone = true;
			
			for(int i = 0; i < numbers.length - 1; i++) {
				
				if(numbers[i] > numbers[i + 1]) {
					double temp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
					swapDone = false;
				}
			}
		}
	}
	
	public static void bubbleSort(String[] names) {
		boolean swapDone = false;
		
		while(!swapDone) {
			swapDone = true;
			
			for(int i = 0; i < names.length - 1; i++) {
				
				if(names[i].compareTo(names[i+1]) > 1) {
					String temp = names[i];
					names[i] = names[i+1];
					names[i+1] = temp;
					swapDone = false;
				}
			}
		}
	}

	public static void display(int[] arr) {
		for(int i : arr) {
			System.out.println(i + " ");
		}
		System.out.print("");
	}
	
	public static void display(double[] arr) {
		for(double i : arr) {
			System.out.println(i + " ");
		}
		System.out.print("");
	}
	
	public static void display(String[] arr) {
		for(String i : arr) {
			System.out.println(i + " ");
		}
		System.out.print("");
	}
	
	public static void main(String[] args) {
		int[] list = {4,5,1,12,2,3};
		System.out.println("Before sort: ");
		display(list);
		
		bubbleSort(list);
		System.out.println("After sort: ");
		display(list);
		
		
		double[] doubleList =  {2.53, 3.78, 9, 1, 2};
		System.out.println("Before sort: ");
		display(doubleList);
		
		bubbleSort(doubleList);
		System.out.println("After sort: ");
		display(doubleList);
		
		String[] stringList =  {"sam","josh","john","adam"};
		System.out.println("Before sort: ");
		display(stringList);
		
		bubbleSort(stringList);
		System.out.println("After sort: ");
		display(stringList);
	}



}
