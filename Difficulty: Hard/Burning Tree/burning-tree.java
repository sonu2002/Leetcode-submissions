/*

class Node {

    int data;

    Node left;

    Node right;

 

    Node(int data) {

        this.data = data;

        left = null;

        right = null;

    }

} */

class Solution {

 public int maxHeight(Node root){

     if(root==null) return 0;

     return 1+Math.max(maxHeight(root.left),maxHeight(root.right));

 }

     public int solve(Node root,int target){

         if(root==null) return 0;

         if(root.data==target){

             ans=Math.max(ans,maxHeight(root.left));

             ans=Math.max(ans,maxHeight(root.right));

             return 1;

         }

         int val=solve(root.left,target);

         if(val!=0){

             ans=Math.max(ans,val+maxHeight(root.right));

             return val+1;

         }

         val=solve(root.right,target);

         if(val!=0){

             ans=Math.max(ans,val+maxHeight(root.left));

             return val+1;

         }

         return 0;

     

     

 }

 public int ans;

 public int minTime(Node root, int target) {

        ans=0;

        solve(root,target);

        return ans;

        

    }

}