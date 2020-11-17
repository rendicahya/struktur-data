package strukturdata.linkedlist.singly;

public class Node {

    public Object data;
    public Node pointer;

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
    }

    public Node(Object data, Node pointer) {
        this.data = data;
        this.pointer = pointer;
    }
}
