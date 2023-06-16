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
    public int maxLevelSum(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            queue.add(root);
            int max = Integer. MIN_VALUE;
            int level = 0;
            int ans  =0;

            while (!queue.isEmpty()){
                int sum = 0;
                level++;

                for (int sz = queue.size(); sz > 0; --sz){
                    TreeNode tempNode = queue.poll();
                    sum += tempNode.val;

                    if(tempNode.left!=null){
                        queue.add(tempNode.left);
                    }

                    if(tempNode.right!=null){
                        queue.add(tempNode.right);
                    }

                }

                if (sum>max){
                    ans = level;
                    max = sum;
                }

            }

            return ans;
    }
}
