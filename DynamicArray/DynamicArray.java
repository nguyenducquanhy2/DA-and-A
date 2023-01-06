package DynamicArray;

import java.util.ArrayList;

public interface DynamicArray<T extends Comparable> {

    public int size();
    public boolean isEmpty();
    public void push(T elem);
    public void addAt(T elem,int index);
    public void remove(T elem);
    public void removeAt(int indexRemove);
    public boolean contains(T elem);
    public T containsIndexOf(T elem);

    public T get(int index);
    public void clear();
    public void sortASC();
    public T getMax();



}
