import java.util.concurrent.ExecutionException;

public class Stack<C>{

    public static void main(String[] args) throws Exception {
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
     * Checks to see if the head of the list is equal to null
     * @return returns true if empty, false if otherwise
     */
    private boolean isEmpty() {
        return (head == null);
    }

    private Node head = null;
    /**
     * Nested node class
     * Defines the node for the linked list
     * */
    private class Node {
        Object data = null;
        Node next = null;

        Node(Object d, Node n) {
            data = d; // shallow copy on purpose for ADTs
            next = n;
        }
        /**
         * Getter for next
         * */
        public Node getNext() {
            return this.next;
        }

        /**
         * Getter for data
         * */
        public Object getData() {
            return this.data;
        }

        /**
         * Setter for variable Node next
         * */
        public void setNext(Node fnext) {
            next = fnext;
        }
    }

    /**
     * Method to add at start of list
     * Inserts to the top of the stack
     * Consider using your superclass methods here rather than implementing push
     * /shrug
     * @throws Exception = when error with input
     * @param next = object val to be added to stack
     * */
    public void push(Object next) throws Exception {
        // check to see if null
        if (next == null) {
            throw new Exception("Value should not be null");
        }
        // if the value is not null, create new node
        head = new Node(next, head);
    }

    /**
     * The list accessor, increments through the list and
     * counts the total number of nodes (a standard accessor)
     * @return the total number of nodes (the size of the list)
     * */
    public int size() {
        int count = 0; // keeps track of # of nodes

        // increment through list
        Node currNode = head;
        while (currNode != null) {
            count++;
            currNode = currNode.next;
        }
        return count; // return the # of nodes --> size()
    }

    /**
     * Removes at start of list
     * Removes from the top of the stack
     * Consider using superclass instead of popping by hand
     * @return the current item being popped
     * @throws Exception = when error with input
     * */
    public Object pop() throws Exception {
        // Check to see if the stack is empty
        if (isEmpty()) {
            throw new Exception("Cannot delete from an empty stack.");
        }

        Object itemToPop = head.getData(); // set itemToPop as current node data
        head = head.getNext(); // set current head as next head (removing node)
        return itemToPop; // return the removed item
    }
}
