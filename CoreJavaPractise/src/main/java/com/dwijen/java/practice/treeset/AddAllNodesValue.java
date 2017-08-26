package com.dwijen.java.practice.treeset;

import com.sun.source.tree.BinaryTree;
import org.junit.Test;

/**
 * Created by dkirtan on 8/25/17.
 * add all nodes value sp the sum should be
 *  10+(2+3)+(1+5+2+9) =
 *           10
 *        /      \
 *       2        3
 *      / \     /  \
 *     1  5    2    9
 */
public class AddAllNodesValue {
    public int add(TreeNode treeNode){
        int result =0;
        if(treeNode == null){
             return 0;
        }else{
            result = treeNode.val
                    + add(treeNode.left)
                      + add(treeNode.right);
        }
        return result;
    }

    @Test
    public void AddNodes(){
        //BinaryTree tree = new BinaryTree();
        TreeNode treeNode = new TreeNode(10);
        treeNode.left= new TreeNode(2);
        treeNode.right= new TreeNode(3);
        treeNode.left.left= new TreeNode(1);
        treeNode.left.right= new TreeNode(5);
        treeNode.right.right= new TreeNode(9);
        treeNode.right.left= new TreeNode(2);

        System.out.println("Added nodes: "+add(treeNode));

    }
}
