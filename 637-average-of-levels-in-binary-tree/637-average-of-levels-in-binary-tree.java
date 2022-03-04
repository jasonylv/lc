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
        List<Double> list = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        
        while ( !queue.isEmpty() ) {
            double sum = 0;
            int size = queue.size();
            for (int i=0;i<size;i++) {
                TreeNode p = queue.poll();
                sum += p.val;
                if ( p.left != null )
                    queue.add(p.left);
                if ( p.right !=null )
                    queue.add(p.right);
            }
            list.add( sum / size);
            
        }
        
        return list;
    }
}