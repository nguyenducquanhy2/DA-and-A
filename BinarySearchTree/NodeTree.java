package BinarySearchTree;


public class NodeTree<T extends Comparable>   {
    private T data;
    private NodeTree left;
    private NodeTree right;

    public NodeTree() { }

    public NodeTree(T data, NodeTree left, NodeTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public NodeTree getLeft() {
        return left;
    }
    public void setLeft(NodeTree left) {
        this.left = left;
    }
    public NodeTree getRight() {
        return right;
    }
    public void setRight(NodeTree right) {
        this.right = right;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }


}
