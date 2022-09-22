class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sqrArr = new int[nums.length];
        for(int i = 0; i< nums.length; i++)
            sqrArr[i] = nums[i] * nums[i];
        
        // Arrays.sort(sqrArr);
        // return sqrArr;
        for(int i = 1; i < sqrArr.length; i++){
            for(int j = 0; j < sqrArr.length; j++){
                if(sqrArr[j] > sqrArr[i]){
                    int temp = sqrArr[i];
                    sqrArr[i] = sqrArr[j];
                    sqrArr[j] = temp;
                }
            }
        }
        return sqrArr;
    }
}