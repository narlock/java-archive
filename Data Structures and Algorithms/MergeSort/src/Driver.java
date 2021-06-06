
public class Driver {
	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		
		int[] unsortedIntegerArray = {6,5,7,8,5,1,3};
		
		System.out.println("Before Merge Sort");
		for (int i = 0; i < unsortedIntegerArray.length; i++) {
			System.out.print(unsortedIntegerArray[i]);
		}
		
		ms.sort(unsortedIntegerArray);
		
		System.out.println("\nAfter Merge Sort");
		for (int i = 0; i < unsortedIntegerArray.length; i++) {
			System.out.print(unsortedIntegerArray[i]);
		}
	}
}
