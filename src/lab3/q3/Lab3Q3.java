package lab3.q3;

import java.util.Scanner;

public class Lab3Q3 {
	
	public static String alterString(String string) {
		char[] charArr = string.toCharArray();
		String result="";
		//System.out.println(charArr.length);
		for(int i=0; i<charArr.length; i++) {
			if(charArr[i]!='a'|| charArr[i]!='e' || charArr[i]!='i' || charArr[i]!='o' || charArr[i]!='u') {
				charArr[i] = (char)(charArr[i]+1);
			}
			result = result + charArr[i];
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String string = sc.nextLine();		//JAVA
		System.out.println(alterString(string));	//KAWA
		sc.close();
	}

}
