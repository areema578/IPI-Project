/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectIPI;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author howar
 */
public class MaxTest {
    

    public static void main(String[] args) {
        
        Candy twizzlers = new Candy(4.00 , "Twizzlers");
        Cookie cookie = new Cookie(12);
        System.out.println("1st Comparison Test");
        System.out.println("Price of 4 lbs of Twizzlers Candy "
        		+" @" + twizzlers.getCost()  + " vs. "
                + "12 Vanilla Wafer Cookies" + " @" + cookie.getCost() );
        
        System.out.println("\n---comparing---\n");

        cookie.setName("Vanilla Wafer");
        System.out.println(DessertItem.max(twizzlers, cookie).name + "(s) cost more.\n");  
        
        System.out.println("2nd Comparison Test");
        twizzlers.setWeight(50);
        cookie.setQty(20);
        System.out.println("Price of 50 lbs of Twizzlers Candy @" + twizzlers.getCost() + " vs. "
                + "20 Vanilla Wafer Cookies @" + cookie.getCost() + "\n");
        System.out.println("\n---comparing---\n");
        System.out.println(DessertItem.max(cookie, twizzlers).name + "(s) cost more.\n");
        
        
        System.out.println("3rd Comparison Test");
        System.out.println("Price of 2 Vanilla Ice Cream vs. "
                + "20 Chocalte Icecream");
        IceCream strawberry = new IceCream(2,"Strawberry Ice Cream");
        
        IceCream vanilla = new IceCream(20, "Vanilla Ice Cream");
        
        System.out.println("\n---comparing---\n");
        System.out.println(DessertItem.max(strawberry, vanilla));
        
        System.out.println("4th Comparison Test");
        System.out.println("Price of 500 lbs of Snickers vs. "
                + "200 lbs of Starburst");
        Candy snickers = new Candy(500, "Snickers");
        
        Candy starBurst = new Candy(200, "Starburst");
        
        System.out.println("\n---comparing---\n");
        System.out.println(DessertItem.max(snickers, starBurst));
        ArrayList<DessertItem> DessertList = new ArrayList<DessertItem>();
        DessertList.add(snickers);
        DessertList.add(cookie);
        DessertList.add(strawberry);
        DessertList.add(vanilla);
        DessertList.add(twizzlers);
        
        
        //prints Dessert items in ArrayList out of order
        for( DessertItem x : DessertList) {
        	System.out.println(" "+ x.name + " at $" + x.getCost());
        }
        
        System.out.println("");
        
        //sorting
        
        boolean notSorted = true;
        
        while(notSorted) {
        	notSorted = false;
        	for(int i = 0; i < DessertList.size()-1; i++) {	
        		  if(DessertList.get(i).compareTo(DessertList.get(i+1)) > 0) {
        			  DessertItem temp = DessertList.get(i+1); 
        			  DessertList.set(i+1, DessertList.get(i));
        			  DessertList.set(i, temp);
        			  notSorted = true;
        		  }
        	}
        }
        
        //prints Dessert items in ArrayList out of order
        for( DessertItem x : DessertList) {
        	System.out.println(" "+ x.name + " at $" + x.getCost());
        }
        
        
        
        
    }
}