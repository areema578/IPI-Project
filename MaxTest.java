/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectIPI;
import java.util.ArrayList;
import java.util.Scanner;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - To order desserts and to print out the receipt
 * Inputs: Dessert selections
 * Output: Dessert receipt displaying all items and different costs
 */
public class MaxTest {
    

    public static void main(String[] args) {
        
        Candy twizzlers = new Candy(4.00 , "Twizzlers");
        Cookie cookie = new Cookie(12);
        IceCream strawberry = new IceCream(2,"Strawberry Ice Cream");
        IceCream vanilla = new IceCream(20, "Vanilla Ice Cream");
        Candy snickers = new Candy(500, "Snickers");
        Candy starBurst = new Candy(200, "Starburst");
        Sundae berryChoc = new Sundae( 10,"StrawBerry Chocalate Sundae");
        
        System.out.println("1st Comparison Test");
        System.out.println("Price of 4 lbs of Twizzlers Candy "
        		+" @" + String.format("$%.2f", twizzlers.getCost())  + " vs. "
                + "12 Vanilla Wafer Cookies" + " @" + String.format("$%.2f", cookie.getCost()) );
        System.out.println("\n---comparing---\n");
        cookie.setName("Vanilla Wafer");
        System.out.println(DessertItem.max(twizzlers, cookie).name + "(s) cost more.\n");  
        
        System.out.println("2nd Comparison Test");
        twizzlers.setWeight(50);
        cookie.setQty(20);
        System.out.println("Price of 50 lbs of Twizzlers Candy @" + String.format("$%.2f",twizzlers.getCost()) + " vs. "
                + "20 Vanilla Wafer Cookies @" + String.format("$%.2f",cookie.getCost()) + "\n");
        System.out.println("\n---comparing---\n");
        System.out.println(DessertItem.max(cookie, twizzlers).name + "(s) cost more.\n");
        
        
        System.out.println("3rd Comparison Test");
        System.out.println("Price of 2 Strawberry Ice Cream @"
        		+ String.format("$%.2f",strawberry.getCost()) +" vs. "
                + "20 Vanilla Icecream @" + String.format("$%.2f",vanilla.getCost()));

        System.out.println("\n---comparing---\n");
        System.out.println(DessertItem.max(strawberry, vanilla));
        
        System.out.println("4th Comparison Test");

        System.out.println("Price of 500 lbs of Snickers @"
        		+ String.format("$%.2f",snickers.getCost()) +" vs. "
                + "200 lbs of Starburst @" + String.format("$%.2f",starBurst.getCost()));
        System.out.println("\n---comparing---\n");
        System.out.println(DessertItem.max(snickers, starBurst).name + " cost more.\n");
        
        
        System.out.println("5th Comparison Test");

        System.out.println("Price of 10 Strawberry Chococalte Sundaes @"
        		+ String.format("$%.2f",berryChoc.getCost()) +" vs. "
                + "200 lbs of Starburst @" + String.format("$%.2f",starBurst.getCost()));
        System.out.println("\n---comparing---\n");
        System.out.println(DessertItem.max(berryChoc, starBurst).name + " cost more.\n");
        
        System.out.println("--Sorting ArrayList Test--\n");
        ArrayList<DessertItem> DessertList = new ArrayList<DessertItem>(); // creates DessertList
        DessertList.add(snickers); // adds DessertItems to ArrayList
        DessertList.add(cookie);
        DessertList.add(strawberry);
        DessertList.add(vanilla);
        DessertList.add(twizzlers);
        DessertList.add(berryChoc);
        
        
        
        //prints Dessert items in ArrayList out of order
        for( DessertItem x : DessertList) {
        	System.out.println(" "+ x.name + " @" + String.format("$%.2f",x.getCost()));
        }
        
        System.out.println("");
        
        //sorting list of Dessert items from price least to greatest
        
        boolean notSorted = true; // gate to get out of loop once list is sorted
        
        while(notSorted) { // loop to swap stops when entire list is sorted
        	notSorted = false;
        	for(int i = 0; i < DessertList.size()-1; i++) {	 // loops through entire list
        		  if(DessertList.get(i).compareTo(DessertList.get(i+1)) > 0) { //compares current index with next index.
        			  DessertItem temp = DessertList.get(i+1);  //swaps two DessertItems
        			  DessertList.set(i+1, DessertList.get(i)); 
        			  DessertList.set(i, temp);
        			  notSorted = true;
        		  }
        	}
        }
        
        //prints Dessert items in ArrayList out of order
        for( DessertItem x : DessertList) {
        	System.out.println(" "+ x.name + " @" + String.format("$%.2f",x.getCost()));
        }
        
    }
}