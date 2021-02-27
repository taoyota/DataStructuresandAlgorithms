public class BinarySearch {

	public static int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		int index = 0;

		while(left <= right) {
			index = left + (right - left) / 2;

			if(nums[index] == target)
				return index;
			else if(nums[index] < target)
				left = index + 1;
			else
				right = index - 1;
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] a = {-1,0,3,5,9,12};
		int n = 9;

		System.out.println(search(a, n));
	}
}
