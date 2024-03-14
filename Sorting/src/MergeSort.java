import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();	
		
		int[] inputArr = new int[10];
		
		for(int i=0; i<inputArr.length; i++) {
			inputArr[i] = rand.nextInt(10000);
		}
		
		printArrays(inputArr);
		
		mergeSort(inputArr);
		
		printArrays(inputArr);
		System.out.println("Done");
	}

	private static void mergeSort(int[] inputArr) {
		
		
		int n = inputArr.length;
		
		if(n < 2) {
			return;
		}
		
		int mid = n/2;
		
		int[] leftArr = new int[mid];
		
		int[] rightArr = new int[n-mid];
		
		for(int i=0;i<mid;i++) {
			leftArr[i] = inputArr[i];
		}
		
		for(int i=mid;i<n;i++) {
			rightArr[i-mid] = inputArr[i];
		}
		
//		printArrays(leftArr);
//		printArrays(rightArr);
		
		mergeSort(leftArr);
		mergeSort(rightArr);
		
		merge(inputArr, leftArr, rightArr);
//		System.out.println("end dividing");
		
	}
	
	private static void merge(int[] inputArr, int[] leftArr, int[] rightArr) {
		
		int leftHalf = leftArr.length;
		int rightHalf = rightArr.length;
		
		int i = 0, j = 0, k = 0;
		
		while(i < leftHalf && j < rightHalf) {
			if(leftArr[i] < rightArr[j]) {
				inputArr[k] = leftArr[i];
				i++;
			} else {
				inputArr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		while(i < leftHalf) {
			inputArr[k] = leftArr[i];
			i++;
			k++;
		}
		while(j < rightHalf) {
			inputArr[k] = rightArr[j];
			j++;
			k++;
		}
		
	}

	private static void printArrays(int[] inputArr) {
		System.out.println();
		for(int arr: inputArr) {
			System.out.print(arr + " ");
		}
		System.out.println();
		System.out.println("==============");
	}

}
