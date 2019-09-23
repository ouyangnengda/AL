package Leetcode;

import java.util.*;
import sun.reflect.generics.tree.Tree;

/**
 * @Description: 判断两个树是否相同
 * @Author: 欧阳能达
 * @Created: 2019年09月23日 18:14:00
 **/
public class Leetcode_100_IsSameTree {
    public static void main(String[] args) {
        dev();
    }

    public static void dev() {

        TreeNode tree1 = new TreeNode(1);
        TreeNode tree2 = new TreeNode(2);
        TreeNode tree3 = new TreeNode(3);
        tree1.left = tree2;
        tree1.right = tree3;
        System.out.println(isSameTree(new TreeNode(0), null));

/*
        System.out.println(isSameTree(new TreeNode(-1), new TreeNode(1)));
        System.out.println(isSameTree(new TreeNode(0), new TreeNode(0)));
        System.out.println(isSameTree(new TreeNode(1), new TreeNode(1)));
        System.out.println(isSameTree(null, null));
        System.out.println(isSameTree(null, new TreeNode(1)));*/
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();

        queue1.offer(p);
        queue2.offer(q);
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            TreeNode tree1 = queue1.poll();
            TreeNode tree2 = queue2.poll();
            if (tree1 == null && tree2 == null) {

            } else if (tree1 == null || tree2 == null) {
                return false;
            } else {
                // 注意处理该节点为 null 的情况
                if (tree1.val == tree2.val) {
                    queue1.offer(tree1.left);
                    queue1.offer(tree1.right);
                    queue2.offer(tree2.left);
                    queue2.offer(tree2.right);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
