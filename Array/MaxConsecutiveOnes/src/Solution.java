public class Solution {

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;

        for(int i : nums) {
            if(i == 1) {
                current++;

                if(current > max)
                    max = current;
            } else
                current = 0;
        }

        return max;
    }
}
