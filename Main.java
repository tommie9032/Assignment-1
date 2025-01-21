//Main.java
//Name : Tom Thomas
//PRN : 23070126136
//Batch : AIML B3



import java.util.Scanner;

class Main{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in); //Scanner object to read option from the user
	
	Calculator cal = new Calculator();

		while (true){

		System.out.println("MENU \n1)Calculator \n2)Fibonacci \n3)Sum of Array Elements \n4)Exit! ");
		int choice = scan.nextInt();



		switch (choice){

		case 1:
			System.out.println("Calculator Menu : ");
			System.out.println("a) Addition ");
			System.out.println("b) Subtraction");
			System.out.println("c) Multiplication ");
			System.out.println("d) Division ");
			System.out.println("e) EXIT! ");
			char option=scan.next().charAt(0);

			switch(option){
			case 'a':
				int sum = cal.addition();
				System.out.println("Sum of two Numbers : "+sum);
				break;
			case 'b':
				int sub = cal.subtraction();
				System.out.println("Difference of two Numbers : "+sub);
				break;

			case 'c':
				int mul = cal.multiplication();
				System.out.println("Product of two Numbers : "+mul);
				break;

			case 'd':
				int div = cal.division();
				System.out.println("Quotient of two Numbers : "+div);
				break;

			case 'e':
				break;

			default:
				System.out.println("Invalid Option!!!!");
				break;

			}
			break;




		case 2:


			cal.fibonacci();
			break;

		case 3:
			System.out.println("Enter Number of Elements in Array : ");
			int x = scan.nextInt();
			cal.sumarr(x);
			break;

		case 4:
    	System.out.println("Exiting...");
    	return; // Exit the program


		}
	}

	}
}