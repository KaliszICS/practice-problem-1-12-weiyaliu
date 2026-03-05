import java.util.Scanner;
/**
 * File: Converting Data Types
 * Author: Weiya Liu
 * Date Created: Mar 4, 2026
 * Date Last Modified: Mar 4, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input an integer: ");
		int num1 = input.nextInt();

		int num2 = (num1 + 3);

		System.out.println(num2);

		input.close();
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		String num1 = input.nextLine();
		
		String num2 = num1+"4";	
		double num3 = Double.parseDouble(num2);
		num3 = num3 + 2;

		System.out.println(num3);

		input.close();

	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a radius: ");
		double num1 = input.nextDouble();

		double num2 = num1;
		
		System.out.println(3.14*(Math.pow(num2, 2))); //5 ^ 2

		input.close();

	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		double num1 = input.nextDouble();

		double num2 = (num1*12);

		System.out.println(Math.floor(num2));
		
		input.close();
	}

}
