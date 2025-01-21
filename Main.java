// Main.java
// Name : Tom Thomas
// PRN : 23070126136
// Batch : AIML B3

import java.util.Scanner; // Importing the Scanner class to take user input

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); // Scanner object to read options from the user
        Calculator cal = new Calculator(); // Creating a Calculator object to perform operations

        while (true) { // Infinite loop for continuously showing the menu
            // Displaying the main menu to the user
            System.out.println("MENU \n1) Calculator \n2) Fibonacci \n3) Sum of Array Elements \n4) Exit! ");
            int choice = scan.nextInt(); // Reading the user's menu choice

            // Switch statement to handle menu options
            switch (choice) {
                case 1: // Calculator functionality
                    System.out.println("Calculator Menu : ");
                    System.out.println("a) Addition ");
                    System.out.println("b) Subtraction");
                    System.out.println("c) Multiplication ");
                    System.out.println("d) Division ");
                    System.out.println("e) EXIT! ");
                    char option = scan.next().charAt(0); // Reading the calculator operation choice

                    // Switch statement to handle specific calculator operations
                    switch (option) {
                        case 'a': // Perform addition
                            int sum = cal.addition();
                            System.out.println("Sum of two Numbers : " + sum);
                            break;
                        case 'b': // Perform subtraction
                            int sub = cal.subtraction();
                            System.out.println("Difference of two Numbers : " + sub);
                            break;
                        case 'c': // Perform multiplication
                            int mul = cal.multiplication();
                            System.out.println("Product of two Numbers : " + mul);
                            break;
                        case 'd': // Perform division
                            int div = cal.division();
                            System.out.println("Quotient of two Numbers : " + div);
                            break;
                        case 'e': // Exit calculator menu
                            break;
                        default: // Handle invalid option
                            System.out.println("Invalid Option!!!!");
                            break;
                    }
                    break; // Exit the calculator menu

                case 2: // Fibonacci sequence functionality
                    cal.fibonacci(); // Call the fibonacci method
                    break;

                case 3: // Sum and average of array elements
                    System.out.println("Enter Number of Elements in Array : ");
                    int x = scan.nextInt(); // Read the number of elements
                    cal.sumarr(x); // Call the sumarr method with the given input
                    break;

                case 4: // Exit the program
                    System.out.println("Exiting...");
                    return; // Exit the main method and terminate the program

                default: // Handle invalid main menu choices
                    System.out.println("Invalid Choice!!!! Please try again.");
            }
        }
    }
}
