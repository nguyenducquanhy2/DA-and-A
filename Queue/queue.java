package Queue;

import DynamicArray.dynamicArrayImp;

import java.util.EmptyStackException;
import java.util.Queue;

public class queue<T extends Comparable> implements QueueADT<T>{
    private dynamicArrayImp array;
    private int first;
    private int last;
    public queue(){
        array=new dynamicArrayImp();
        first=last=0;
    }
    @Override
    public void enQueue(T elem) {
        array.push(elem);
        last++;
    }

    @Override
    public T deQueue() {
        if (isEmty())throw new IllegalArgumentException();
        else {
            return (T)array.get(first++);
        }
    }

    @Override
    public T peek() {
        if (isEmty()) return null;
        else {
            return (T)array.get(first++);
        }
    }

    @Override
    public int size() {
        return last-first;
    }

    @Override
    public boolean isEmty() {
        if (size()==0) return true;

        return false;
    }

    @Override
    public void clear() {
        array.clear();
        last=first=0;
    }
}
