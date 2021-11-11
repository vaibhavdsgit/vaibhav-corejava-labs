package lab5.q2;

import java.util.Scanner;

class NullPointerException extends Exception{
	public NullPointerException(){
		super();
	}
	public NullPointerException(String s) {
		super(s);
	}
}

public class Lab5Q2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws NullPointerException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String firstName = sc.nextLine();
		
		System.out.println("Enter Last Name:");
		String lastName = sc.nextLine();
		
		try {
			if(firstName == "" || lastName == "") {
				throw new NullPointerException("Name cannot be null");
			}
			else {
				System.out.println("We have your data stored successfully");
			}
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
