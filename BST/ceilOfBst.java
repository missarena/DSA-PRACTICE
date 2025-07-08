                            
// Importing necessary packages
import java.util.*;

// Definition of TreeNode structure for a binary tree node
class TreeNode {
    // Value of the node
    int val;

    // Pointer to the left child node
    TreeNode left;

    // Pointer to the right child node
    TreeNode right;

    // Constructor to initialize the node with a
    // value and set left and right pointers to null
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}


    

// Class containing the main function
public class ceilOfBst {
    // Function to perform an in-order traversal
    // of a binary tree and print its nodes
    public static void printInOrder(TreeNode root) {
        // Check if the current node
        // is null (base case for recursion)
        if (root == null) {
            // If null, return and
            // terminate the function
            return;
        }

        // Recursively call printInOrder
        // for the left subtree
        printInOrder(root.left);

        // Print the value of the current node
        System.out.print(root.val + " ");

        // Recursively call printInOrder
        // for the right subtree
        printInOrder(root.right);
    }

    // Function to find the ceiling of
    // a key in a Binary Search Tree (BST)
    public int findCeil(TreeNode root, int key) {
        // Initialize the variable to store the ceiling value
        int ceil = -1;

        // Traverse the BST until reaching
        // the end or finding the key
        while (root != null) {
            // If the key is found, assign it
            // as the ceiling and return
            if (root.val == key) {
                ceil = root.val;
                return ceil;
            }

            // If the key is greater,
            // move to the right subtree
            if (key > root.val) {
                root = root.right;
            } else {
                // If the key is smaller, update ceil
                // and move to the left subtree
                ceil = root.val;
                root = root.left;
            }
        }
        // Return the computed ceiling value
        return ceil;
    }


    // Main method
    public static void main(String[] args) {
        // Creating a BST
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(13);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(2);
        root.left.left.right = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.left.right.right = new TreeNode(9);
        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(14);

        System.out.println("Binary Search Tree: ");
        printInOrder(root);
        System.out.println();

        ceilOfBst solution = new ceilOfBst();

        // Searching for a value in the BST
        int target = 8;
        int ceil = solution.findCeil(root, target);

        if (ceil != -1) {
            System.out.println("Ceiling of " + target + " is: " + ceil);
        } else {
            System.out.println("No ceiling found!");
        }
    }
}
                            
                        