package DZ1;

public class Zadacha3 {

    int removeElement(final int[] nums, final int val) {
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[left++] = nums[i];
            }
        }
        return left;
    }
}