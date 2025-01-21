
import java.util.*;

class UserInput{
	int [] userInput(){
	Scanner scan = new Scanner(System.in);
	int[] numbers = new int[2];

	System.out.println("Enter first Number : ");
	numbers[0] = scan.nextInt();

	System.out.println("Enter second Number : ");
	numbers[1] = scan.nextInt();

	return numbers;

	}

	int [] userInput1(){
		Scanner scan = new Scsnner(System.in);
		int number = new int;

		System.out.println("Enter a number :");
		number = scan.nextInt();
		return number;
	}
}