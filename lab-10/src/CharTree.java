import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;
import java.sql.PreparedStatement;

/**
 * Class invariant: This code for a binary tree satisfies the
 * binary search tree storage rule.
 * CSSSKL 143
 * @author Patrick O'Brien
 * @version 12/8/2019
/**
 */

 public class CharTree {
     
     /*Inner class Node, 2 references(pointers), one data element
      * The only reason this inner class is static is that it is used in 
      * the static methods insertInSubtree , isInSubtree , and 
      * showElementsInSubtree. This class should have more methods. 
      * This is just a sample of possible methods.
      */


     private static class TreeNode {

         // Declare private data type char
         // Declare 2 links, rightLink & leftLink of type TreeNode
         private char data;
         private TreeNode leftLink;
         private TreeNode rightLink;

         // Default constructor to create a new tree
         public TreeNode(char newData) {
             data = newData;
             leftLink = null;
             rightLink = null;
         }
         
        // Parametrized constructor to build a node
        public TreeNode(char newData, TreeNode newLeftLink, TreeNode newRightLink) {// complete the constructor
             data = newData;
             leftLink = newLeftLink;
             rightLink = newRightLink;
        }

        /**
         * Getter for data
         * */
        public char getData() {
            return data;
        }

        /**
         * Getter for left TreeNode
         * */
        public TreeNode getLeftLink() {
            return leftLink;
        }

        /**
         * Getter for right TreeNode
         * */
        public TreeNode getRightLink() {
            return rightLink;
        }
     }           //End of IntTreeNode inner class
     
     // The first node of the tree, called root
     private TreeNode root;
     
     // Default constructor to build the CharTree
     public CharTree( ) {
         root = null;
     }
     
     // Utility methods for CharTree:
     public void add(char item) {
         root = insertInSubtree(item, root);
     }
 
     
     public boolean contains(char item) {
         return isInSubtree(item, root);
     }
     
     public void showElements( ) {
         showElementsInSubtree(root);
     }
     /**
     Returns the root node of a tree that is the tree with root node
     subTreeRoot, but with a new node added that contains item.
     */
     private static TreeNode insertInSubtree(char item, TreeNode subTreeRoot) {
         if (subTreeRoot == null)
            return new TreeNode(item, null, null);
         else if (item < subTreeRoot.data) {
             subTreeRoot.leftLink = insertInSubtree(item, subTreeRoot.leftLink);
                return subTreeRoot;
         }
         else {         //item >= subTreeRoot.data
               subTreeRoot.rightLink = insertInSubtree(item, subTreeRoot.rightLink);
                 return subTreeRoot;
         }
     }
     
     private static boolean isInSubtree(char item, TreeNode subTreeRoot) {
		// base case: is subTreeRoot null?    then return false
		if (subTreeRoot == null) {
		    return false;
        }
		// else if subTreeRoot.data == item   what would you return?
       else if (subTreeRoot.data == item) {
           return true;
        }
        // else item < subTreeRoot.data
		// recursive call
		else if (item < subTreeRoot.data) {
		    isInSubtree(item, subTreeRoot.leftLink);
            //else         // item >= link.data
            // recursive call
        } else {
		    isInSubtree(item, subTreeRoot.rightLink);
        }
		return false;
     }
        
     private static void showElementsInSubtree(TreeNode subTreeRoot) { //Uses inorder traversal.
         if (subTreeRoot != null) {
             
             showElementsInSubtree(subTreeRoot.leftLink);
             System.out.print(subTreeRoot.data + " ");
             showElementsInSubtree(subTreeRoot.rightLink);
         }                    //else do nothing. Empty tree has nothing to display.
     }

    public static void main(String[] args) {
        CharTree tree = new CharTree();
        tree.add('c');
        tree.add('a');
        tree.add('t');
        tree.add('s');

        // provided driver code
        System.out.println(tree.toString(tree.root)); // inorder prints a c t
        System.out.println(tree.countNodes(tree.root));
        System.out.println(tree.getDepth(tree.root));
        System.out.println(tree.getParent('a', tree.root)); // can be tricky
        showElementsInSubtree(tree.root);

    }

    /**
     * The getParent method returns the parent root using recursion
     * @param a = char
     * @param p = TreeNode
     * */
    private TreeNode getParent(char a, TreeNode p) {
        if (this.root == null) {
            return null;
        }

        // keep track of the current root
        CharTree currentRoot = new CharTree();

        // if the right or left link are equal to a
        if (p.getLeftLink().data == a || p.getRightLink().data == a) {
            return this.root; // return the current root as parent
        }

        // else if the current root is less than the previous node
        else {
            if (p.data < root.data) {
                return getParent(a, p.getRightLink());
            } else {
                return getParent(a, p.getLeftLink());
            }
        }
     }

     /**
      * The getDepth method returns the max depth of the BST
      *
      * */
    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = getDepth(root.leftLink);
        int rightDepth = getDepth(root.rightLink);

        int bigger = Math.max(leftDepth, rightDepth);

        return bigger + 1;
    }

    /**
     * This method returns the total number of nodes as an int
     * */
    private int countNodes(TreeNode root) {
         if (root == null) {
             return 0;
         }
         int count = 1;

         count += countNodes(root.leftLink);
         count += countNodes(root.rightLink);
         return count;
    }

    /**
     * This method returns the array represented visually
     * as a string
     * */
    public String toString(TreeNode root) {
        String result = "";
        if (root == null) {
            return "The BST is empty";
        }
        result += toString(root.getLeftLink());
        result += toString(root.getLeftLink());
        result += root.data;
        return result;
    }

}
