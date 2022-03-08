class FindClosestValueInBST {
    static class BST {
        public int value;
        public BST left;
        public BST right;
    
        public BST(int value) {
          this.value = value;
        }
    }

    private static int findClosestValueInBstRecursive(BST tree, int target, int closest) {
		if(Math.abs(target - closest) > Math.abs(target - tree.value)) {
			closest = tree.value;
		}
		if(target < tree.value && tree.left != null) {
			return findClosestValueInBstRecursive(tree.left, target, closest);
		} else if(target > tree.value && tree.right != null) {
			return findClosestValueInBstRecursive(tree.right, target, closest);
		} else {
			return closest;
		}
	}

    public static int findClosestValueInBstRecursive(BST tree, int target) {
        // Write your code here.
        return findClosestValueInBstRecursive(tree, target, tree.value);
    }

    private static int findClosestValueInBstIterative(BST tree, int target, int closest) {
        BST currentNode = tree;
        while(currentNode != null) {
            if(Math.abs(target - closest) > Math.abs(target - currentNode.value)) {
                closest = currentNode.value;
            }
            if(target < currentNode.value) {
                currentNode = currentNode.left;
            } else if(target > currentNode.value) {
                currentNode = currentNode.right;
            } else {
                break;
            }
        }
        return closest;
    }

    public static int findClosestValueInBstIterative(BST tree, int target) {
        // Write your code here.
        return findClosestValueInBstIterative(tree, target, tree.value);
    }
}
