class Solution {
    public int dominantIndex(int[] nums) {
        int len = nums.length, max = nums[0], maxInd = 0;
        
        for(int i = 0; i < len; i++){
            if(nums[i] > max){
                max = nums[i];
                maxInd = i;
            }
        }
        
        for(int i = 0; i < len; i++){
            if(i != maxInd && 2*nums[i] > max) return -1;
        }
        return maxInd;
    }
}