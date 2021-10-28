package lab2.q1;

public class App {
	
	
	public static int getSecondSmallest(int[] arr) {
		int smallest = arr[0];
		int second=100000000;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<smallest) {
				second = smallest;
				smallest = arr[i];
				
			}
			else if(arr[i]<second && arr[i]!=smallest) {
				second = arr[i];
			}
		}
		return second;
		
	}

	public static void main(String[] args) {
		int[] arr = {10, 30, 70, 20, 40, 50};
		System.out.println(getSecondSmallest(arr));
	}

}
