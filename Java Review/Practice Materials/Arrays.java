/*
 * Author: Anthony Narlock
 * 
 * Description: This Java file describes a basic understanding of arrays inside of OOP
 * 
 * An array is one of the most basic data structures inside of programming. It is a 
 * simple list in which has a length, and many things can be done with these lists called arrays
 */

public class Arrays {
	public static void main(String[] args) {
		//Ways to declare arrays in Java
		int array1[];
		array1 = new int[20]; //Assigns array1 to a length of 20
		
		int array2[] = new int[20]; //Assigns array2 to a length of 20, one line
		
		int array3[] = {3, 1, 4}; //Assigns array3 to length 3, with 3 already set elements
		
		//You can make different types of arrays.
		//The type of array is dependent on which primitive or Object you want an array of
		String strArr[] = new String[3]; //This is an array of String (which is an Object in Java) assigned to length of 3.
		
		//Assign a single element in array
		strArr[0] = "Hello";
		strArr[1] = " World";
		strArr[2] = "!";
		
		//You can use a for loop to iterate through Array
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i]);
			if(i == strArr.length - 1) {
				System.out.print("\n");
			}
		}
		
		//For loops are useful because you can set entire arrays like this instead of manually
		for(int i = 0; i < array1.length; i++) {
			array1[i] = i;
			
			if(i != 19) {
				System.out.print(array1[i] + ", ");
			} else {
				System.out.print(array1[i]);
			}
			
			if(i == array1.length - 1) {
				System.out.print("\n");
			}
		}
		
	}

	//CodingBat Array Practice Problems: Array-1 (Java)
	
	/*
	 * firstLast6
	 * 
	 * Given an array of ints, return true if 6 appears as either the first or last element in array. The array will be length 1 or more
	 */
	public boolean firstLast6(int[] nums) {
		if(nums[0] == 6 || nums[nums.length - 1] == 6) {
			return true;
		}
		return false;
	}
	
	/*
	 * sameFirstLast
	 * 
	 * Given an array of ints, return true if the array is length 1 or more, and the first element and last element are equal
	 */
	public boolean sameFirstLast(int[] nums) {
		if(nums.length > 0 && nums[0] == nums[nums.length - 1])
			return true;
		else return false;
	}
	
	/*
	 * biggerTwo
	 * 
	 * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the
	 * largest sum. In event of a tie, return a.
	 */
	public int[] biggerTwo(int[] a, int[] b) {
		int sumA = a[0] + a[1];
		int sumB = b[0] + b[1];
		  
		if(sumA == sumB)
			return a;
		
		if(sumA > sumB) {
			return a;
		} else {
			return b;
		}
	}
	
	//CodingBat Array Practice Problems: Array-2 (Java)
	
	/*
	 * countEvens
	 * 
	 * Return the number of even ints in the given array.
	 */
	public int countEvens(int[] nums) {
		int evenCount = 0;
		  
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				evenCount++;
			}
		}
		  
		return evenCount;
	}
	
	/*
	 * fizzArray2
	 * 
	 * Given a number n, create and return a new string array of length n, containing the strings "0","1" "2" .. through n-1.
	 * N may be 0, in which case just return a length 0 array.
	 */
	
	public String[] fizzArray2(int n) {
		if(n == 0) {
			String[] arr = {};
			return arr;
		}
		  
		String[] arr = new String[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = String.valueOf(i);
		}
		return arr;	  
	}

	/*
	 * tripleUp
	 * 
	 * Return true if the array contains, somewhere, three increasing adjacent numbers like ....
	 * 4, 5, 6, ... or 23, 24, 25.
	 */
	
	public boolean tripleUp(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(i == nums.length - 1 || i == nums.length - 2) {
				return false;
			}
		    
			if(nums[i+1] == nums[i] + 1 && nums[i+2] == nums[i] + 2) {
		    	return true;
			}
		}
		return false;
	}

}


