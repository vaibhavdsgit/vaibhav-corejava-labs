package lab1.q2;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for red");
		System.out.println("Enter 2 for yellow");
		System.out.println("Enter 3 for green");
		System.out.print("Your input: ");
		int n = sc.nextInt();
		
		switch(n) {
		case 1: System.out.println("STOP");break;
		case 2: System.out.println("READY"); break;
		case 3: System.out.println("GO"); break;
		default: System.out.println("Enter valid input");
		}
		
		sc.close();
	}
}
