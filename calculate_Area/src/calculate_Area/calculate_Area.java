package calculate_Area;

/** 
 * @Author Name: mrt
 * @Date: Feb 6, 2021
 * @Description: Program calculates the area of geometric shapes.
 */
//Imports
import java.util.Scanner;
//Begin Class calculate_Area
public class calculate_Area {

    // Begin Main Method
    public static void main(String[] args) {

        // Create new Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to choose an option from a set menu
        System.out.println("Please select an option from the following menu."
                + "\n");  

        System.out.println("1. Determine the Area of a Square");        
        System.out.println("2. Determine the Area of a Circle");
        System.out.println("3. Determine the Area of an Ellipse");
        System.out.println("4. Determine the Area of a Pentagon");
        System.out.println("5. Exit\n");
        
        // Capture user's choice and assign its int value to variable selection
        System.out.print("Enter the number of the desired option: ");
        int selection = sc.nextInt();

        if (selection == 1) {
            // Prompt user for side length and assign to variable squareSide
            System.out.print("\nTo determine the Area of a Square,\n"
                    + "enter a length for the Square's Side: ");
            double squareSide = sc.nextFloat();
            
            /* Print formula for Area of Square and assign value to variable
            sqaureArea */
            System.out.println("\nThe formula for the Area of a Square is:"
                    + " Area = Side^2\n");
            double squareArea = Math.pow(squareSide, 2);
                
            System.out.println("The Area of a Square with a Side length of "
                    + squareSide + " is: " + squareArea);           
        
        } else if (selection == 2) {
            // Prompt user for radius length and assign to variable circleRadius
            System.out.print("\nTo determine the Area of a Circle,\n"
                    + "enter a length for the Circle's Radius: ");
            double circleRadius = sc.nextFloat();
            
            /* Print Area of Circle formula and assign value to variable 
            circleArea */
            System.out.println("\nThe formula for the Area of a Circle is: "
                    + "Area = PI * Radius^2");
            double circleArea = Math.PI * Math.pow(circleRadius, 2);
                
            System.out.println("The Area of a Circle with a Radius length "
                    + "of " + circleRadius + " is: " + circleArea);
        
        } else if (selection == 3) {
            /* Prompt user for radius lengths and assign to variables 
            ellipseRadius1 and ellipseRadius2 */
            System.out.print("\nTo determine the Area of an Ellipse,\n"
                    + "enter a length for Radius 1 of the Ellipse: ");
            double ellipseRadius1 = sc.nextFloat();
            System.out.print("Enter a length for Radius 2 of the Ellipse: "
                    );
            double ellipseRadius2 = sc.nextFloat();
             
            /* Print Area of Ellipse formula and assign value to variable
            ellipseArea */
            System.out.println("\nThe formula for the Area of an Ellipse "
                    + "is: Area = PI * Radius 1 * Radius 2");
            double ellipseArea = Math.PI * ellipseRadius1 * ellipseRadius2;
                
            System.out.println("The Area of an Ellipse with Radius lengths "
                    + "of " + ellipseRadius1 + " and " + ellipseRadius2 +
                    " is: " + ellipseArea);            
        
        } else if (selection == 4) {
            // Prompt user for side length and assign to variable pentagonSide
            System.out.print("\nTo determine the Area of a Pentagon,\n"
                    + "enter the length of the Pentagon's Side: ");
            double pentagonSide = sc.nextFloat();
            
            /* Print Area of Pentagon formula and assign value to variable
            pentagonArea */
            System.out.println("\nThe formula for the Area of a Pentagon "
                    + "is: Area = 1/4√5(5+2√5) * Side^2");
            double pentagonArea = Math.sqrt(5 * (5 + 2 * 
                    (Math.sqrt(5)))) * Math.pow(pentagonSide, 2) / 4;
                
            System.out.println("The Area of a Pentagon with a Side length "
                    + "of " + pentagonSide + " is : " + pentagonArea);            
            
        } else if (selection == 5) {
            // Clean exit
            System.out.println("\nGoodbye\n");
            System.exit(0);            
            
        } else {
            // Error message for inputs outside of 1-5
            System.out.println("\nError: invalid entry.\n");
            System.exit(1);            
        }
        
//        switch (selection) {
//            case 1:
//                //Prompt user for side length and assign to variable squareSide
//                System.out.print("\nTo determine the Area of a Square,\n"
//                        + "enter a length for the Square's Side: ");
//                double squareSide = sc.nextFloat();
//               
//                /*Print formula for Area of Square and assign value to variable
//                squareArea*/
//                System.out.println("\nThe formula for the Area of a Square is:"
//                        + " Area = Side^2\n");
//                double squareArea = Math.pow(squareSide, 2);
//                
//                System.out.println("The Area of a Square with a Side length of "
//                        + squareSide + " is: " + squareArea);
//                break;
//                
//            case 2:
//                /* Prompt user for radius length and assign to variable 
//                circleRadius */
//                System.out.print("\nTo determine the Area of a Circle,\n"
//                        + "enter a length for the Circle's Radius: ");
//                double circleRadius = sc.nextFloat();
//                
//                /*Print formula for Area of Circle and assign value to variable
//                circleArea */
//                System.out.println("\nThe formula for the Area of a Circle is: "
//                        + "Area = PI * Radius^2");
//                double circleArea = Math.PI * Math.pow(circleRadius, 2);
//                
//                System.out.println("The Area of a Circle with a Radius length "
//                        + "of " + circleRadius + " is: " + circleArea);
//                break;
//                
//            case 3:
//                /*Prompt user for radius lengths and assign to variables
//                ellipseRadius1 and ellipseRadius2 */
//                System.out.print("\nTo determine the Area of an Ellipse,\n"
//                        + "enter a length for Radius 1 of the Ellipse: ");
//                double ellipseRadius1 = sc.nextFloat();
//                System.out.print("Enter a length for Radius 2 of the Ellipse: "
//                        );
//                double ellipseRadius2 = sc.nextFloat();
//                
//                /* Print formula for Area of Ellipse and assign value to 
//                variable ellipseArea */
//                System.out.println("\nThe formula for the Area of an Ellipse "
//                        + "is: Area = PI * Radius 1 * Radius 2");
//                double ellipseArea = Math.PI * ellipseRadius1 * ellipseRadius2;
//                
//                System.out.println("The Area of an Ellipse with Radius lengths "
//                        + "of " + ellipseRadius1 + " and " + ellipseRadius2 +
//                        " is: " + ellipseArea);
//                break;
//                
//           case 4:
//                /* Prompt user for side length and assign to variable 
//                pentagonSide */
//                System.out.print("\nTo determine the Area of a Pentagon,\n"
//                        + "enter the length of the Pentagon's Side: ");
//                double pentagonSide = sc.nextFloat();
//                
//                /* Print formula for Area of Pentagon and assign to variable
//                pentagonArea */
//                System.out.println("\nThe formula for the Area of a Pentagon "
//                        + "is: Area = 1/4√5(5+2√5) * Side^2");
//                double pentagonArea = Math.sqrt(5 * (5 + 2 * 
//                        (Math.sqrt(5)))) * Math.pow(pentagonSide, 2) / 4;
//                
//                System.out.println("The Area of a Pentagon with a Side length "
//                        + "of " + pentagonSide + " is : " + pentagonArea);
//                break;
//                    
//            case 5:
//                // Clean exit
//                System.out.println("\nGoodbye\n");
//                System.exit(0);
//                
//            default: 
//                // Error message for inputs outside of 1-5
//                System.out.println("\nError: invalid entry.\n");
//                System.exit(1);
//        }
        
    } //End Main Method

} //End Class calculate_Area