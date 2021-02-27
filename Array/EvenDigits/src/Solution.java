public class Solution {

    public static void main(String[] args) {
        int[] numbers = {555,901,482,1771};
        System.out.println(findNumbers(numbers));
    }

    public static int findNumbers(int[] nums) {
        int digit = 1;
        int evens = 0;

        for (int i : nums) {
            while(i / 10 > 0) {
                digit++;
                i /= 10;
            }

            if(digit % 2 == 0) {
                evens++;
            }

            digit = 1;
        }

        return evens;
    }
}
