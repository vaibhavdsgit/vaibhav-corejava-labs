package lab3.q8;

public class Lab3Q8 {

	public static boolean ascCheck(String string) {
		boolean check=true;
		char[] arr = string.toCharArray();
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				check=false;
				break;
			}
		}
		return check;
		
	}
	public static void main(String[] args) {
		String string = "ANT";
		System.out.println(ascCheck(string)); // ANT gives true, ANB gives false
	}

}
