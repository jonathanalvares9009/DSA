import java.util.LinkedList;
import java.util.Queue;

//  Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class InvertBinaryTree {
    public TreeNode invertTreeIterative(TreeNode root) {        
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return null;
        queue.add(root);
        while(!queue.isEmpty()){
            int qSize=queue.size();
            for(int i=0;i<qSize;i++){
                TreeNode current=queue.remove();
                TreeNode temp=current.left;
                current.left=current.right;
                current.right=temp;
                if(current.left!=null) queue.add(current.left);
                if(current.right!=null) queue.add(current.right);

            }
        }
        return root;
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}
