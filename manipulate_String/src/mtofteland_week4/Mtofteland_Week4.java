package mtofteland_week4;

/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Michael Tofteland
 * @Assignment Name: mtofteland_week4
 * @Date: Feb 14, 2021
 * @Description: This program accepts a string input from the user and 
 * manipulates it based on the user's menu choice.
 */
//Imports
import java.util.Scanner;
import static java.lang.Math.*;
//Begin Class Mtofteland_Week4
public class Mtofteland_Week4 {

    //Begin Main Method
    public static void main(String[] args) {

         // Create new Scanner object
        Scanner sc = new Scanner(System.in);
        
        //Prompt user for string and assign to variable userString
        System.out.println("Please enter a paragraph of text to manipulate\n");
        String userString = sc.nextLine();
        
        // Prompt user to choose an option from a set menu
        System.out.println("\nPlease select an option from the following menu."
                + "\n");  

        System.out.println("1. Convert to all uppercase letters");        
        System.out.println("2. Convert to all lowercase letters");
        System.out.println("3. Display the length of the paragraph");
        System.out.println("4. Select a substring from the paragraph");
        System.out.println("5. Select random substring from the paragraph");
        System.out.println("6. Exit\n");
        
        // Capture user's choice and assign its int value to variable selection
        System.out.print("Enter the number of the desired option: ");
        int selection = sc.nextInt();
        
          switch (selection) {
            case 1:
                //Print formatted value of userString converted to uppercase
                System.out.printf("\n%s\n", userString.toUpperCase());
                break;
            
            case 2:    
                //Print formatted value of userString converted to lowercase
                System.out.printf("\n%s\n", userString.toLowerCase());
                break;
                
            case 3:               
                //Print length of variable userString using the length() method
                System.out.printf("\nThe length of your paragraph is: %d "
                        + "characters & spaces.\n", userString.length());
                break;
                
           case 4:
                /* Prompt user for beginning character and assign to variable 
               indexBegin */
                System.out.printf("\nSelect a starting point between 0 and %d "
                        + ": ", userString.length());
                int indexBegin = sc.nextInt();
                
                /* Prompt user for ending character and assign to variable 
               indexEnd */
                System.out.printf("\nSelect an end point between %d and %d : ", 
                        indexBegin, userString.length());
                int indexEnd = sc.nextInt();

                // Print selected substring between indexBegin and indexEnd 
                System.out.printf("\nYour selected substring is:\n%s\n", 
                        userString.substring(indexBegin, indexEnd));             
                break;

            case 5:
                /* Define value for ending index between 0 and stringLength via
                the random method and assign to variable randomEnd */
                double randomEnd = random() * userString.length();

                /* Define value for starting index between 0 and randomEnd via
                the random method and assign to variable randomBegin */
                double randomBegin = random() * randomEnd;
                
                //Print the random indexes
                System.out.printf("\nRandom starting point is: %d\nRandom end "
                        + "point is: %d\n", (int)randomBegin, (int)randomEnd);
                
                System.out.printf("\nYour random substring is:\n%s\n", 
                        userString.substring((int)randomBegin, (int)randomEnd));
                break;
                
            case 6:
                // Clean exit
                System.out.printf("\nGoodbye\n");
                System.exit(0);
                
            default: 
                // Error message for inputs outside of 1-5
                System.out.printf("\nError: invalid entry.\n");
                System.exit(1);
        }
        
    } //End Main Method

} //End Class Mtofteland_Week4