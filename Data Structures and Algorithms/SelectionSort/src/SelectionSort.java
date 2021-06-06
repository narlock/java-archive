
public class SelectionSort {
	
	public static void selectionSort(double arr[]) {
		int i = 0, j = 0, smallest = 0;
		double temp = 0.0;
		
		for (i = 0; i < arr.length; i++) {
			smallest = i;
			for(j = 1; j < arr.length - 1; j++) {
				if(arr[j] < arr[smallest])
					smallest = j;
			}
			temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
	}
	
	
	
	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		
		double[] test = {5,4,6,3,2,1};
		
		ss.selectionSort(test);
		
		for(int i = 0; i < test.length; i++) {
			if(i == test.length - 1)
				System.out.print(test[i]);
			else
				System.out.print(test[i]+", ");
		}
	}
}
