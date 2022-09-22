// class Solution {
//     public int thirdMax(int[] nums) {
//         int m1 = 0, m3 = 0;
        
//         for(int i = 0; i < nums.length; i++){
//             // if(m1 == nums[i] || m3 == nums[i])
//                 // continue;
//             for(int j = i+1; j < nums.length; j++){
//                 if(nums[i] > nums[j]){
//                     int temp = nums[i];
//                     nums[i] = nums[j];
//                     nums[j] = temp;
//                 }
//             }
//         }
        
//         if(nums.length > 2){
//             m1 = nums[nums.length-1];
//             m3 = nums[nums.length-3];
//         }else{
//             m1 = nums[nums.length-1];
//             return m1;
//         }
        
//         if(m1 > m3)
//             return m3;
//         else
//             return m1;
//     }
// }

class Solution{
    public int thirdMax(int[] nums){
        Integer m1 = null, m2 = null, m3 = null;
        
        for(Integer n : nums){
            if(n.equals(m1) || n.equals(m2) || n.equals(m3)) continue;
            
            if(m1 == null || n > m1){
                m3 = m2;
                m2 = m1;
                m1 = n;
            }
            else if(m2 == null || n > m2){
                m3 = m2;
                m2 = n;
            }
            else if(m3 == null || n > m3){
                m3 = n;
            }
        }
        return m3 == null ? m1 : m3;
    }
}