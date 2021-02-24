package calculate_Factorial;

/** 
 * @Author Name: mrt
 * @Date: Feb 20, 2021
 * @Description: This program calculates factorial value of integers with a
 * starting value of 1 and an ending value equal to a user input
 */
//Imports
import java.util.Scanner;
import java.math.BigInteger;
//Begin Class calculate_Factorial
public class calculate_Factorial {

    //Begin Main Method
    public static void main(String[] args) {
        
        //Declarations
        int selection;
        int userValue;
        String ans;

        // Create new Scanner object
        Scanner sc = new Scanner(System.in);
        
        //Take user selection from menu
        System.out.printf("Hello! This program calculates factorials.\n\n1. Run"
                + " Program\n2. Exit Program\n\nPlease select an option: ");
        selection = sc.nextInt();
        
        switch (selection) {
            case 1:
                do {
                    //Assign user input to variable userValue
                    System.out.printf("\nThe starting number is 1.\nPlease "
                            + "enter an ending integer value: ");
                    userValue = sc.nextInt();
                    
                    /* For loop to calculate each iteration's value from 1 
                    through variable userValue using factorial method */
                    for(int i = 1; i <= userValue; ++i) {
                        System.out.printf("\n%d! = %d", i, 
                                factorial(i));
                    }
                    
                    /* Prompt user to find factorial values for iterations 
                    through a new userValue input or exit program via case 2 */
                    System.out.print("\n\nRun again? (Y for Yes, N for No): ");
                    ans = sc.next();
                } while (ans.equalsIgnoreCase("Y"));   
            
            case 2:    
                // Clean exit
                System.out.printf("\nGoodbye!\n");
                System.exit(0);
                
            default: 
                // Error message for inputs outside of 1-2
                System.out.printf("\nError: invalid entry.\n");
                System.exit(1);
        }
        
    } //End Main Method
    
    /** Method: factorial() 
     * @params: uV     
     * @return: Return factorial
     */
    private static BigInteger factorial(int uV) {
        //Set variable factorial value to constant of 1
        BigInteger factorial = BigInteger.ONE;
        /* Factorial value multiplies by value of i, i is incremented with each 
        loop iteration through uV value */
        for(int i = 1; i <= uV; ++i) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        } return factorial;
    }//End factorial method
    
} //End Class calculate_Factorial