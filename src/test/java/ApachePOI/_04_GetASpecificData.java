package ApachePOI;

import java.util.Scanner;

public class _04_GetASpecificData {
    /**
     * Write the code that gives a specific data that the user wants
     * E.g. When user types username print the username from the excel file
     */

    public static void main(String[] args) {
        System.out.println("What do you want to search for?");
        Scanner scanner = new Scanner(System.in);
        String userResponse = scanner.nextLine();

        /**
         * Check the value in the first cell of each row
         * If that value matches with the user's response
         * Print all values on that row
         **/
    }
}
