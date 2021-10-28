package lab1.q1;

import java.util.Scanner;

public class App {

	static int cube(int num) {
		int sum = 0;
		
		while(num != 0) {
			int digit = num % 10;
			sum = sum + digit*digit*digit;
			num = num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Sum of cube of digit is: " + cube(num));
		
		sc.close();
	}

}
