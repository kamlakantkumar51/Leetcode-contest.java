import java.util.*;
class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        if(nums.length <= k){
            return nums;
        }
        int writeidx = k;
        for(int readidx = k;readidx < nums.length;readidx++){
            if(nums[readidx] != nums[writeidx-k]){
                nums[writeidx] = nums[readidx];
                writeidx++;
            }
        }
        return Arrays.copyOfRange(nums,0,writeidx);
    }
}
