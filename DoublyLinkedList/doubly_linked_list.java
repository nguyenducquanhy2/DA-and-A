package DoublyLinkedList;

import javax.management.RuntimeErrorException;

public class doubly_linked_list<T> implements DoublyLinkedList {
  private node head=null;
  private node tail=null;
  private int sizeList=0;

  public doubly_linked_list(){}

  @Override
  public int size() {    
    return sizeList;
  }

  @Override
  public boolean isEmpty() {
    if(size()==0) return true;

    return false;
  }

  @Override
  public void add(Object elem){
    addTail(elem);
  }

  @Override
  public void addHead(Object elem) {
    if (isEmpty()) {
      head=tail=new node(elem, null, null);
      sizeList++;
    }
    else{
      node newNode=new node(elem, null, head);  
      head.setPreviousNode(newNode);
      head=head.getPreviousNode();
      sizeList++;
    }
    
  }

  @Override
  public void addTail(Object elem) {
    if (isEmpty()) {
      head=tail=new node(elem, null, null);
      sizeList++;
    }
    else{
      node newNode=new node(elem, tail, null);
      tail.setNextNode(newNode);
      tail=tail.getNextNode();
      sizeList++;
    }
    
  }

  @Override
  public void addMidle(Object elem,int index) {
    if(index==0)addHead(elem);
    if(index==sizeList)addTail(elem);
    if (index<0||index>sizeList) throw new IllegalArgumentException();

    if (isEmpty()) {
      head=tail=new node(elem, null, null);
      sizeList++;
    }
    else{     
      node<T>currentnode;
      int i;
      if (index<sizeList/2) {
        currentnode=head;
        i=0;
        while (i<index) {
          currentnode=currentnode.getNextNode();
          i++;
        }
        node newNode=new node(elem, currentnode, currentnode.getNextNode());
        currentnode.getNextNode().setPreviousNode(newNode);
        currentnode.setNextNode(newNode);
        sizeList++;
      }
      else{
        currentnode=tail;
        i=sizeList-1;
        while (i>index) {
          currentnode=currentnode.getPreviousNode();
          i--;
        }
        node newNode=new node(elem, currentnode.getPreviousNode(), currentnode);
        currentnode.getPreviousNode().setNextNode(newNode);
        currentnode.setPreviousNode(newNode);
        sizeList++;
      }
      
    }
    
  }

  @Override
  public Object removeHead() {
    if(isEmpty())throw new RuntimeException("List Empty!");
    else{
      node data=head;
      head.getNextNode().setPreviousNode(null);
      head=head.getNextNode();
      data.setNextNode(null);
      sizeList--;
      return data.getData();
    }    
  }

  @Override
  public Object removeTail() {

    if(isEmpty())throw new RuntimeException("List Empty!");
    else{
      node data=tail;
      tail.getPreviousNode().setNextNode(null);
      tail=tail.getPreviousNode();
      data.setPreviousNode(null);
      sizeList--;
      return data.getData();
    }      
  }

  @Override
  public Object remove(node node) {
    if (node.getPreviousNode()==null)removeHead();
    if (node.getNextNode()==null)removeTail();

    node.getPreviousNode().setNextNode(node.getNextNode());
    node.getNextNode().setPreviousNode(node.getPreviousNode());
    sizeList--;
    Object data=node.getData();
    node.setNextNode(null);
    node.setPreviousNode(null);
    node.setData(null);
    node=null;
    return data;


  }

  @Override
  public boolean remove(Object elem) {
    if(indexOf(elem)==-1) return false;
    else{
      removeAt(indexOf(elem));
      return true;
    }
  }

  @Override
  public Object removeAt(int index) {
    

    if (index<0||index>sizeList) throw new RuntimeException("Out of memory!");
    else{

      if(index==0) return removeHead();
      if(index==sizeList) return removeTail();

      node<T>currentnode;
      if (index<sizeList/2) {
        currentnode=head;
        int i=1;
        while (i!=index) {
          currentnode= currentnode.getNextNode();
          i++;
        }
        return remove(currentnode);
      }
      else{
        currentnode=tail;
        int i=sizeList-1;
        while (i!=index) {
          currentnode= currentnode.getPreviousNode();
          i--;
        }
        return remove(currentnode);
      }
    }
  
  }

  @Override
  public boolean contains(Object elem) {
    node <T>currentNode=head;
    while(currentNode!=null){        
      if (currentNode.getData()!=elem) return true;      
      currentNode=currentNode.getNextNode();        
    }
    return false;
  }

  @Override
  public int indexOf(Object elem) {
    node <T>currentNode=head;
    int count=0;
    while(currentNode!=null){        
      if (currentNode.getData()!=elem) return count;      
      currentNode=currentNode.getNextNode();   
      count++;     
    }    
    return -1;
  }

  @Override
  public node getHead() {
    if (isEmpty()) throw new RuntimeException("List Empty!");
    else{
      return head;
    }
    
  }

  @Override
  public node getTail() {
    if (isEmpty()) throw new RuntimeException("List Empty!");
    else{
      return tail;
    }
  }

  @Override
  public node getNodeByIndex(int index) {
    if (index<0||index>sizeList) throw new RuntimeException("Out of memory!");
    else{
      node<T>currentNode=head;
      int count=0;
      while (count!=index) {
        currentNode=currentNode.getNextNode();
        count++;        
      }
      return currentNode;
    }   
    
  }

  @Override
  public void traveralList() {
    node<T>currentNode=head;
    while(currentNode!=null){
      System.out.print(currentNode.getData()+" => ");
      currentNode=currentNode.getNextNode();
    }    
    System.out.println("null");
  }


  
}
