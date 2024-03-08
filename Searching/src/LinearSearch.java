
public class LinearSearch {

	public static void main(String[] args) {
		
		int[] nums = {2, 4, 1, 6, 9, 10, 7};
		int target = 7;
		
		int targetIndex = linearSearch(nums, target);
		
		if(targetIndex != -1)
			System.out.println("Element found at index ---> " + targetIndex);
		else 
			System.out.println("Element not found");
	}

	private static int linearSearch(int[] nums, int target) {
		
		int steps = 0;
		for(int i=0; i<nums.length; i++) {
			steps++;
			if(nums[i] == target) {
				System.out.println("No of steps taken --> "+ steps);
				return i;
			}
		}
		System.out.println("No of steps taken --> "+ steps);
		return -1;
	}

}
