class Solution {

    public static ArrayList<Integer> findUnion(int[] a, int[] b) {

        // code here

        Set<Integer> set = new HashSet<>();

 

        for (int x : a) set.add(x);

        for (int y : b) set.add(y);

 

        return (new ArrayList<>(set));
    }

}