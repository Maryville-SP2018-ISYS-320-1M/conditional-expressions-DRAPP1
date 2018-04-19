/*
	ISYS 320 DONE DONE DONE DONE DONE
	Name(s):Dave Rapp
	Date: 4-18-18
*/


import java.util.Arrays;
import java.util.Scanner;

public class P3_Consecutive {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("This program calculates if three input values are consecutive.");
		String doItAgainResponse = "";

		do {
			System.out.print("Enter value 1: ");
			int num1 = console.nextInt();
			System.out.print("Enter value 2: ");
			int num2 = console.nextInt();
			System.out.print("Enter value 3: ");
			int num3 = console.nextInt();

			areConsecutiveNumbers(num1, num2, num3);

			System.out.print("Would you like to do it again (enter 'n' to quit)? ");
			doItAgainResponse = console.next();
		} while (!doItAgainResponse.equalsIgnoreCase("n"));
	}
	public static int areConsecutiveNumbers(int num1, int num2, int num3) {

		System.out.printf("a: %d, b: %d, c: %d -> ", num1, num2, num3);
		
		
		
		System.out.println("Thanks!");

		int[] test = new int[] {num1, num2, num3};
		Arrays.sort(test);
		
		
		for (int i = 0; i < test.length - 2; i++) {
			
			if(test[i] + 1 == test[i + 1]) {
				  System.out.println("Is consecutive");
			  }
		  if (test[i] + 1 != test[i + 1]) {
		    System.out.println("Is not consecutive");
		  }
		  
		  
		 
		  }
		
		
		
		
		return 0;

	}

}