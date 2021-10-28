package lab1.q6;

import java.util.Scanner;

public class App {
	public static double sumOfSquare(int num) {
		double sum=0;
		for(int i=1; i<=num; i++) {
			sum += Math.pow(i, 2);
		}
		return sum;
	}
	
	public static double squareOfSum(int num) {
		double sum=0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		return Math.pow(sum, 2);
	}
	
	public static double calculateDifference(int n) {
		double result = sumOfSquare(n) - squareOfSum(n);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println("Answer is: " + calculateDifference(num));
		
		sc.close();
	}
}
