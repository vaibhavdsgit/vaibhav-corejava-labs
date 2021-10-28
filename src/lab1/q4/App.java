package lab1.q4;

import java.util.Scanner;

public class App {
	public static boolean isPrime(int z) {
		if(z==2) {
			return false;
		}
		else {
			for(int i=2; i<z; i++) {
				if(z%i == 0) {
					return false;
				}
			}
		return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		for(int z=2; z<=num; z++) {
			if(isPrime(z)) {
				System.out.println(z);
			}
		}
		sc.close();
	}
}
