class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++) {
            if ( nums[i] >= nums.length - i ) {
                if ( i > 0 && nums[i-1] >= nums.length - i ) continue;
                return nums.length - i;
            }
        }
        return -1;
    }
}