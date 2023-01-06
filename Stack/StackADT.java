package Stack;

public interface StackADT<T> {
    public void push(T elem);
    public  T pop();
    public T peek();
    public int size();
    public boolean isEmpty();
    public void clear();



}
