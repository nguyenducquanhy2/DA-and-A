package DoublyLinkedList;

public class node<T> {

  public node(T data, node prev, node nextNode) {
    this.data = data;
    this.prev = prev;
    this.nextNode = nextNode;
  }
  private T data;
  private node prev;
  private node nextNode;

  public node getPreviousNode() {
    return prev;
  }
  public void setPreviousNode(node prev) {
    this.prev = prev;
  }
  public node getNextNode() {
    return nextNode;
  }
  public void setNextNode(node nextNode) {
    this.nextNode = nextNode;
  }
  public T getData() {
    return data;
  }
  public void setData(T data) {
    this.data = data;
  }
}
