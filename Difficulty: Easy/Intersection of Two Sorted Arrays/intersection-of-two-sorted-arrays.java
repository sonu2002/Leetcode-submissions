class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        int n = a.length , i = 0;
        int m = b.length , j = 0;
        
        while(i < n && j < m){
            if(a[i] < b[j]){
                i++;
            }else if(b[j] < a[i]){
                j++;
            }else{
                if(result.size() == 0){
                    result.add(a[i]);
                }else{
                    if(result.get(result.size() - 1) != a[i]){
                        result.add(a[i]);
                    }
                }
                i++;
                j++;
            }
        }
        return result;
    }
}