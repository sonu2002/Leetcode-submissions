class Solution {
    public int hIndex(int[] citations) {
       int n = citations.length;
        int index = 1;
        int count = 0;
        Arrays.sort(citations);
        if(citations[n-1] == 0){
            return 0;
        }
        for (int i = n-1; i>=0; i--){
            if(citations[i] >= index){
                count++;
                index++;
            }
        }
        return count;
    }
}