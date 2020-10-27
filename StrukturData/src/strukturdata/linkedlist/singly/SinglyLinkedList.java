package linkedlist.singly;

public class SinglyLinkedList {

    protected Node head;
    protected Node tail;
    private int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        Node temp = head;

        System.out.print(size + ": ");

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.pointer;
        }

        System.out.println();
    }

    public void addFirst(Node input) {
        if (isEmpty()) {
            head = tail = input;
        } else {
            input.pointer = head;
            head = input;
        }

        size++;
    }

    public void addLast(Node input) {
        if (isEmpty()) {
            head = tail = input;
        } else {
            tail.pointer = input;
            tail = input;
        }

        size++;
    }

    public void insertBefore(Object key, Node input) {
        if (!isEmpty() && head.data == key) {
            addFirst(input);
            return;
        }

        Node temp = head;

        while (temp != null) {
            if (temp.pointer != null && temp.pointer.data == key) {
                input.pointer = temp.pointer;
                temp.pointer = input;

                size++;
                break;
            }

            temp = temp.pointer;
        }
    }

    public void insertAfter(Object key, Node input) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                input.pointer = temp.pointer;
                temp.pointer = input;

                size++;
                break;
            }

            temp = temp.pointer;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            return;
        }

        if (size == 1) {
            head = tail = null;
        } else {
            head = head.pointer;
        }

        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            return;
        }

        if (size == 1) {
            head = tail = null;
        } else {
            Node temp = head;

            while (temp.pointer != tail) {
                temp = temp.pointer;
            }

            tail = temp;
            temp.pointer = null;
        }

        size--;
    }

    public void remove(Object key) {
        if (!isEmpty() && head.data == key) {
            removeFirst();
            return;
        }

        Node temp = head;

        while (temp != null) {
            if (temp.pointer != null && temp.pointer.data == key) {
                temp.pointer = temp.pointer.pointer;

                size--;
                break;
            }

            temp = temp.pointer;
        }
    }
}
