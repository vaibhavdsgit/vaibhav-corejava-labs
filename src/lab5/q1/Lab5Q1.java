package lab5.q1;

import java.util.Scanner;

class NotEligibleException extends Exception{
	public NotEligibleException() {
		super();
	}
	public NotEligibleException(String s) {
		super(s);
	}
}
public class Lab5Q1 {

	public static void main(String[] args) throws NotEligibleException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter yur age:");
		int age = sc.nextInt();
		try {
			if(age<15) {
				throw new NotEligibleException("You are not eligible as you are less than 15yrs of age");
			}
			else {
				System.out.println("You are eligible");
			}
		}catch(NotEligibleException e) {
			System.out.println(e.getMessage());
		}
	}
}
