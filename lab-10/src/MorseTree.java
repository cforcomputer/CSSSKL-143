import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 * MorseTree.java
 * CSSSKL 143 Binary Search Tree Lab
 * Author: Rob Nash
 *
 * This class reads in data from a text file ("data.txt") and populates a binary tree with an
 * ordering constraint.  See the lab instructions for more information, but in general, dots go right
 * and dashes go left when constructing or traversing a Morse code tree.  Search for //TODO
 * in the code to see what code you have to implement.
 *
 * Start with the constructor. In your constructor read each line in from the textfile first,
 * calling add() for each {letter, morseCodeStr} pair.
 *
 */
public class MorseTree {
    //TODO: Complete constructor
    public MorseTree() {
		try {
            //first, open data.txt, add each line to the tree
            File text = new File("data.txt");
            Scanner fin = new Scanner(text);

            int lineNumber = 1; //counter for # of lines if needed
            while (fin.hasNextLine()) {

                //for each line in the file,
                //  get the letter(char) and the Morse string
                //  call add() with this data
                //  print out the letter and Morse string here for debugging

                String line = fin.nextLine().trim();
                if (line.length() > 0) {
                    add(line.substring(1).trim(), line.charAt(0));
                    System.out.println("Added [ " + line.substring(1).trim()
                            + " = " + line.charAt(0) + " ] to the tree");
                }
                lineNumber++;
            }
            fin.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//TODO
    private TreeNode root;


    public void add(String morseStr, char letter) {
        root = insertInSubtree(morseStr, letter, root);
    }

    //TODO: recursively complete this function.  It's only a few characters different from findInSubtree()
	private TreeNode<Character> insertInSubtree(String morseStr, char letter, TreeNode subtree) {

        /*
         * Note: public add function has been provided
         * Walk the tree while morseStr.length() > 0, removing the leading character from the morse
         * string and ...
         *  - Create a new TreeNode if your subtree is null
         *  - Recursively move down the tree, right right if a "m" and left if a "-".
         * */


        //base case 1 : subtree is null
		//base case 2 : morseStr is of length 0
		//recursive case 1: the first char in morseStr is a '.', so recursively traverse tree
		//recursive case 2: the first char in the morseStr is a '-', so recurse accordingly
        if (subtree == null) {
            return TreeNode<>
        }

        while (morseStr.length() > 0) {
            // remove the leading character from the string
        }

		return subtree;  //always the last line, always return the node you are working on
	}

    public Character translate(String morseStr) {
        return findInSubtree(morseStr, root);
    }

    //TODO: recursively complete this function.  Very similar to insertInSubtree()
	private Character findInSubtree(String morseStr, TreeNode subtree) {
		//base case 1 : subtree is null
		//base case 2 : morseStr is of length 0
		//recursive case 1: the first char in morseStr is a '.', so recursively traverse tree
		//recursive case 2: the first char in the morseStr is a '-', so re-curse accordingly
		return null;  //remove this
	}

    //TODO: Non-recursive function that calls other (recursive) functions
	public String translateString(String tokens) {
		String retVal = "";
		//build a scanner here using tokens as input
		//iterate over the tokens calling translate on each token (substring separated by a space)
		//concat these characters and return them

		return retVal;
	}

    public String toMorseCode(Character c) {

        //walk the tree looking for the TreeNode with the char c in it
            //preorder walk?
            //inorder walk?
            //postorder walk?

        //when you've found the char c, report the path from the root to the node
        //and build the morse code by adding a "." when you go right, "-" when you go left
        return new String("You wish.");
    }

    @Override
    public String toString() {
        return inorderWalk();
    }
    private String inorderWalk() {

        return new String("Another wish.");
    }

    public static void main(String[] args) {
        MorseTree mt = new MorseTree();  //builds our tree using data from a file

        //System.out.println(mt.translate("..."));  //prints out S
        //System.out.println(mt.translate("---"));  //prints out O
        //System.out.println(mt.translate(".......-"));  //prints out null

        //System.out.println(mt.translateString("... --- ..."));  //SOS
        //System.out.println(mt.toMorseCode('S'));  //find where we are in the tree, remember path to root
    }

    // Inner class to create the linked structure
    private class TreeNode<Character> {

        Object data;     // holds a given node’s data
        TreeNode right;
        TreeNode left;

        public TreeNode() {
            this.data = null;
            this.right = null;
            this.left = null;
        }

        public void setRight(TreeNode rightNode) {
            this.right = rightNode;
        }

         public void setLeft(TreeNode leftNode) {
            this.left = leftNode;
        }

    }
}
