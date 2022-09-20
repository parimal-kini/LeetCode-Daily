class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        int flag = 0;
        
        for(int i = 0; i < heights.length; i++){
            expected[i] = heights[i];            
        }
        
        for(int i = 0; i < heights.length; i++){
            for(int j = i+1; j < heights.length; j++){
                if(expected[i] > expected[j]){
                    int temp = expected[i];
                    expected[i] = expected[j];
                    expected[j] = temp;
                }
            }
        }
        
        for(int i = 0; i < heights.length; i++){
            if(expected[i] != heights[i])
                flag++;
        }
        return flag;
    }
}