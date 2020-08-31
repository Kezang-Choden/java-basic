package week2Test;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		System.out.println("Enter a number between -1000 to 1000:");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		while(num1 < -1000 || num1 > 1000) {
			System.out.println("Your number should be between -1000 to 1000!!");
			 num1 = input.nextInt();
		}
		System.out.println("Enter a number again between -1000 to 1000:");
		int num2 = input.nextInt();
		  while(num2 < -1000 || num2 > 1000 ) {
			System.out.println("Your number should be between -1000 to 1000!!");
			num2 = input.nextInt();
		}
		
			int add = num1 + num2;
			int sub = num1 - num2;
			int mul = num1 * num2;
			int div = num1 / num2;
			System.out.println(num1+"+"+num2+"="+add);
			System.out.println(num1+"-"+num2+"="+sub);
			System.out.println(num1+"*"+num2+"="+mul);
			System.out.println(num1+"/"+num2+"="+div);
		

	}

}
