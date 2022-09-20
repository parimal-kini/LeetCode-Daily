class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int snowBall = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0) snowBall++;
            
            else if(snowBall > 0){
                int temp = nums[i];
                nums[i] = nums[i - snowBall];
                nums[i-snowBall] = temp;
            }
        }
        return nums;
    }
}