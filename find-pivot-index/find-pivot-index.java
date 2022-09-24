// class Solution {
//     public int pivotIndex(int[] nums) {
//         int sum = 0, leftsum = 0;        
//         for (int x: nums) sum += x;        
//         for (int i = 0; i < nums.length; ++i) {
//             if (leftsum == sum - leftsum - nums[i]) return i;
//             leftsum += nums[i];
//         }
//         return -1;
//     }
// }

class Solution{
    public int pivotIndex(int[] nums){
        int sum = 0, leftSum = 0, rightSum = 0;
        
        for (int x: nums) sum += x;
        
        for(int i = 0; i < nums.length; i++){
            rightSum = sum - nums[i] - leftSum;
            if(leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}