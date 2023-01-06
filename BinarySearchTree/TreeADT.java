package BinarySearchTree;

import DynamicArray.dynamicArrayImp;
import com.sun.source.tree.BinaryTree;

public interface TreeADT<T extends Comparable>  {


    public int size();
    public boolean isEmpty();
    public void add(T elem);
    public boolean Contains(T elem);
    public boolean remove(T elem);
    public int height();
    public dynamicArrayImp<T>traversal();



}
