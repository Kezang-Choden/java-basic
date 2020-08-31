package week2Test;

import java.util.Scanner;

public class week2Test {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num < 0) {
			System.out.println("Enter Positive interger!!");
		}
		else {
			for(int i=1;i<=10;i++) {
				int result = num * i;
				System.out.println(num + "*" + i +"="+ result);
			}
		}

	}

}
