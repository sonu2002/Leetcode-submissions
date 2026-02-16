class Solution {
    static boolean canAttend(int[][] arr) {
        // code here
        Arrays.sort(arr, (a, b) -> {
            if(a[0] == b[0]){
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        
        int n = arr.length;
        int lastmeet = arr[0][1];
        
        for(int i=1; i<n; i++){
            if(lastmeet > arr[i][0]){
                return false;
            }
            lastmeet = arr[i][1];
        }
        
        return true;
    }
}