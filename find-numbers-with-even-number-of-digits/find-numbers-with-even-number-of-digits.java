// class Solution {
//     public int findNumbers(int[] nums) {
//         int ans = 0;
//         for(int i=0; i<nums.length; i++){
//             int count = 0;
//             while(nums[i] > 0){
//                 count++;
//                 nums[i] /= 10;
//             }
//             if(count % 2 == 0) ans++;
//         }
//         return ans;
//     }
// }


// class Solution{
//     public int findNumbers(int[] nums){
//         int ans = 0;
//         for(int i = 0; i < nums.length; i++){
//             int count = 0;
//             while(nums[i] > 0){
//                 count++;
//                 nums[i] /= 10;
//             }
//             if(count % 2 == 0) ans++;
//         }
//         return ans;
//     }
// }

class Solution{
    public int findNumbers(int[] nums){
        int count = 0;
        for(int i =0; i < nums.length; i++){
            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || nums[i]==100000)
                count++;
        }
        return count;
    }
}