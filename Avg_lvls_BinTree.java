/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<TreeNode> q= new ArrayList<>();
        List<Double> l = new ArrayList<>();
        long sum=0;
        q.add(root);
        sum+=root.val;
        while(true){
         int n=q.size();
         if(n==0)
          return l;
         l.add((double)sum/n);
         for(int i=0;i<n;i++){
          TreeNode t=q.get(0);
          if(t.left!=null){
            q.add(t.left);
            sum+=t.left.val;
          }
          if(t.right!=null){
            q.add(t.right);
            sum+=t.right.val;
          }
          q.remove(0);
          sum-=t.val;
         }
        }
    }
}
