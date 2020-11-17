package strukturdata.stack.array;

import java.util.EmptyStackException;

public class ArrayStack {

    Object[] data;
    int top = -1;

    public void init(int size) {
        data = new Object[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public void push(Object data) {
        if (isFull()) {
            resize();
        }

        System.out.println("Pushing " + data);

        this.data[++top] = data;
    }

    public void resize() {
        var newArr = new Object[2 * data.length];

        System.out.println("Resizing stack to " + 2 * data.length);
        System.arraycopy(data, 0, newArr, 0, data.length);

        data = newArr;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return data[top--];
    }

    public Object peek() {
        return isEmpty() ? null : data[top];
    }
}
