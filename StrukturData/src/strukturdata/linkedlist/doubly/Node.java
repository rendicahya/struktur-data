package strukturdata.linkedlist.doubly;

public class Node {

    public Object data;
    public Node prev, next;

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
    }

    public Node(Object data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
