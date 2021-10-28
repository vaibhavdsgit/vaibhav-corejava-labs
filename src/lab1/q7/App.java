package lab1.q7;

import java.util.Scanner;

public class App {
	public static boolean checkNumber(int number) {
		int temp=10;
		while(number!=0) {
			int digit = number%10;
			if(digit <= temp) {
				temp = digit;
			}
			else {
				return false;
			}
			number = number/10;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a series of number: ");
		int num = sc.nextInt();
		
		if(checkNumber(num)) {
			System.out.println(num + " is an increasing number");
		}
		else {
			System.out.println(num + " is not an increasing number");
		}
		sc.close();
	}
}
