package com.dwijen.java.practice.treeset;

import org.junit.Test;

 /* Add the two Binary-Tree-nodes and create the final tree
        *
        *      10
        *    /    \
        *   11    9
        *   / \  /
        *  2  4  7
*/
public class SumOfLeftLeaves {
    public int solution(TreeNode treeNode){
        int sumLeftNodes = 0;
        if(treeNode == null) {
            return 0;
        }else if (treeNode.left != null){
            if(treeNode.left.left == null && treeNode.left.right == null){
                sumLeftNodes += treeNode.val;
                solution(treeNode.left);
            }
        }
        sumLeftNodes += solution(treeNode.right);

        return sumLeftNodes;
    }

    @Test
    public void testMerge() {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(11);
        treeNode.right = new TreeNode(9);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(7);

        System.out.println("Summation : "+solution(treeNode));
    }

}
