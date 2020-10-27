package queue;

public interface Queue {

    void enqueue(Object input);

    Object dequeue();
}
