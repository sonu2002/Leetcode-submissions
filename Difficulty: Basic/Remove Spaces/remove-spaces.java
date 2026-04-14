class Solution {
static String removeSpaces(String s) {
        int n = s.length();
        int i = 0, itr = 0;
        char[] arr = s.toCharArray();
        while (i < n) {
            
            if (arr[i] != ' ') {
                
                arr[itr++] = arr[i];
            }
            i++;
        }
    
        return new String(arr, 0, itr);
    }

    public static void main(String[] args) {
        String s = "g  eeks   for ge  eeks  ";
        System.out.print(removeSpaces(s));
    }
}