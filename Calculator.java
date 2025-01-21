class Calculator {

    // Method to perform addition of two numbers
    int addition() {
        int[] numbers; // Array to store two numbers
        UserInput input = new UserInput(); // Create UserInput object
        numbers = input.userInput(); // Get two numbers from the user

        int sum = numbers[0] + numbers[1]; // Calculate the sum of the two numbers

        return sum; // Return the result
    }

    // Method to perform subtraction of two numbers
    int subtraction() {
        int[] numbers; // Array to store two numbers
        UserInput input = new UserInput(); // Create UserInput object
        numbers = input.userInput(); // Get two numbers from the user

        int dif = numbers[0] - numbers[1]; // Calculate the difference between the two numbers

        return dif; // Return the result
    }

    // Method to perform multiplication of two numbers
    int multiplication() {
        int[] numbers; // Array to store two numbers
        UserInput input = new UserInput(); // Create UserInput object
        numbers = input.userInput(); // Get two numbers from the user

        int mul = numbers[0] * numbers[1]; // Calculate the product of the two numbers

        return mul; // Return the result
    }

    // Method to perform division of two numbers
    int division() {
        int[] numbers; // Array to store two numbers
        UserInput input = new UserInput(); // Create UserInput object
        numbers = input.userInput(); // Get two numbers from the user

        // Check if the first number is 0 to avoid division by zero
        if (numbers[0] == 0) {
            System.out.println("Cannot divide by 0!"); // Display error message
            return 0; // Return 0 if division by zero is attempted
        } else {
            int div = numbers[0] / numbers[1]; // Calculate the quotient of the two numbers

            return div; // Return the result
        }
    }

    // Method to generate the Fibonacci sequence
    void fibonacci() {
        UserInput input = new UserInput(); // Create UserInput object
        int n = input.userInput1(); // Get the number of terms in the sequence from the user

        // Handle different cases for the Fibonacci sequence
        switch (n) {
            case 1:
                System.out.println("0"); // Print the first term if n=1
                break;
            case 2:
                System.out.println("0 1"); // Print the first two terms if n=2
                break;
            default:
                int first = 0; // Initialize the first term
                int second = 1; // Initialize the second term
                System.out.println(first + " "); // Print the first term
                System.out.println(second + " "); // Print the second term

                // Loop to calculate and print the remaining terms
                for (int i = 3; i <= n; i++) {
                    int next = first + second; // Calculate the next term
                    System.out.println(next + " "); // Print the next term
                    first = second; // Update the first term
                    second = next; // Update the second term
                }
        }
    }

    // Method to calculate the sum and average of an array of numbers
    void sumarr(int x) {
        int[] arrays; // Array to store the numbers
        UserInput input = new UserInput(); // Create UserInput object
        arrays = input.userInput2(x); // Get the numbers from the user

        int sum = 0; // Initialize the sum to 0

        // Loop to calculate the sum of all elements in the array
        for (int i = 0; i < x; i++) {
            sum = sum + arrays[i];
        }

        System.out.println("Sum of Elements in Array : " + sum); // Print the sum
        double avg = (double) sum / x; // Calculate the average
        System.out.println("Average of Elements : " + avg); // Print the average
    }
}
