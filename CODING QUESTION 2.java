package quiz2;

import java.util.Scanner;

public class QUESTION2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int reversed = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		num = input.nextInt();
		
		while(num != 0) {
			
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;
		      
		      num /= 10;
		    }

		System.out.println("The reverse is: " + reversed);

	}

}
