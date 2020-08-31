package week2Test;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch (num) {
		case 0:
			System.out.print("Monday");
			break;
		case 1:
			System.out.print("Tuesday");
			break;
		case 2:
			System.out.print("Wednesday");
			break;
		case 3:
			System.out.print("Thrusday");
			break;
		case 4:
			System.out.print("Friday");
			break;
		case 5:
			System.out.print("Saturday");
			break;
		case 6:
			System.out.print("Sunday");
			break;
		default:
			break;
		}

	}

}
