package strukturdata.stack.linkedlist;

public class Main {

    public static void main(String[] args) {
        var s = new LinkedListStack();
        
        s.push("a");
        s.push("b");
        s.push("c");
        
        s.print();
        
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
