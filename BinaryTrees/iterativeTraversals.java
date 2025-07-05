import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x){
        val=x;
        left=null;
        right=null;
    }
    
}
    //preorder
class Traversals{
public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> preorder=new ArrayList<>();
        if(root==null){
            return preorder;
        }

        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            //step1
            root=st.pop();
            //step2
            preorder.add(root.val);
            //step3
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }

        }
        return preorder;
 }

 //inorder 
 public static List<Integer> inorderTraversal(TreeNode root){
     List<Integer> res=new ArrayList<>();
     Stack<TreeNode> st=new Stack<>();
     if(root==null){
        return res;
     }
     while(root!=null || !st.isEmpty()){
        while(root!=null){
        st.push(root);
        root=root.left;
       }
     root=st.pop();
     res.add(root.val);
     root=root.right;
     //st.push(root);
     }
     return res;
 }

 //postorder->using 2 stacks
 public List<Integer> postorderTraversal(TreeNode root){
    List<Integer>res=new ArrayList<>();
    if(root==null){
        return res;
    }
    Stack<TreeNode> st1=new Stack<>();
    Stack<TreeNode> st2=new Stack<>();

    st1.push(root);
    while(!st1.isEmpty()){
        root=st1.pop();
        st2.push(root);
        if(root.left!=null){
            st1.push(root.left);
        }
        if(root.right!=null){
            st1.push(root.right);
        }
    }
    while(!st2.isEmpty()){
        res.add(st2.pop().val);
    }

    return res;

 }

}
public class iterativeTraversals{
    public static void main(String[] args){
      // Creating a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Initializing the Solution class
        Traversals sol = new Traversals();

        // Getting the preorder traversal
        //List<Integer> result = sol.preorderTraversal(root);
        //List<Integer> result = sol.inorderTraversal(root);
         List<Integer> result = sol.postorderTraversal(root);


        // Displaying the preorder traversal result
        //System.out.print("Preorder Traversal: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
    
