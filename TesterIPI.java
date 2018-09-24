package projectIPI;

import java.util.Scanner;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - To order desserts and to print out the receipt
 * Inputs: Dessert selections
 * Output: Dessert receipt displaying all items and different costs
 */
public class TesterIPI {
    
    public static void main(String[] args) {
    	Checkout receipt = new Checkout();
        int selection;
        do {
        System.out.println("Make a selection from our Dessert Menu:" 
        		+ "\n1. Candy- 89 cents per lb." 
        		+ "\n2. Cookie- $3.99 per dz." 
        		+ "\n3. Ice cream- $1.50."
                + "\n4. Get your receipt.");
        Scanner in = new Scanner(System.in);
        selection = in.nextInt();
        Scanner pick = new Scanner(System.in);
        Scanner amountChoice = new Scanner(System.in);
        if (selection == 1) {
        	System.out.println("What candy would you like? Please enter candy name: ");
        	String candyName = pick.nextLine().trim();
        	System.out.println("How many lbs of candy would you like: ");
        	double amount = amountChoice.nextDouble();
        	DessertItem candy = new Candy(amount);
        	candy.setName(candyName);
        	receipt.enterItem(candy);
            System.out.println("Added " + candyName);
        } else if (selection == 2) {
        	System.out.println("What cookie would you like? Please enter type of cookie: ");
        	String cookieType = pick.nextLine().trim();
        	System.out.println("How many cookies would you like: ");
        	int amount = amountChoice.nextInt();
        	DessertItem cookie = new Cookie(amount);
        	cookie.setName(cookieType);
        	receipt.enterItem(cookie);
            System.out.println("Added " + cookieType);
        } else if (selection == 3) {
        	Scanner choice = new Scanner(System.in);
        	System.out.println("What ice cream flavor would you like: ");
        	String iceCreamFlavor = pick.nextLine().trim();
        	System.out.println("Would you like to make your ice cream a sundae for 65 cents more?\nEnter yes or no."); 
        	String input = choice.nextLine().trim();
        	if(input.equals("yes")) {
        		Scanner sundaeChoice = new Scanner(System.in);
        		System.out.println("What topping would you like: ");
        		String sundaeTopping = sundaeChoice.nextLine().trim();
            	DessertItem sundae = new Sundae();
            	sundae.setName(sundaeTopping + " Sundae with\n" + iceCreamFlavor + " Ice Cream");
            	receipt.enterItem(sundae);
                System.out.println("Added " + sundaeTopping + " Sundae with " + iceCreamFlavor + " Ice Cream");
        	}else {
        		DessertItem iceCream = new IceCream();
        		iceCream.setName(iceCreamFlavor + " Ice Cream");
        		receipt.enterItem(iceCream);
                System.out.println("Added " + iceCreamFlavor + " Ice Cream");
        	}
        }
        }while (selection != 4);
        System.out.println("Here is your receipt:\n");
        System.out.println(receipt);
    }
}
