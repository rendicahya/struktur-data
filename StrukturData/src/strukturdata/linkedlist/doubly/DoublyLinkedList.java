package linkedlist.doubly;

public class DoublyLinkedList {

    private Node head, tail;
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
            temp = temp.next;
        }

        System.out.println();
    }

    public void addFirst(Node input) {
        if (isEmpty()) {
            head = tail = input;
        } else {
            input.next = head;
            head.prev = input;
            head = input;
        }

        size++;
    }

    public void addLast(Node input) {
        if (isEmpty()) {
            head = input;
            tail = input;
        } else {
            tail.next = input;
            input.prev = tail;
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
            if (temp.data == key) {
                input.prev = temp.prev;
                input.next = temp;
                temp.prev.next = input;
                temp.prev = input;

                size++;
                break;
            }

            temp = temp.next;
        }
    }

    public void insertAfter(Object key, Node input) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                input.prev = temp;
                input.next = temp.next;
                temp.next.prev = input;
                temp.next = input;

                size++;
                break;
            }

            temp = temp.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            return;
        }

        if (size == 1) {
            head = tail = null;
        } else {
            head.next.prev = null;
            head = head.next;
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
            tail.prev.next = null;
            tail = tail.prev;
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
            if (temp.data == key) {
                if (temp == tail) {
                    removeLast();
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                size--;
                break;
            }

            temp = temp.next;
        }
    }
}
