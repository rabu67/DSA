
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 13, 11, 12, 5, 6 };

		System.out.println("Before Sorting ....");

		for (int num : arr) {
			System.out.print(num + " ");
		}

		arr = selectionSort(arr);
		
		System.out.println();
		
		System.out.println("After Sorting ....");

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	private static int[] selectionSort(int[] arr) {
		int minIndex = 0;
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			System.out.println();
			for (int num : arr) {
				System.out.print(num + " ");
			}
		}
		return arr;
	}

}
