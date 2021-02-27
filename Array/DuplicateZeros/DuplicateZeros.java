import java.util.Arrays;

public class DuplicateZeros{

	public static void duplicateZeros(int[] arr) {
		for(int i = arr.length - 2; i >= 0; i--) {
			if(arr[i] == 0) {
				for(int j = arr.length - 2; j > i; j--) {
					arr[j + 1] = arr[j];
				}
				arr[i + 1] = 0;
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] a = {1,0,2,3,0,4,5,0};
		duplicateZeros(a);
	}
}
