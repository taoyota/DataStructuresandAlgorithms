import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] numbers = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(numbers)));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] squaredNums = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for(int i = nums.length - 1; i >= 0; i--) {
            if(Math.abs(nums[left]) > nums[right]) {
                squaredNums[i] = nums[left] * nums[left];
                left++;
            } else {
                squaredNums[i] = nums[right] * nums[right];
                right--;
            }
        }

        return squaredNums;
    }
}
