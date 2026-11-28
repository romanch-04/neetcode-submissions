class Solution {
    public int[] applyOperations(int[] nums) {

        int n = nums.length;

        // Step 1: Apply operations from left to right
        for (int i = 0; i < n - 1; i++) {

            if (nums[i] == nums[i + 1]) {

                nums[i] = nums[i] * 2;

                nums[i + 1] = 0;
            }
        }

        // Step 2: Move all non-zero elements to the front
        int index = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] != 0) {

                nums[index] = nums[i];

                index++;
            }
        }

        // Step 3: Fill remaining positions with zeros
        while (index < n) {

            nums[index] = 0;

            index++;
        }

        return nums;
    }
}