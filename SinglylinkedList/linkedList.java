
public interface linkedList<T> {

public int size();

public void addFirst(T elem) ;
public void addIndexOf(T elem,int index);
public void addLast(T elem) ;
public void add(T elem); 

public T removeFirst();


public T remove(T elem);
public T removeLast();

public boolean isEmpty();
public int containsIndexof(T elem);
public node getFirst();
public node getLast();
public node getNodeIndexOf(int index);
public void traveral();
} 
