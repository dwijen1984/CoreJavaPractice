package com.dwijen.PRACTICE;

import apple.laf.JRSUIUtils;
import org.junit.Test;

import java.util.LinkedList;

public class DFSandBFS {

    public class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int val;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

        public void BFS(TreeNode node){
            java.util.Queue<TreeNode> queue = new LinkedList();
            queue.add(node);
            while(!queue.isEmpty()){
                TreeNode t = queue.remove();
                System.out.println(t.val);
                if(t.left != null){
                    queue.add(t.left);
                }
                if(t.right!= null){
                    queue.add(t.right);
                }
            }
        }

        public void DFS(TreeNode t){
            System.out.println(t.val);

            if(t.left != null){
                DFS(t.left);
            }
            if(t.right != null){
                DFS(t.right);
            }
        }

        @Test
        public void BFSTest(){
            TreeNode t = new TreeNode(1);
            t.left = new TreeNode(2);
            t.right = new TreeNode(3);
            t.left.left = new TreeNode(4);
            t.left.right = new TreeNode(5);
            BFS(t);
            System.out.println("---------------");
            DFS(t);
        }

}
