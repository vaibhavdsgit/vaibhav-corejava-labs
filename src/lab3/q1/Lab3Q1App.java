package lab3.q1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab3Q1App {
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
        int temp,sum=0;
        
        System.out.println("Enter series of numbers:");
        String str=sc.nextLine();
        sc.close();
        StringTokenizer ref=new StringTokenizer(str," ");
        while(ref.hasMoreTokens())
        {
        	temp=Integer.parseInt(ref.nextToken());
        	System.out.println(temp);
        	sum+= temp;        	
        }
        System.out.println("sum: "+sum);
	}
}
