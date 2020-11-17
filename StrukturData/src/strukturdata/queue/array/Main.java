package strukturdata.queue.array;

public class Main {

    public static void main(String[] args) {
        var q = new ArrayQueue();

        q.init(5);
        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");
        q.print();

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.print();
        
        q.enqueue("D");
        q.enqueue("E");
        q.print();
        
        q.enqueue("F");
        q.enqueue("G");
        q.print();
    }
}

