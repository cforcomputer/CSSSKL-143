import javax.naming.LinkException;

public class Queue<C> {

    public static void main(String[] args) throws Exception {
        Queue a = new Queue<Character>();
        // Queue<Character> q = new LinkedList<Character>();
        a.queue('R');
        a.queue('a');
        a.queue('c');
        a.queue('e');
        //a.push('c');
        //a.push('a');
        a.queue('r');

        System.out.println("Size : " + a.size());

        while (!a.isEmpty()) {
            System.out.println(a.dequeue());
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

    private void queue(Object input) throws Exception {
        if (input == null) {
            throw new LinkException("Should not be null");
        }
        head = new Node(input, head);
    }

    private Object dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception(("Cannot delete from empty queue"));
        }

        Node cNode = head;
        Node pNode = null;

        //while the next node is not equal to null
        while (cNode.getNext() != null) {
            pNode = cNode; // set previous node to the current node
            cNode = cNode.getNext();
        }

        Object item;

        if (pNode == null) {
            item = head.getData();
            head = head.getNext();
        } else {
            item = cNode.getData();
            pNode.setNext(cNode.getNext());
        }
        return item;
    }

    private int size() {
        int count = 0; // keeps track of # of nodes

        Node currNode = head;
        while (currNode != null) {
            count++;
            currNode = currNode.next;
        }
        return count;
    }
}
