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
    public List<String> binaryTreePaths(TreeNode root) 
    {
        List<String> list = new ArrayList<>();
        if(root != null)
            helper(root, list, root.val+"");
        return list;        
    }
    public void helper(TreeNode root, List<String> list, String path)
    {
        if(root.left != null)
            helper(root.left, list,path+"->"+ root.left.val);
        if(root.left == null && root.right == null)
            list.add(path);
        if(root.right != null)
            helper(root.right, list,path+"->"+ root.right.val);
    }
}