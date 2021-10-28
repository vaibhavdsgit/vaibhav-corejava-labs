package lab1.q5;

import java.util.Scanner;

public class App {
	public static int calculateSum(int num) {
		int sum=0;
		for(int i=1; i<=num; i++) {
			if(i%3==0 || i%5==0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Addition is: " + calculateSum(num));
		
		sc.close();
	}
}
