
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

	int userInput1(){
		Scanner scan = new Scanner(System.in);
		int num ;

		System.out.println("Enter a number :");
		num = scan.nextInt();
		return num;
	}

	int [] userInput2(int x){
		Scanner scan = new Scanner(System.in);
		int[] numbers1 = new int[x];

		for(int i = 0;i < x;i++){
			System.out.println("Enter number "+ (i+1) + " :");
			numbers1[i] = scan.nextInt();

		}
		return numbers1;
	}
}