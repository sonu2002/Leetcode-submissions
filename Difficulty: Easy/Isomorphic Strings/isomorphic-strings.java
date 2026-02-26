class Solution {
    public boolean areIsomorphic(String s1, String s2) {
       
       HashMap<Character,Character>mp1=new HashMap<>();

       for(int i=0;i<s1.length();i++){
           char ch1=s1.charAt(i);
           char ch2=s2.charAt(i);
           if(mp1.containsKey(ch1)){
                if(mp1.get(ch1)!=ch2)return false;
           }
           else if(mp1.containsValue(ch2))return false;
           else {
               mp1.put(ch1,ch2);
           }
       }
       
       return true;
        
    }
}