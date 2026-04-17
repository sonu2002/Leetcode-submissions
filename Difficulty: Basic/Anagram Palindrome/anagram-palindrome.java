class Solution {

    boolean canFormPalindrome(String s) {

        int bitmask = 0;

        for(char c : s.toCharArray()){

            int index = c - 'a';

            bitmask ^= (1 << index);

        }

        bitmask = bitmask & (bitmask - 1);

        if(bitmask == 0){

            return true;

        }

        return false;

                  

    }

}