package queue.array;

import java.util.Arrays;
import queue.Queue;

public class ArrayQueue implements Queue {

    Object[] data;
    int front;
    int count;

    public void init(int size) {
        data = new Object[size];
    }

    @Override
    public void enqueue(Object input) {
        if (isFull()) {
            System.out.println("Queue penuh");

            return;
        }

        var rear = (front + count) % data.length;
        data[rear] = input;
        count++;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong");

            return null;
        }

        var value = data[front];
        front = (front + 1) % data.length;
        count--;

        return value;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == data.length;
    }

    public void print() {
        System.out.println(count + ": " + Arrays.toString(data));
    }
}
