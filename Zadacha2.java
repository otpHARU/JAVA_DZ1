package DZ1;

public class Zadacha2 {
    public int[] buildArray(int[] nums) {
        int q = nums.length;

        for (int i = 0; i < q; i++) {
            var r = nums[i];
            var b = nums[nums[i]] % q;
            nums[i] = q * b + r;
        }

        for (int i = 0; i < q; i++)
            nums[i] = nums[i] / q;

        return nums;
    }
}
