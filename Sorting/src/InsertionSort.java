
public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 13, 11, 12, 5, 6 };
		// {11, 13, 12, 5, 6}
		// {11, 12, 13, 5, 6}
		//
		System.out.println("Before Sorting ....");

		for (int num : arr) {
			System.out.print(num + " ");
		}

		arr = insertionSort(arr);

		System.out.println();

		System.out.println("After Sorting ....");

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	private static int[] insertionSort(int[] arr) {

		int key, j = 0;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;

			System.out.println();

			for (int num : arr) {
				System.out.print(num + " ");
			}
		}
		return arr;
	}

}
