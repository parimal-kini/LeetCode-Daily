class Solution {
   public int[] replaceElements(int[] arr) {
        // take last element in array as maxVal
        int maxSoFar = arr[arr.length - 1];
       
        // setting the last element to -1,
        // so that while replacing 2nd last element we have last ele to compare
        arr[arr.length - 1] = -1;
       
		// start array traversal from right to left
        for(int i = arr.length - 2; i > -1; i--){
            int currVal = arr[i];
            arr[i] = maxSoFar;
            // keep updating maxRight element encountered so far
            maxSoFar = Math.max(maxSoFar, currVal);
			
        }
        return arr;
    }
}