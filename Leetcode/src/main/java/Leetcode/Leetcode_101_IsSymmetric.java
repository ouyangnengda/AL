package Leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Description: 判断是否为对称二叉树
 * @Author: 欧阳能达
 * @Created: 2019年09月21日 22:05:00
 **/
public class Leetcode_101_IsSymmetric {
    public static void main(String[] args) {
        pro();
    }

    public static void pro() {

    }

    public static void test() {

    }

    public boolean isSymmetric(TreeNode root) {
        TreeNode treeNode = root;
        if (root == null) {
            return false;
        }

        List<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        while (!queue.isEmpty()) {
            //首先判断queue里面的元素是否符合对称,符合则进行下一步，否则直接返回false；
            if (queueIsSy(queue)) {
                int size = queue.size();
                while (size > 0) {
                    TreeNode temp = queue.remove(size);
                    queue.add(temp.left);
                    queue.add(temp.right);
                    size = size - 1;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean queueIsSy(List<TreeNode> queue) {
        if (queue == null) {
            return false;
        }

        int i = 0;
        while (queue.remove(i).val == queue.remove(queue.size() - 1 - i).val) {
            if (i >= (queue.size() / 2 - 1)) {
                return true;
            }
            i = i + 1;
        }
        return false;
    }
}
