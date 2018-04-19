/*
	ISYS 320
	Name(s):Dave Rapp
	Date: 4-18-18
*/

/*    public static boolean consecutive(int num1, int num2, int num3) {
		int small=Math.min(num1, Math.min(num2,num3));
		return (num1+num2+num3 ==small+(small+1)+ (small+2)); }
		
---------------------------------------------------------------------------------
		
		public boolean consecutive(int a, int b, int c) {
    int max = Math.max(a, Math.max(b, c));
    int min = Math.min(a, Math.min(b, c));
    int mid = a + b + c - max - min;
    
    return max == mid + 1 && mid == min + 1;
}
 --------------------------------------------------------------------------------
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

	// function call
	public static int areConsecutiveNumbers(int num1, int num2, int num3) {

		System.out.printf("a: %d, b: %d, c: %d -> ", num1, num2, num3);
		System.out.println("Thanks!");

		int[] test = new int[] {num1, num2, num3};
		Arrays.sort(test);
		for (int i = 0; i < test.length - 2; i++) {
		  if (test[i] + 1 != test[i + 1]) {
		    System.out.println("Is not consecutive");
		  }
		  if(test[i] + 1 == test[i + 1]) {
			  System.out.println("Is consecutive");
		  }
		}
		return 0;

	}

}