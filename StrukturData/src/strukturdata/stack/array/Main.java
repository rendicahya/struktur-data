package strukturdata.stack.array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var stack = new ArrayStack();

        stack.init(2);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack.pop());
        stack.push("D");
        stack.push("E");

        System.out.println(Arrays.toString(stack.data));
    }
}
