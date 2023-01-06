package DoublyLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class mainDoubly {
    public static void main(String[] args) {
        doubly_linked_list doublyLinkedList = new doubly_linked_list<Integer>();
        doublyLinkedList.add(1);
        doublyLinkedList.add(6);
        doublyLinkedList.traveralList();

        doublyLinkedList.addHead(55);
        doublyLinkedList.addTail(90);
        if (doublyLinkedList.contains(6)) {
            doublyLinkedList.remove(6);
        }
        System.out.println("Head " + doublyLinkedList.getHead().getData());
        System.out.println("Tail " + doublyLinkedList.getTail().getData());
        doublyLinkedList.traveralList();

        doublyLinkedList.addMidle(832, 2);
        doublyLinkedList.addTail(100);

        doublyLinkedList.traveralList();
        System.out.println("Head " + doublyLinkedList.getHead().getData());
        System.out.println("Tail " + doublyLinkedList.getTail().getData());

    }
}
