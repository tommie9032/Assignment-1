class Calculator{




	int addition(){
	
	int [] numbers;
	UserInput input = new UserInput();
	numbers = input.userInput();

	int sum = numbers[0] + numbers[1];
	
	

	return sum;

	}

	int subtraction(){
		int [] numbers;
		UserInput input = new UserInput();
		numbers = input.userInput();

		int dif = numbers[0]-numbers[1];

		return dif;
	}

	int multiplication(){
		
		int [] numbers;
		UserInput input = new UserInput();
		numbers = input.userInput();

		int mul = numbers[0]*numbers[1];

		return mul;
	}

	int division(){
		int [] numbers;
		UserInput input = new UserInput();
		numbers = input.userInput();

		if (numbers[0] == 0){
			System.out.println("Cannot divide by 0!");
			return 0;
		}
		else {
			int div = numbers[0]/numbers[1];

			return div;
		}
		


		
	}

	void fibonacci(){
		UserInput input = new UserInput();
		int n=input.userInput1();


		switch(n){
		case 1:
			System.out.println("0");
			break;
		case 2:
			System.out.println("0 1");
			break;
		default :
			int first = 0;
			int second = 1;
			System.out.println(first+" ");
			System.out.println(second+" ");


			for(int i = 3; i <= n; i++){
				int next = first + second ;
				System.out.println(next + " ");
				first = second;
				second = next;
				
			}

		}

	}


	void sumarr(int x){



		int [] arrays;
		UserInput input = new UserInput();
		arrays = input.userInput2(x);

		int sum = 0;

		for(int i = 0;i < x;i++){

			sum = sum + arrays[i];

		}

		System.out.println("Sum of Elements in Array : "+sum);
		double avg = sum/x;
		System.out.println("Average of Elements : "+avg);



	}

}