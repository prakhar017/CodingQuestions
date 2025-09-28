package prac.basics.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;


    public TreeNode(int data) {
        this.data = data;
    }
}

class TreeNodeMain {

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);

        int[] arr = { 1,2,3,4,5,6,7};


        inOrderTraversal(treeNode);
        System.out.println();
        preOrderTraversal(treeNode);
        System.out.println();
        postOrderTraversal(treeNode);
        System.out.println();
        levelOrderTraversal(treeNode);
        System.out.println();


        TreeNode root= convertArrayToTree(arr,0);
        levelOrderTraversal(root);
        System.out.println();
        inOrderTraversal(root);
        System.out.println();


        System.out.println("Height of the tree : " + heightOfTree(root));
    }

    private static int heightOfTree(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int height = 0;

        while(!q.isEmpty()){
            int levelSize = q.size();

            for(int i =0 ;i < levelSize; i++){
                TreeNode node = q.poll();

                if(node.left != null)
                    q.add(node.left);

                if(node.right != null)
                    q.add(node.right);
            }
            height++;
        }

        return height -1;

    }

    private static TreeNode convertArrayToTree(int[] arr, int i) {

        return insertInLevelOrder(arr,i);
    }

    private static TreeNode insertInLevelOrder(int[] arr, int i) {

        TreeNode root= null;

        if( i < arr.length){
            root = new TreeNode(arr[i]);

            root.left = insertInLevelOrder(arr, 2*i + 1);
            root.right = insertInLevelOrder(arr, 2*i + 2);
        }

        return root;
    }

    private static void levelOrderTraversal(TreeNode treeNode) {

        /*if (treeNode == null)
            return;*/

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            System.out.print(currentNode.data + " ");

            if (currentNode.left != null)
                queue.add(currentNode.left);

            if (currentNode.right != null)
                queue.add(currentNode.right);
        }
    }

    private static void inOrderTraversal(TreeNode treeNode) {
        if (treeNode == null)
            return;
        // Left -> Root > Right
        inOrderTraversal(treeNode.left);
        System.out.print(treeNode.data + " ");
        inOrderTraversal(treeNode.right);
    }

    private static void preOrderTraversal(TreeNode treeNode) {
        if (treeNode == null)
            return;
        // Root -> Left -> Right
        System.out.print(treeNode.data + " ");
        preOrderTraversal(treeNode.left);
        preOrderTraversal(treeNode.right);
    }


    private static void postOrderTraversal(TreeNode treeNode) {
        if (treeNode == null)
            return;
        // Left -> Right - Root
        postOrderTraversal(treeNode.left);
        postOrderTraversal(treeNode.right);
        System.out.print(treeNode.data + " ");
    }
}
