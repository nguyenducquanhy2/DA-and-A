package DoublyLinkedList;

import javax.swing.text.StyledEditorKit.BoldAction;

public interface DoublyLinkedList<T> {

  public int size();
  public boolean isEmpty();

  public void add(T elem);
  public void addHead(T elem);
  public void addTail(T elem);
  public void addMidle(T elem,int index);

  public T removeHead();
  public T removeTail();

  public T remove(node<T>node);
  public boolean remove(T elem);
  public T removeAt(int index);

  public boolean contains(T elem );
  public int indexOf(T elem ); 
  public node getHead();
  public node getTail();
  public node getNodeByIndex(int index);

  public void traveralList();

  
}
