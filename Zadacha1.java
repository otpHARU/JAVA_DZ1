package DZ1;

import java.util.Arrays;

public class Zadacha1 {

	public static void main(String[] args) {
		int [] nums1= {0};
		int [] nums2= {1};
		merge(nums1, 0, nums2, 1);

	}

	static void merge(int[] nums1, int m, int[] nums2, int n) {
		int index=0;

		for (int i = m; i < m+n; i++) {
			nums1[i]=nums2[index];
			index++;
		}
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
	}

}