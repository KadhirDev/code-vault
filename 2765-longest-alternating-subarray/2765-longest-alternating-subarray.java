class Solution {
    public int alternatingSubarray(int[] nums) {

        int ans = -1;

        for (int i = 0; i < nums.length - 1; i++) {

            
            if (nums[i + 1] - nums[i] != 1)
                continue;

            int count = 2;
            int expected = -1;

            for (int j = i + 2; j < nums.length; j++) {

                if (nums[j] - nums[j - 1] == expected) {
                    count++;
                    expected *= -1;
                } else {
                    break;
                }
            }

            ans = Math.max(ans, count);
        }

        return ans;
    }
}