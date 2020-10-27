package linkedlist.singly;

public class CircularlyLinkedList {

    private Node tail;
    private int size;

    public void addFirst(Node input) {
        if (isEmpty()) {
            tail = input;
        } else {
            input.pointer = tail.pointer;
            tail.pointer = input;
        }

        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        Node temp = isEmpty() ? null : tail.pointer;

        System.out.print(size + ": ");

        while (temp != tail) {
            System.out.print(temp.data + "->");
            temp = temp.pointer;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        var list = new CircularlyLinkedList();

        list.addFirst(new Node("B"));
        list.addFirst(new Node("A"));
        list.print();
    }
}
