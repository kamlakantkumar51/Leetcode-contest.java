class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        if(nums.length <= k){
            return nums;
        }
        int i=0;
        for(int num:nums){
            if( i < k || num!= nums[i-k]){
                nums[i] = num;
                i++;
            }
        }
        int ans[] = new int[i];
        for(int j=0;j<i;j++){
            ans[j] = nums[j];
        }
        return ans;
    }
}
