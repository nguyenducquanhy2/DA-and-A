

public class node<T> {
  
  private T data;
  private node nextNode;
  public node(){}
  
  public node(T data, node nextNode) {
    this.data = data;
    this.nextNode = nextNode;
  }
  

  public T getData() {
    return data;
  }
  public void setData(T data) {
    this.data = data;
  }
  public node getNextNode() {
    return nextNode;
  }
  public void setNextNode(node nextNode) {
    this.nextNode = nextNode;
  }

}
