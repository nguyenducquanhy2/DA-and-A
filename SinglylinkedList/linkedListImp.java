import javax.management.RuntimeErrorException;

public class linkedListImp<T> implements linkedList {
  private node root=null;
  private int sizeList=0;

  @Override
  public int size() {    
    return sizeList;
  }

  @Override
  public boolean isEmpty() {    
    if (size()==0) {
      return true;
    }
    return false;
  }
  @Override
  public void addFirst(Object elem) {
    if(isEmpty())root=new node(elem,null);
    else{
      node newNode=new node(elem,root);
      root=newNode;
      sizeList++;
    }
  }

  @Override
  public void addIndexOf(Object elem,int index) {
    if (index<0|| index>sizeList) throw new IllegalArgumentException();
    else{
      int count=0;
      node<T>currentNode=root;
      while (count!=index) {        
        currentNode= currentNode.getNextNode();
      }
      node newNode=new node(elem,currentNode.getNextNode());
      currentNode.setNextNode(newNode);
      sizeList++;
    }
  }

  @Override
  public void addLast(Object elem) {
    if (isEmpty()) {
      root=new node(elem,null);
      sizeList++;}
    else{
    node<T>currentNode=root;
    while (currentNode.getNextNode()!=null) {
      currentNode=currentNode.getNextNode();
    }
    node newNode=new node(elem, null);
    currentNode.setNextNode(newNode);
    sizeList++;
    }
  }

  @Override
  public void add(Object elem) {
    addLast(elem);    
  }

  @Override
  public Object removeFirst() {
    if (isEmpty()) throw new RuntimeException("List Is Empty!");
    else{
      node<T> OldRoot=root;
      root=root.getNextNode();

      OldRoot.setNextNode(null);

      T data=OldRoot.getData();
      OldRoot.setData(null);
      sizeList--;
      return data;
    }
    
  }


  private Object removeAt(int index) {
    if (index==0) removeFirst();
    if (index==sizeList) removeLast();

    int count=0;
    node<T>temp=root;
    node<T>currentNode=root.getNextNode();
    while (count!=index) {
      currentNode=currentNode.getNextNode();
    }
    temp.setNextNode(currentNode.getNextNode());
    currentNode.setNextNode(null);
    T data=currentNode.getData();
    currentNode.setData(null);
    sizeList--;

    return data;
  }

  @Override
  public Object remove(Object elem) {
    if (containsIndexof(elem)==-1) return null;
    else return removeAt(containsIndexof(elem));
  }
  

  @Override
  public Object removeLast() {
    if (isEmpty()) throw new RuntimeException("List Is Empty!");
    else{
      node<T> temp=root;
      node<T> currentNode2=root.getNextNode();
      while (currentNode2.getNextNode()!=null) {
        currentNode2=currentNode2.getNextNode();
      }      
      temp.setNextNode(null);
      T data=currentNode2.getData();
      currentNode2.setData(null);
      sizeList--;
      return data;
    }
  }



  @Override
  public int containsIndexof(Object elem) {
    if(isEmpty())throw new IllegalArgumentException();
    else{
      int count=0;
      node<T>currentNode=root;
      while (currentNode!=null) {
        if (currentNode.getData()==elem) return count;
        count++;
      }
    }
    return -1;
  }

  @Override
  public node getFirst() {
    if (isEmpty()) return null;
    return root;
  }

  @Override
  public node getLast() {
    if (isEmpty()) return null;

    node<T>currentNode=root;
    while(currentNode.getNextNode()!=null){
      currentNode=currentNode.getNextNode();
    }
    return currentNode;
  }

  @Override
  public node getNodeIndexOf(int index) {
    if (index<0||index>sizeList) return null;
    int count=0;
    node<T>currentNode=root;
    while (count!=index) {
      currentNode=currentNode.getNextNode();
    }
    return currentNode;
  }

  @Override
  public void traveral() {
    if (isEmpty()) throw new RuntimeErrorException(null, "List is Empty");
    
    node<T>currentNode=root;
    while (currentNode!=null) {
      System.out.print(currentNode.getData()+" => ");
      currentNode=currentNode.getNextNode();
    }
    System.out.println("Null");
  }


}

