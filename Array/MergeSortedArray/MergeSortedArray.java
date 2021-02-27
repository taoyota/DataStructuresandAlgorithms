import java.util.Arrays;

public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		m--;
		n--;
		
		for(int i = nums1.length - 1; i >=0; i--) {
			if(m < 0) {
				nums1[i] = nums2[n];
				n--;
			} else if(n < 0) {
				nums1[i] = nums1[m];
				m--;
			} else if(nums1[m] > nums2[n]) {
				nums1[i] = nums1[m];
				m--;
			} else {
				nums1[i] = nums2[n];
				n--;
			}
		}

		System.out.println(Arrays.toString(nums1));
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,0,0,0};
		int[] b = {2,5,6};
		int m = a.length - b.length;
		int n = b.length;
		merge(a, m, b, n);
	}
}
