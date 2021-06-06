package Loop;

public class NestedLoop {
	public static void displayPattern1() {
		System.out.println("======Pattern1======");
		for (int row = 1; row < 6; row++) {
			for (int i = 1; i <= row; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	public static void displayPattern2() {
		System.out.println("======Pattern2======");
		for (int row = 5; row > 0; row--) {
			for (int i = 1; i <= row; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	public static void displayPattern3() {
		System.out.println("======Pattern3==========");
	       for(int row=1;row<6;row++)
	       {
	           for(int space=1;space<=row;space++)
	               System.out.print(" ");
	           for(int i=1;i<=6 - row;i++)
	           {
	               System.out.print(i);
	           }
	           System.out.println(" ");
	       }
	}
	
	
	
	public static void main(String[] args) {
		NestedLoop.displayPattern1();
		NestedLoop.displayPattern2();
		NestedLoop.displayPattern3();
		
		   
		       
		   

	}
}
