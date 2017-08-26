package com.dwijen.java.practice.treeset;

import org.junit.Test;

/**
 * Created by dkirtan on 8/24/17.
 *
 * Add the two Binary-Tree-nodes and create the final tree
 *
 *      10           2
 *    /    \       /   \
 *   11    9      1    7
 *   / \  /       / \
 *  2  4  7      3  6
 *
 *            12
 *          /    \
 *         12     16
 *        / \     /
 *       5  10   7
 */
public class MergeBinaryTree {

    // This is using recursion here

    public TreeNode addTreeNodes(TreeNode t1, TreeNode t2){
        if(t1== null)
            return t2 ;
        if(t2== null)
            return t1 ;

        t1.val +=t2.val;
        t1.left = addTreeNodes(t1.left, t2.left);
        t1.right  = addTreeNodes(t1.right, t2.right);

        return t1;
    }

    @Test
    public void testMerge(){
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(11);
        treeNode.right = new TreeNode(9);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(7);

        TreeNode treeNode2 = new TreeNode(2);
        treeNode2.left = new TreeNode(1);
        treeNode2.right = new TreeNode(7);
        treeNode2.left.left = new TreeNode(3);
        treeNode2.left.right = new TreeNode(6);

        TreeNode tr = addTreeNodes(treeNode, treeNode2);
        System.out.println(tr.val);
        System.out.println(tr.left.val);
        System.out.println(tr.right.val);
        System.out.println(tr.left.right.val);
        System.out.println(tr.left.left.val);
        System.out.println(tr.right.left.val);
    }
}
