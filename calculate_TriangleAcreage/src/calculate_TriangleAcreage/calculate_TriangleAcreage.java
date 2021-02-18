package calculate_TriangleAcreage;

/** 
 * @Author Name: mrtsolutions-git
 * @Date: Jan 31, 2021
 * @Description: Program calculates and outputs hypotenuse and total acreage.
 */
//Imports
import java.util.Scanner;
import static java.lang.Math.*;
//Begin Class calculate_TriangleAcreage
public class calculate_TriangleAcreage {

    //Begin Main Method
    public static void main(String[] args) {

        // Declare and initialize variable acreSquareFeet
        final double ACRE_SQUARE_FEET = 43560.0;
        
        // Create Scanner object.
        Scanner input = new Scanner(System.in);

        // Ask user to input Side A (Base)        
        System.out.print("Please enter Side A in feet: ");
        double sideA = input.nextDouble();

        //Ask user to input Side B (Height)
        System.out.print("Please enter Side B in feet: ");
        double sideB = input.nextDouble();

        //Calculate length of Side C and assign to variable sideC
        double sideC = Math.sqrt((pow(sideA, 2) + pow(sideB, 2)));

        //Print length of Side C (Hypontenuse) 
        System.out.println("Side C is equal to " + sideC + " feet.");

        //Calculate acreage and assign to variable acreage
        double acreage = ((sideA * sideB)/ 2) / ACRE_SQUARE_FEET;

        //Print total acreage
        System.out.println("The total acreage is: " + acreage + " acres.");        

    } //End Main Method

} //End Class calculate_TriangleAcreage