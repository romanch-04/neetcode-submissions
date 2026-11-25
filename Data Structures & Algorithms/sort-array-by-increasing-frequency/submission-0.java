class Solution {
    public int[] frequencySort(int[] nums) {

        int[] freq = new int[201];

        // Step 1: Count frequency
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i] + 100]++;
        }

        // Step 2: Sort using custom comparator
        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> {
            int f1 = freq[a + 100];
            int f2 = freq[b + 100];

            if (f1 != f2) {
                return f1 - f2;  // Increasing frequency
            }

            return b - a;       // Decreasing value
        });

        // Step 3: Convert Integer[] to int[]
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }
}