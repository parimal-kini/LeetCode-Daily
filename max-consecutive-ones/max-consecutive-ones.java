// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         // Hint: Initialise and declare a variable here to 
//         // keep track of how many 1's you've seen in a row.
//         int flag = 0;
//         int max = 0;
        
//         for (int i = 0; i < nums.length; i++) {
//             // Do something with element nums[i].
//             if(nums[i] == 1){
//                 flag++;
//             }
//             else if(nums[i] == 0){
//                 if(flag > max)
//                     max = flag;
//                 flag = 0;
//             }
//         }
//         if(flag > max){
//             max = flag;
//         }
//         return max;
//     }
// }




// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int flag = 0;
//         int max = 0;
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] == 1)
//                 flag++;

//             else if(nums[i] == 0){
//                 if(flag > max) max = flag;
//                 flag = 0;
//             }
            
//         }
//         if(flag > max) max = flag;
//         return max;
//     }
// }


class Solution{
    public int findMaxConsecutiveOnes(int[] nums) {
        int flag = 0, max = 0;
        for (int n : nums)
            max = Math.max(max, flag = n == 0 ? 0 : flag + 1);
        return max; 
    } 
}
    