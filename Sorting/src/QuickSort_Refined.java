import java.util.Random;

public class QuickSort_Refined {

	public static void main(String[] args) {

		Random rand = new Random();

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}

		System.out.println("Before...");

		printArrays(arr);

		quickSort(arr, 0, arr.length - 1);

		System.out.println("\nAfter...");

		printArrays(arr);

	}

	private static void quickSort(int[] arr, int start, int end) {
		if (start >= end)
			return;

		int pivot = partition(arr, start, end);

		quickSort(arr, start, pivot - 1);
		quickSort(arr, pivot + 1, end);
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i = start - 1;

		for (int j = start; j < end; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;
		return i;
	}

	private static void printArrays(int[] arr) {
		for (int nums : arr) {
			System.out.print(nums + " ");
		}
	}

}
