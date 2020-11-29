package May.Easy;


import Tree.TreeNode;

import java.util.Arrays;

/**
 * 101. 对称二叉树
 * <p>
 * 给定一个二叉树，检查它是否是镜像对称的。
 * <p>
 * https://leetcode-cn.com/problems/symmetric-tree/solution/
 */
public class isSymmetric {
    public static void main(String[] args) {
        Integer array[] = new Integer[]{1, 2, 2, 3, 4, 4, 3};
        String s = Arrays.toString(array);
        TreeNode treeNode = TreeNode.makeTree(array);
        System.out.println(TreeNode.middleTraverse(treeNode));
        System.out.println(TreeNode.afterTraverse(treeNode));
        System.out.println(TreeNode.beforeTraverse(treeNode));
        boolean symmetric = isSymmetric(treeNode);
        System.out.println(symmetric);
    }

    public static boolean isSymmetric(TreeNode root) {
        boolean check = check(root, root);
        return check;

    }

    public static boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }

}
