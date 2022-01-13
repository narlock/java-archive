/**
 * @author Anthony
 */

import java.util.Scanner;
import java.util.Calendar;

public class OrderIceCreamTony {
	private String[] coneString = {"small cone", "medium cone", "large cone"};
	private double[] conePrice = {3.99, 4.99, 5.99};
	
	private String[] cupString = {"small cup", "medium cup", "large cup"};
	private double[] cupPrice = {3.50, 4.50, 5.50};
	
	private int[] numberOfToppings = {4,6,8};
	private int[] toppingChoices;
	private String[] toppings = {"Sprinkles","Fruit","Chocolate Chips","Cookie Dough","Butter Fingers","Oreo","Whipped Cream","Hot Fudge Drizzle","Caramel Drizzle","Maraschino Cherries"};
	
	private String[] flavors = {"Vanilla","Chocolate","Mint","Strawberry","Chocolate Chip Cookie Dough","Chocolate Vanilla Swirl"};
	
	public Customer customer = new Customer();
	public Scanner input = new Scanner (System.in);
	
	private boolean repeat;
	
	public void getInformation() {
		repeat = false;
		
		System.out.println("----------\nENTER INFORMATION\n----------");
		System.out.println("Enter your name: ");
		customer.setUsername(input.nextLine());
        	
        System.out.println("Enter your phone number: ");
        customer.setNumber(input.nextLine().replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3"));
            
        System.out.println("Would you like to sign up for an account before you start your order?\nType YES or NO: ");
        if(input.nextLine().toLowerCase().equals("yes")) {
        	signUp();
        } else {
        	startWithOrder();
        }
	}
	
	public void signUp() {
		System.out.println("Enter your email: ");
		customer.setEmail(input.nextLine());
		
		System.out.println("Enter a password for your account: ");
		customer.setPassword(input.nextLine());
		
		System.out.println("Enter home address: ");
		customer.setAddress(input.nextLine());
		
		System.out.println("Enter City: ");
		customer.setCity(input.nextLine());
		
		System.out.println("Enter State: ");
		customer.setState(input.nextLine());
		
		System.out.println("Enter Zipcode: ");
		customer.setZip(input.nextInt());
		input.nextLine();
		
		startWithOrder();
	}
	
	public void startWithOrder() {
		if (repeat == false)
			System.out.println("Great! Let's get you started with your order!");  
		
		System.out.println("Smash'd Creamery Ice Cream!\n-----------\n");
		System.out.println("---- MENU -----");
		for(int i = 0; i < coneString.length; i++)
			System.out.println(coneString[i] + " | " + conePrice[i] + " | " + numberOfToppings[i]);
		for(int i = 0; i < cupString.length; i++)
			System.out.println(cupString[i] + " | " + cupPrice[i] + " | " + numberOfToppings[i]);
		System.out.println("---- FLAVORS ----- ");
		for(int i = 0; i < flavors.length; i++)
			System.out.print(flavors[i] + " | ");

		boolean correct = false;
		while(correct == false) {
			System.out.println("\nChoose your size\n1 for small\n2 for medium\n3 for large ");
			customer.getCustomerOrder().setSize(input.nextInt());
			
			if(customer.getCustomerOrder().getSize() == 1 || customer.getCustomerOrder().getSize() == 2 || customer.getCustomerOrder().getSize() == 3) {
				correct = true;
				break;
			}
			System.out.println("Invalid, try again");
		}
		
		input.nextLine();
		correct = false;
		while(correct == false) {
			System.out.println("\n\nWould you like a Cup or Cone?\nType Cup or Cone");
			customer.getCustomerOrder().setCupOrCone(input.nextLine());
			
			if(customer.getCustomerOrder().getCupOrCone().toLowerCase().equals("cup") || customer.getCustomerOrder().getCupOrCone().toLowerCase().equals("cone")) {
				correct = true;
				break;
			}
			System.out.println("Invalid, try again");
		}
		
		correct = false;
		System.out.println("\n\nChoose your Ice Cream Flavor");
		for (int i = 0; i < flavors.length; i++) {
			System.out.println((i+1) + " for " + flavors[i]);
		}
		while(correct == false) {
			customer.getCustomerOrder().setFlavor(input.nextInt());
			
			if(customer.getCustomerOrder().getFlavor() == 1 || customer.getCustomerOrder().getFlavor() == 2 || customer.getCustomerOrder().getFlavor() == 3 || customer.getCustomerOrder().getFlavor() == 4 || customer.getCustomerOrder().getFlavor() == 5 || customer.getCustomerOrder().getFlavor() == 6) {
				correct = true;
				break;
			}
			System.out.println("Invalid, try again");
			System.out.println("Choose your Ice Cream Flavor");
			for (int i = 0; i < flavors.length; i++) {
				System.out.println((i+1) + " for " + flavors[i]);
			}
		}
		
		toppingChoices = new int[numberOfToppings[customer.getCustomerOrder().getSize() - 1]];
		System.out.println("\n\nChoose up to " + numberOfToppings[customer.getCustomerOrder().getSize() - 1] + " toppings!");
		for (int i = 0; i < toppings.length; i++) {
			System.out.println((i+1) + " for " + toppings[i]);
		}
		
		for(int i = 0; i < numberOfToppings[customer.getCustomerOrder().getSize() - 1]; i++) {
			boolean check = false;
			
			while(check == false) {
				toppingChoices[i] = input.nextInt();
				if(toppingChoices[i] <= 10 && toppingChoices[i] >= 1) {
					check = true;
					break;
				}
				
				System.out.println("Invalid, try again");
				System.out.println("\n\nChoose up to " + numberOfToppings[customer.getCustomerOrder().getSize() - 1] + " toppings!");
				for (int j = 0; j < toppings.length; j++) {
					System.out.println((j+1) + " for " + toppings[j]);
				}
			}
			
		}
		
		System.out.printf("%s, below is your receipt:\n\n", customer.getUsername());
        
        System.out.print("SMASH'D CREAMERY\n");
        System.out.print("10427 North St\nSuite 103\nFairfax, VA 22030\n (571) 762-0295\n");
        System.out.print("---------------------------\n");
        System.out.printf("%s\t\t%s\n\n", customer.getUsername(), customer.getNumber());
        System.out.println(customer.getCustomerOrder().toString());
     

		for(int i = 0; i < toppingChoices.length; i++) {	
				System.out.println("Topping #" + (i+1) + " " + toppings[toppingChoices[i] - 1]);
		}
		
	}
}
