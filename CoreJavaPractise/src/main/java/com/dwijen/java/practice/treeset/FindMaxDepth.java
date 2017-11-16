package com.dwijen.java.practice.treeset;

import org.junit.Test;

import java.util.*;

/**
 * Created by dkirtan on 8/25/17.
 * add all nodes value sp the sum should be
 *  10+(2+3)+(1+5+2+9) =
 *           10
 *        /      \
 *       2        3
 *      / \     /  \
 *     1  5    2    9
 *        \
 *        11
 */
public class FindMaxDepth {
    int Maxdepth = Integer.MIN_VALUE;
    public int maxdepth(int depth, TreeNode T){
        if(T.left == null && T.right == null){
            //System.out.println("Its a leaf value "+T.val +" and depth is "+(depth+1));
            Maxdepth = Math.max(Maxdepth, depth+1);
            return depth+1;


        }else if(T.left != null && T.right == null){
            return maxdepth(depth+1, T.left);
        }else if(T.left == null && T.right != null){
            return maxdepth(depth+1, T.right);
        }else{
             maxdepth(depth+1, T.left);
             maxdepth(depth+1, T.right);
        }
        return depth+1;
    }

    @Test
    public void AddNodes(){
        //BinaryTree tree = new BinaryTree();
        TreeNode treeNode = new TreeNode(10);
        treeNode.left= new TreeNode(2);
        treeNode.right= new TreeNode(3);
        treeNode.left.left= new TreeNode(1);
        treeNode.left.right= new TreeNode(5);
        treeNode.left.right.left= new TreeNode(11);
        treeNode.right.right= new TreeNode(9);
        treeNode.right.left= new TreeNode(2);

        List<Integer> a= new ArrayList<>();
        maxdepth(1, treeNode);
        System.out.println("Max :"+Maxdepth);

    }

}
