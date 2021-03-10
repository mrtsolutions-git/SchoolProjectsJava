package calculate_Utility;

/**
 * @Author Name: MikeExplores
 * @Description: Program takes input for current and previous meter readings to
 * calculate Power Bill including 3 separate usage rates and tax.
 */
//Imports
import java.util.Scanner;
//Begin Class calculate_Utility
public class calculate_Utility {

    //Begin Main Method
    public static void main(String[] args) {

        //Declarations
        double prevReading;
        double curReading;
        final double RATE_A = 0.0809;
        final double RATE_B = 0.091;
        final double RATE_C = 0.109;
        final double TAXES = 0.0346;
        double usageRate;
        String ans;

        // Create new Scanner object
        Scanner sc = new Scanner(System.in);
        
        do {
            //Take user input for previous and current readings
            System.out.printf("Welcome to the Power Bill Calculator\n\nPlease "
                    + "enter your previous meter reading in KwHs: ");
            prevReading = sc.nextDouble();

            System.out.printf("Please enter your current meter reading in "
                    + "KwHs: ");
            curReading = sc.nextDouble();

            //Assign calculated value using input parameters
            double usage = calcUsage(curReading, prevReading);
        
            //Evaluate usage and assign to variable usageRate
            if (usage <= 500) {
                usageRate = RATE_A;
            //Print values for variables for RATE_B
            } else if (usage > 500 & usage <= 900) {
                usageRate = RATE_B;
            //Print values for variables for RATE_C
            } else {
                usageRate = RATE_C;
            }
            
            double subtotal = calcSubtotal(usage, usageRate);
            double taxation = calcTax(subtotal, TAXES);
            double total = subtotal + taxation;
            
            //Print all figures
            System.out.printf("\nYour usage was: %.1f KwHs\nYour rate was: "
            + "$%.4f/KwH\nYour subtotal is: $%.2f\nTaxes are: $%.2f"
            + "\nYour total bill for the month is: $%.2f\n", usage, 
            usageRate, subtotal, taxation, total);
                 
            //Prompt user to run again or exit
            System.out.print("\n\nRun program again? (Y for Yes, N for No): ");
            ans = sc.next();
        } while (ans.equalsIgnoreCase("Y"));
        
        // Clean exit
        System.out.printf("\nGoodbye!\n");
        System.exit(0);

    } //End Main Method

    /**
     * Method: calcUsage()
     * @param: pR
     * @param: cR
     * @return: Return usage total
     */
    private static double calcUsage(double pR, double cR) {
        return pR - cR;
    }//End calcUsage method

    /**
     * Method: calcSubtotal()
     * @param: use
     * @param: useRate
     * @return: Return subtotal
     */
    private static double calcSubtotal(double use, double useRate) {
        return use * useRate;
    }//End calcSubtotal method

    /**
     * Method: calcTax()
     * @param: sub
     * @param: tax
     * @return: Return tax
     */
    private static double calcTax(double sub, double tax) {
        return sub * tax;
    }//End calcTax method
    
} //End Class calculate_Utility
