class Solution {
    public void nextPermutation(int[] nums) {
    int n = nums.length;
    int breakPoint = -1;

    // Find the first decreasing element from the end
    for (int i = n - 2; i >= 0; i--) {
        if (nums[i] < nums[i + 1]) {
            breakPoint = i;
            break;
        }
    }

    // If no increasing sequence is found, reverse the entire array
    if (breakPoint == -1) {
        reverse(nums, 0, n - 1);
        return;
    }

    // Find the smallest element in the suffix that is larger than nums[breakPoint]
    for (int i = n - 1; i > breakPoint; i--) {
        if (nums[i] > nums[breakPoint]) {
            // Swap nums[i] and nums[breakPoint]
            int temp = nums[i];
            nums[i] = nums[breakPoint];
            nums[breakPoint] = temp;
            break;
        }
    }

    // Reverse the suffix starting from breakPoint + 1
    reverse(nums, breakPoint + 1, n - 1);
}

private void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}
}