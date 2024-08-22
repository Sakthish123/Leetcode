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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int n;
        if(root!=null)
          q.offer(root);
        for(int j=0;true;j++){
            n=q.size();
            if(q.size()==0)
              return l;
            List<Integer> l1=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node=q.poll();
                if(node.left!=null)
                  q.offer(node.left);
                if(node.right!=null)
                  q.offer(node.right);
                if(j%2==0)
                  l1.add(node.val);
                else
                  l1.addFirst(node.val);
            }
            l.add(l1);
        }
    }
}
