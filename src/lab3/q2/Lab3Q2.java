package lab3.q2;

import java.util.Scanner;

public class Lab3Q2 {

	public static StringBuffer getImage(String string) {
		StringBuffer revString = new StringBuffer(string);
		return revString.reverse();
		//System.out.println(revString);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string;
		System.out.println("Enter the String: ");	
		string = sc.nextLine();		//EARTH
		
		System.out.println(string+"|"+getImage(string));	//EARTH|HTRAE
		
		sc.close();
	}
}
