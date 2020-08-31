package week2Test;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num==0) {
			System.out.println("Number is neither negative nor positive");
		}
		else if (num > 0) {
			System.out.println("Number is positive");
			}
		else {
			System.out.println("Number is negative");
		}
	}
}
