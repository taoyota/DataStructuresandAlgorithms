public class Sqrt {

	public static int mySqrt(int x) {
		long left = 1;
		long right = x;

		while(left <= right) {
			long mid = (left + right) / 2;

			if(mid * mid == x)
				return (int)mid;
			else if(mid * mid > x)
				right = mid - 1;
			else
				left = mid + 1;
		}

		return (int)left - 1;
	}

	public static void main(String[] args) {
		System.out.print(mySqrt(2147395599));
	}
}
