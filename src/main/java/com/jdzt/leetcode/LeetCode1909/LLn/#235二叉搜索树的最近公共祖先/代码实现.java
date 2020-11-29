import com.jdzt.leetcode.LeetCode2011.Tree.TreeNode;

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //定义变量值
        int parentVal = root.val;
        int pVal = p.val;
        int qVal = q.val;
        if (pVal < parentVal && qVal < parentVal) {
            //都在左边
            return lowestCommonAncestor(root.left, p, q);
        } else if (pVal > parentVal && qVal > parentVal) {
            //都在右边
            return lowestCommonAncestor(root.right, p, q);
        } else {
            //p 和 q 在 root 的两边，那么root就是最近公共节点
            return root;
        }
    }
}