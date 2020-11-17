package strukturdata.tree;

public class Main {

    public static void main(String[] args) {
        var A = new Node("A");
        var B = new Node("B");
        var C = new Node("C");
        var D = new Node("D");
        var E = new Node("E");
        var F = new Node("F");
        var G = new Node("G");
        var H = new Node("H");
        var I = new Node("I");

        A.left = B;
        A.right = C;

        B.left = D;
        B.right = E;

        D.left = H;
        D.right = I;

        C.left = F;
        C.right = G;

        var tree = new BinaryTree(A);

        System.out.println(tree.levelOrder());
    }
}
