package lab1.q8;

import java.util.Scanner;

public class App {
	public static boolean checkNumber(int n) {
		while(n!=1) {
			if(n%2 != 0) {
				return false;
			}
			n = n/2;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(checkNumber(num)) {
			System.out.println(num + " is power of 2");
		}
		else {
			System.out.println(num + " is not a power of 2");
		}
		
		sc.close();
	}
}
