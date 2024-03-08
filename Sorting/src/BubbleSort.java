
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		System.out.println("Before Sorting ....");
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		arr = bubbleSort(arr);
		
		
		
		System.out.println("After Sorting ....");
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}

	private static int[] bubbleSort(int[] arr) {
		int temp = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr.length-i-1; j++) {
				
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

}
