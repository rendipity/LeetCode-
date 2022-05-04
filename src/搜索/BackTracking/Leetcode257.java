package 搜索.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Leetcode257 {
    private List<String> list=new ArrayList<>();
    private StringBuilder stringBuilder = new StringBuilder();
    public List<String> binaryTreePaths(TreeNode root) {
        traversal(root);
        return list;
    }
    private void traversal(TreeNode node){
        stringBuilder.append(node.val);
        if (node.left==null&&node.right==null){
            list.add(stringBuilder.toString());
            stringBuilder.delete(stringBuilder.length()-String.valueOf(node.val).length(),stringBuilder.length());
            return;
        }
        stringBuilder.append("->");
        if (node.left!=null)
            traversal(node.left);
        if (node.right!=null)
            traversal(node.right);
        stringBuilder.delete(stringBuilder.length()-String.valueOf(node.val).length()-2,stringBuilder.length());
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }