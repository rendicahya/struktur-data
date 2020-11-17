package strukturdata.linkedlist.doubly;

public class Main {

    public static void main(String[] args) {
        var list = new DoublyLinkedList();

        list.print();

        list.addFirst(new Node("B"));
        list.print();

        list.addFirst(new Node("A"));
        list.print();

        list.addLast(new Node("E"));
        list.print();

        list.insertAfter("B", new Node("C"));
        list.print();

        list.insertBefore("E", new Node("D"));
        list.print();
        
        list.removeFirst();
        list.print();
        
        list.removeLast();
        list.print();
        
        list.remove("C");
        list.print();
    }
}
