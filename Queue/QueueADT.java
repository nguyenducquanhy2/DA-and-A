package Queue;

public interface QueueADT<T> {

    public void enQueue(T elem);
    public  T deQueue();
    public T peek();
    public int size();
    public boolean isEmty();
    public void clear();

}
