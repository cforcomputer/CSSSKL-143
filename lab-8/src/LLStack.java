
/**
 * This class will use Nodes to form a linked list. It implements the LIFO
 * (Last In First Out) methodology to reverse the input string.
 **/

public class LLStack {

    private Node head;

    // Constructor with no parameters for outer class
    public LLStack(Object next) {
        // to do
    }

    public LLStack() {

    }

    // This is an inner class specifically utilized for LLStack class,
    // thus no setter or getters are needed
    private class Node {
        private Object data;
        private Node next;

        // Constructor with no parameters for inner class
        public Node() {
            data = 0;
        }

        // Parametrized constructor for inner class
        public Node(Object newData, Node nextLink) {
            // to do: Data part of Node is an Object
            // to do:  Link to next node is a type Node
            data = newData;
            next = nextLink;
        }

        public Node(Object itemData) {
            data = itemData;
            next = null;
        }
    }

    // Adds a node as the first node element at the start of the list with the specified data.
    public void addToStart(Object itemData) {
        // to do
        // NOTE: the logic here could be implemented in a single line,
        // but not required to be a one liner.

        // set the head = to new Node with itemData as input
        head = new Node(itemData);
    }

    // Removes the head node and returns the data Object being
    // deleted.
    // Returns null if the list is empty.
    public Object deleteHead() {
        //TODO

        // if the list is not empty
        if (head.next != null) {
            // Set temp list pointer to head
            Node currentNode = head;
            // make the 2nd item in the list equal to head
            head = currentNode.next;
            // return the original head
            // other head is garbage collected
            return currentNode;
        }
        // return null if the list is empty
        return null;
    }

    // Returns the size of linked list by traversing the list
    public int size() {
        // counting variable that keeps track of # of nodes
        int count = 0;

        // Make it so that currentNode is pointing
        // to head.
        Node currentNode = head;

        // then iterate through the linked list
        while (currentNode != null) {
            // each loop, set it so that currentNode is
            // equal to the next node in the list.
            currentNode = currentNode.next;
        }
        return count;
    }

    // Finds if there is match for the given object
    public boolean contains(Object item) {
        // to do
        if (item == null) {
            return false;
        }
        // temp node for keeping track
        Node currNode = head;
        // perform an iterative search through the linked list
        while (currNode != null) {
            if (currNode.data.equals(item)) {
                return true;
            }
            else {
                currNode = currNode.next;
            }
        }
        return false;
    }

    // Finds the first node containing the target item, and returns a
    // reference to that node. Return null if target not found.
    private Node findData(Object target) {
        if (target == null)
        {
            return null;
        }
        Node current = head;
        Object itemAtPosition;
        while (current != null) {
            itemAtPosition = current.data;

            if (itemAtPosition.equals(target))
                return current;
            current = current.next;
        }
        return null;      // Target not found!
    }


    public void outputList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public String toString() {
        String retValue = "";
        Node current = head;

        while (current != null) {
            retValue += current.data.toString() + " ";
            current = current.next;
        }
        return retValue;
    }


    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        //TODO
        if (head == null) {
            return;
        }
        // set head = null, if not
        head = null;
    }

    // For two lists to be equal they must contain the same data items in
// the same order. The equals method of T is used to compare data items.
    public boolean equals(Object otherObject) {
        if (otherObject == null)
            return false;

        else if (!(otherObject instanceof LLStack))
            return false;

        else {
            LLStack otherList = (LLStack) otherObject;
            if (size() != otherList.size())
                return false;
            Node position = head;
            Node otherPosition = otherList.head;
            while (position != null) {
                if (!(position.data.equals(otherPosition.data)))
                    return false;
                position = position.next;
                otherPosition = otherPosition.next;
            }
            return true;      // objects are the same
        }
    }

    // There is no need to modify the driver
    public static void main(String[] args) {

// input data for testing
        String target = "Somethings!";
        String palindrome = "a man a plan canal panama";

        LLStack list = new LLStack();
// objects to be added to list
        Object object1 = target.charAt(4);
        Object object2 = target.charAt(1);
        Object object3 = target.charAt(2);
        Object object4 = target.charAt(9);
        Object object20 = target.charAt(6);  // will not be added to list

// add 4 objects to our linked list
        list.addToStart(object1);
        list.addToStart(object2);
        list.addToStart(object3);
        list.addToStart(object4);

// make sure all are added
        System.out.println("My list has " + list.size() + " nodes.");
// display the newly created list
        list.outputList();
        System.out.println("toString = " + list.toString());

// test findData() here
        Node itemFound = list.findData(object1);
        System.out.println("Item found: " + itemFound.data);

// Test contains() here
        if (list.contains(object1))
            System.out.println("Object1 found.");
        else
            System.out.println("There is NO object1.");

        if (list.contains(object20))
            System.out.println("Object20 found.");
        else
            System.out.println("There is NO object20.");

// Creating a new linked list by iteration using different input
        LLStack linkedList = new LLStack();

        for (int i = 0; i < palindrome.length(); i++) {
            Object object = palindrome.charAt(i);
            linkedList.addToStart(object);
        }
// Display your list now
        linkedList.outputList();

// More tests; size() and is Empty()
        System.out.println("This time my list has " + linkedList.size() + " nodes.");
        System.out.println("Is our linkedList empty? " + linkedList.isEmpty());

// Creating an Object of different class to compare with Character class
        Object mismatchObject = Character.getNumericValue(target.charAt(0));

        boolean areEqual = linkedList.equals(mismatchObject);
        System.out.println("Are the 2 objects equal? " + areEqual);

        boolean areEqualAgain = linkedList.equals(linkedList);
        System.out.println("Are the 2 objects equal? " + areEqualAgain);

// test deleteHead()
        list.deleteHead();
        if (list.contains(object4))
            System.out.println("Object4 found.");
        else
            System.out.println("Object4 has been deleted!");
        while (!list.isEmpty()) {
            list.deleteHead();
        }
        System.out.println("Start of list:");
        list.outputList();
        System.out.println("End of list.");


        System.out.println("In the begining linkedList has " + linkedList.size() + " nodes");
        linkedList.clear();

        System.out.println("After testing clear(), linkedList has " + linkedList.size() + " nodes");
    }

}


