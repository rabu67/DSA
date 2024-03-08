
public class BinarySearch {

	public static void main(String[] args) {
		
		//array should sorted for binary search
		int[] nums = { 1, 2, 4, 6, 7, 9, 10 };
		int target = 10;

		int targetIndex = binarySearch(nums, target);

		if (targetIndex != -1)
			System.out.println("Element found at index ---> " + targetIndex);
		else
			System.out.println("Element not found");
	}

	private static int binarySearch(int[] nums, int target) {

		int left = 0;
		int right = nums.length-1;
		int steps = 0;
		while (left <= right) {
			steps++;
			int mid = (left + right) / 2;
			if (nums[mid] == target) {
				System.out.println("No of steps taken --> "+ steps);
				return mid;
			} else if (target < nums[mid]) {
				right = mid - 1;
			} else
				left = mid + 1;
		}
		System.out.println("No of steps taken --> "+ steps);
		return -1;
	}

}
