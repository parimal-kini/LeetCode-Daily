class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        else if(arr[arr.length-1]>=arr[arr.length-2]){
            return false;
        }
        else if(arr[0]>=arr[1]){
            return false;
        }
        for(int i=1; i<arr.length-1; i++){
            if(arr[i-1]==arr[i]||arr[i]==arr[i+1]){
                return false;
            }
            if(arr[i-1]>arr[i] && arr[i]<=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}