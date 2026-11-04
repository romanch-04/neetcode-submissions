class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        int total = 0;

        while (left < right) {

            // Left wall is smaller
            if (height[left] < height[right]) {

                // Update left maximum
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                }
                else {
                    // Water can be stored here
                    total = total + (leftMax - height[left]);
                }

                left++;
            }
             // Right wall is smaller
            else {

                // Update right maximum
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                }
                else {
                    // Water can be stored here
                    total = total + (rightMax - height[right]);
                }

                right--;
            }
        }

        return total;
    }
}
