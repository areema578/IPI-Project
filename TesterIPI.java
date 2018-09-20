package projectIPI;

import java.util.Scanner;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - 
 * Inputs: 
 * Output: 
 */
public class TesterIPI {
    
    public static void main(String[] args) {
        int selection;
        
        do {
        System.out.println("Make a selection from our Dessert Menu\n1.Sour Patch"
                + " Kids- 99 cents a lb\n2.Choclate Chip Cookie- 399 per dozen\n"
                + "3.Ice cream- 1.00 per scoop, 1.00 per topping");
        Scanner in = new Scanner(System.in);
        selection = in.nextInt();
        
        if ( selection == 1) {
            
        } else if (selection == 2) {
            
        } else if (selection == 3) {
            
        }
        in.close();
        }while (selection == 4);
        
        
    }
}
