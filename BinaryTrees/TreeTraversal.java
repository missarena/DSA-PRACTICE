import java.util.*;

public class TreeTraversal {

    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Inorder Traversal (Left → Root → Right)
    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // Preorder Traversal (Root → Left → Right)
    public static void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder Traversal (Left → Right → Root)
    public static void postorder(TreeNode root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    // Level Order Traversal (BFS)
    public static void levelOrder(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
         TreeNode currNode= q.remove();
          if(currNode == null){
             System.out.println();
             if(q.isEmpty()){
                break;
             }else{
                q.add(null);
             }
          }else{
            System.out.print(currNode.val+" ");
            if(currNode.left!=null){
                q.add(currNode.left);
            }
            if(currNode.right!=null){
                q.add(currNode.right);
            }
          }
        }
    }

    // Main method to test all traversals
    public static void main(String[] args) {
        /*
              1
             / \
            2   3
           / \   \
          4   5   6
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();

        System.out.print("Preorder Traversal: ");
        preorder(root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        postorder(root);
        System.out.println();

        System.out.print("Level Order Traversal: ");
        levelOrder(root);
        System.out.println();
    }
}
