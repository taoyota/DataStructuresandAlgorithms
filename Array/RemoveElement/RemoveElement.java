import java.util.Arrays;

public class RemoveElement {

	public static int removeElement(int[] nums, int val){
		int i = 0;
		int length = nums.length;

		while(i < length) {
			if(nums[i] == val) {
				nums[i] = nums[length - 1];
				length--;
			} else
				i++;
		}

		System.out.println(Arrays.toString(nums));
		return length;
	}

	public static void main(String[] args) {
		int[] a = {4,2,3,5,4};
		int val = 4;

		removeElement(a, val);
	}
}
