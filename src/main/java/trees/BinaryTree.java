package trees;

class TreeNode<T> {
    T value;
    TreeNode left;
    TreeNode right;

    TreeNode(T value){
        this.value = value;
    }
}

public class BinaryTree<T> {
    TreeNode<T> root;
    int size;

    public BinaryTree(T value) {
        root = new TreeNode<>(value);
    }
 }
