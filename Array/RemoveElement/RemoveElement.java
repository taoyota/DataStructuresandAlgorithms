import java.util.Arrays;

public class RemoveElement {

	public static int removeElement(int[] nums, int val){
		int j = nums.length - 1;
		int length = nums.length;

		for(int i = 0; i < length; i++) {
			if(nums[i] == val) {
				if(nums[j] == val) {
					j--;
					i--;
					length--;
				} else {
					nums[i] = nums[j];
					j--;
					length--;
				}
			}
		}

		System.out.println(Arrays.toString(nums));
		return length;
	}

	public static void main(String[] args) {
		int[] a = {3,2,2,3};
		int val = 3;

		removeElement(a, val);
	}
}
