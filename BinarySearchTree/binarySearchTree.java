package BinarySearchTree;

import DynamicArray.dynamicArrayImp;

import java.util.ConcurrentModificationException;

public class binarySearchTree<T extends Comparable> implements TreeADT<T> {
    private int nodeCount = 0;
    private NodeTree root = null;

    @Override
    public int size() {
        return nodeCount;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void add(T elem) {
        if (isEmpty()) {
            root=new NodeTree();
            root.setData(elem);
            root.setLeft(null);
            root.setRight(null);
            nodeCount++;
        } else {
            if (Contains(elem)) throw new IllegalArgumentException("double value");
            else {
                root = add(root, elem);
                nodeCount++;
            }
        }

    }

    @Override
    public boolean Contains(T elem) {
        if (isEmpty()) throw new ConcurrentModificationException();
        else return contains(root, elem);
    }

    @Override
    public boolean remove(T elem) {
        if (Contains(elem)) {
            root = remove(root, elem);
            nodeCount--;
            return true;
        }
        return false;
    }

    @Override
    public int height() {
        return height(root) ;
    }

    @Override
    public dynamicArrayImp<T> traversal() {
        if (root==null)return null;
        dynamicArrayImp<T> arr=new dynamicArrayImp();
        inOrder(root,arr);
        return arr;
    }

    //Private
    private NodeTree add(NodeTree root, T elem) {
        if (root == null) return new NodeTree(elem, null, null);

        int result = elem.compareTo(root.getData());

        if (result<0) root.setLeft(add(root.getLeft(), elem));
        else root.setRight(add(root.getRight(), elem));
        return root;
    }

    private boolean contains(NodeTree root, T elem) {

        if (root == null) return false;
        int result = elem.compareTo(root.getData());

        if (result < 0) return contains(root.getLeft(), elem);
        else if (result > 0) return contains(root.getRight(), elem);
        else return true;
    }

    private int height(NodeTree root) {

         if (root.getLeft() != null && root.getRight() != null) {
            NodeTree rootLeft = root.getLeft();
            NodeTree rootRight = root.getRight();
            return 1 + Math.max(height(rootLeft), height(rootRight));
        }
        else if (root.getLeft() != null) return 1 + height(root.getLeft());
        else if(root.getRight() != null) return 1 + height(root.getRight());
        else  return 0;
    }


    private NodeTree remove(NodeTree root, T elem) {
        if (root == null) return null;

        int result = elem.compareTo(root.getData());

        if (result < 0) {
            root.setLeft(remove(root.getLeft(), elem));
        } else if (result > 0) {
            root.setRight(remove(root.getRight(), elem));
        } else {
            if (root.getLeft()==null&&root.getRight()==null)
            {
                root.setData(null);
                root=null;
            }
            else {
                T temp = minRight(root.getRight());
                root.setData(temp);
                root.setRight(remove(root.getRight(), temp));
            }
        }
        return root;
    }

    private T minRight(NodeTree root) {

        if (root==null)return null;
        while (root.getLeft() != null) {
            root = root.getLeft();
        }
        return (T)root.getData();
    }

    private void inOrder(NodeTree root,dynamicArrayImp<T> arr){

        if (root.getLeft()!=null&&root.getRight()!=null){
            arr.push((T)root.getData());
            inOrder(root.getLeft(),arr);
            inOrder(root.getRight(),arr);
        }
        else if(root.getLeft()!=null){
            arr.push((T)root.getData());
            inOrder(root.getLeft(),arr);
        }
        else if(root.getRight()!=null){
            arr.push((T)root.getData());
            inOrder(root.getRight(),arr);
        }else {
            arr.push((T)root.getData());
        }
    }
}
