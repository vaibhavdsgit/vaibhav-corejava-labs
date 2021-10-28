package lab2.q3;

import java.util.Arrays;

public class App {
	
	public static int[] getSorted(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int num=arr[i];
			int reverse = 0;
			while(num != 0) {
				int digit = num % 10;
				reverse = (reverse*10) + digit;
				num = num/10;					
			}
			arr[i] = reverse;
		}
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {1234, 789, 6543};
		int[] array = getSorted(arr);
		for(Integer x:array) {
			System.out.println(x);
		}
	}

}
