package lab5.q3;

import java.util.Scanner;

class EmployeeException extends Exception{
	public EmployeeException() {
		super();
	}
	public EmployeeException(String s) {
		super(s);
	}
}
public class Lab5Q3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		try {
			if(salary<3000) {
				throw new EmployeeException("Your salary is less than 3000");
			}
			else {
				System.out.println("Your salary is more than 3000");
			}
		}catch(EmployeeException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}

