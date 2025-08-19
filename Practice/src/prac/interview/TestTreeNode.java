package prac.basics.interview;

import java.util.LinkedList;
import java.util.Queue;

public class TestTreeNode {


    public static void main(String[] args) {


        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        levelOrderTraversal(root);
    }

    private static void levelOrderTraversal(TreeNode root) {

        if(root == null)
            return ;


        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while ( !queue.isEmpty()){
            TreeNode current = queue.poll();
            System.out.print(current.data + "");

            if(current.left != null)
                queue.add(current.left);

            if(current.right != null)
                queue.add(current.right);

        }
    }
}
