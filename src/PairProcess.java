//Start with the code below and create a program that will output the sum, product and average of num1 and num2.
//If the calculated sum is over 200, print an asterisk next to the sum.

import java.util.Scanner;

public class PairProcess {
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "First Number? :" );
		num1 = keyboard.nextInt();
		
		System.out.print( "Last Number?  :" );
		num2 = keyboard.nextInt();
		
		int sum = (num1 + num2);
		String sumString = sum + "";
		
		if (sum > 200){
			sumString += "*";
		}
		if (sum < 1000){
			sumString += "~";
		}
		
		System.out.println("The sum is " + sumString);
		System.out.println("The average is " + ((num1+num2)/2));
		System.out.println("The product is " + (num1*num2));
	}
}