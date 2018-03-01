package com.dwijen.java.practice.treeset;

import com.dwijen.java.practice.DesignPrimitiveDatastructure.Queue;
import org.junit.Test;

public class BFS {

    public void Solution(TreeNode root){
        Queue<TreeNode> queue = new Queue<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode t = null;
                t = queue.remove();
                System.out.println(t!= null?t.val:"");

            if(t.left != null){
                queue.add(t.left);
            }
            if(t.right != null){
                queue.add(t.right);
            }
        }
    }

    @Test
    public void testMerge() {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(11);
        treeNode.right = new TreeNode(9);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(7);

        Solution(treeNode);
    }
}
