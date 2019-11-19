public class Stack<C>{

    public static void main(String[] args) {
        Stack a = new Stack<Character>();
        // Queue<Character> q = new LinkedList<Character>();
        a.push('R');
        a.push('a');
        a.push('c');
        a.push('e');
        //a.push('c');
        //a.push('a');
        a.push('r');

        System.out.println("Size : " + a.size());

        while (!a.isEmpty()) {
            System.out.println(a.pop());
        }
    }

    /**
     * Nested node class
     * Defines the node for the linked list
     * */
    private class Node {
        Object data = null;
        Node next = null;

        public Node(Object d, Node n) {
            data = d; // shallow copy on purpose for ADTs
            next = n;
        }
    }
}
