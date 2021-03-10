package random_Array;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Michael Tofteland
 * @Assignment Name: mtofteland_week7
 * @Date: Mar 6, 2021
 * @Description: Program populates an array of user-defined size with random
 * grade percentages. The scores at each index are then printed along with their
 * letter grade. Additionally, the lowest and highest scores are also printed
 * along with the overall average.
 */
//Imports
import java.util.Scanner;
import static java.lang.Math.*;
//Begin Class random_Array

public class random_Array {

    //Begin Main Method
    public static void main(String[] args) {

        //Declarations
        String ans;
        int userLength;

        // Create new Scanner object
        Scanner sc = new Scanner(System.in);

        do {
            //Prompt user for array length
            System.out.printf("Please enter a number between 1 and 99 for the "
                    + "quantity of grades to check: ");
            userLength = sc.nextInt();

            //Ensure user input is within range
            while (userLength <= 0 || userLength >= 100) {
                System.out.printf("A number between 1 and 99 is required: ");
                userLength = sc.nextInt();
            }

            //Instantiate gradeList array
            double[] gradeList = new double[userLength];

            //Populate array with random elements 
            gradeList = randArray(gradeList);

            //Print letter grades and percent scores from array
            findLetter(gradeList);

            //Print max, min, and average of the array
            System.out.printf("\n\nThe highest grade is: %4.2f\nThe lowest "
                    + "grade is: %4.2f\nThe average is: %4.2f",
                    findMax(gradeList), findMin(gradeList), findAvg(gradeList));

            //Prompt user to run again or exit
            System.out.print("\n\nRun program again? (Y for Yes, N for No): ");
            ans = sc.next();
        } while (ans.equalsIgnoreCase("Y"));

        // Clean exit
        System.out.printf("\nGoodbye!\n");
        System.exit(0);

    } //End Main Method

    /**
     * Method: randArray() Assigns random element values at array indexes
     *
     * @param: gList
     * @return: Initialized array with random double values
     */
    private static double[] randArray(double[] gList) {

        int min = 55;
        int max = 100;
        for (int i = 0; i < gList.length; i++) {
            gList[i] = random() * (max - min) + min;
        }
        return gList;

    }//End randArray method

    /**
     * Method: findLetter() Assigns letter grade to array elements
     *
     * @param: gList
     */
    private static void findLetter(double[] gList) {

        for (int i = 0; i < gList.length; i++) {
            String letterGrade;
            if (gList[i] >= 92.45) {
                letterGrade = "an A";
            } else if (gList[i] < 92.45 && gList[i] >= 89.45) {
                letterGrade = "an A-";
            } else if (gList[i] < 89.45 && gList[i] >= 86.45) {
                letterGrade = "a B+";
            } else if (gList[i] < 86.45 && gList[i] >= 82.45) {
                letterGrade = "a B";
            } else if (gList[i] < 82.45 && gList[i] >= 79.45) {
                letterGrade = "a B-";
            } else if (gList[i] < 79.45 && gList[i] >= 76.45) {
                letterGrade = "a C+";
            } else if (gList[i] < 76.45 && gList[i] >= 72.45) {
                letterGrade = "a C";
            } else if (gList[i] < 72.45 && gList[i] >= 69.45) {
                letterGrade = "a C-";
            } else if (gList[i] < 69.45 && gList[i] >= 66.45) {
                letterGrade = "a D+";
            } else if (gList[i] < 66.45 && gList[i] >= 62.45) {
                letterGrade = "a D";
            } else if (gList[i] < 62.45 && gList[i] >= 59.45) {
                letterGrade = "a D-";
            } else {
                letterGrade = "an F";
            }

            System.out.printf("\nGrade %d: %4.2f is %s", (i + 1), gList[i],
                    letterGrade);
        }

    }//End findLetter method

    /**
     * Method: findMax() Finds element with highest value within an array
     *
     * @param: gList
     * @return: Element with highest value of array
     */
    private static double findMax(double[] gList) {

        double maximum = gList[0];
        for (int i = 0; i < gList.length; i++) {
            if (gList[i] > maximum) {
                maximum = gList[i];
            }
        }
        return maximum;

    }//End findMax method

    /**
     * Method: findMin() Finds element with lowest value within an array
     *
     * @param: gList
     * @return: Element with lowest value of array
     */
    private static double findMin(double[] gList) {

        double minimum = gList[0];
        for (int i = 0; i < gList.length; i++) {
            if (gList[i] < minimum) {
                minimum = gList[i];
            }
        }
        return minimum;

    }//End findMin method

    /**
     * Method: findAvg() Finds average of all elements within an array
     *
     * @param: gList
     * @return: Average value of all elements within an array
     */
    private static double findAvg(double[] gList) {

        double total = 0;
        for (int i = 0; i < gList.length; i++) {
            total += gList[i];
        }
        return total / gList.length;

    }//End findAvg method

} //End Class random_Array
