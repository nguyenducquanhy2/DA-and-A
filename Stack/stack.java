package Stack;

import DynamicArray.dynamicArrayImp;

import java.util.EmptyStackException;

public class stack<T extends Comparable> implements StackADT<T>{

    private dynamicArrayImp array;
    private int size=0;

    public stack(){
        array=new dynamicArrayImp();
    }


    @Override
    public void push(T elem) {
        array.push(elem);
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty())throw new EmptyStackException();
        return (T) array.get(--size);
    }

    @Override
    public T peek() {
        if (isEmpty())throw new EmptyStackException();
        return (T) array.get(size-1);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size()==0) return true;
        return false;
    }

    @Override
    public void clear() {
        array.clear();
        size=0;
    }
}
