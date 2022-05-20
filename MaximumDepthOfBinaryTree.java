import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Definition for a binary tree node.
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


class MaximumDepthOfBinaryTree {

    // Recursive DFS
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftSubTreeHeight = maxDepth(root.left);    
        int rightSubTreeHeight = maxDepth(root.right);
        return Math.max(leftSubTreeHeight + 1, rightSubTreeHeight + 1);
    }
    
    // Iterative BFS
    public int maxDepthItrBFS(TreeNode root) {
        if(root == null) return 0;
        int level = 0;
        Queue<TreeNode> BFSQueue = new LinkedList<>();
        BFSQueue.add(root);
        while(!BFSQueue.isEmpty()) {
            int size = BFSQueue.size();
            for ( int i = 0; i < size; i++ ) {
                TreeNode child = BFSQueue.poll();
                if(child.left != null) BFSQueue.offer(child.left);
                if (child.right != null) BFSQueue.offer(child.right);  
            }
            level++;
        }
        return level;
    }
    
    // Iterative DFS
    public int maxDepthItrDFS(TreeNode root) {
        if(root == null) return 0;
        Stack<TreeNode> DFSNode = new Stack<>();
        Stack<Integer> DFSValue = new Stack<>();
        DFSNode.push(root);
        DFSValue.push(1);
        int finalDepth = 1;
        while(!DFSNode.isEmpty()) {
            TreeNode node = DFSNode.pop();
            int currDepth = DFSValue.pop();
            if(node.left == null && node.right == null) {
                finalDepth = finalDepth > currDepth ? finalDepth : currDepth;
            }
            if(node.left != null) {
                DFSNode.push(node.left);
                DFSValue.push(currDepth + 1);
            }
            if(node.right != null) {
                DFSNode.push(node.right);
                DFSValue.push(currDepth + 1);
            }
        }
        return finalDepth;
    }
}
