// File Name:  BinaryTree.java                                                 *
// Project: Homework 3
//Authors: Joshua Patterson & Rediet Teferi & Adam Reinart
//Date: November 27, 2018
//Purpose: The purpose of this is to implement a in-order traverse method

public class BinaryTree {
  public static void inOrderPrinter( BinaryTreeNode node ) {
       if( node == null ) {
          return;
       }
       inOrderPrinter( node.getChild( "L" ) );
       System.out.print( "[" + node.getString() + "]");
       inOrderPrinter( node.getChild( "R" ) );
    }

  public static void main( String[] args ) {
   BinaryTree tree = new BinaryTree();
   BinaryTreeNode root = new BinaryTreeNode( 0 );
   root.add( 1, "L" );
   root.add( 2, "R" );
   BinaryTreeNode one = root.getChild( "L" );
   BinaryTreeNode two = root.getChild( "R" );
   tree.inOrderPrinter(one);
   System.out.print("\n");
   one.add( 3, "L" );
   one.add( 4, "R" );
   two.add( 5, "L" );
   two.add( 6, "R" );
   BinaryTreeNode six = two.getChild( "R" );
   six.add( 7, "L" );
   six.add( 8, "R" );
   tree.inOrderPrinter(six);
   System.out.print("\n");
   tree.inOrderPrinter(one);
   System.out.print("\n");
   tree.inOrderPrinter(two);
   System.out.print("\n");
   tree.inOrderPrinter(root);
   System.out.print("\n");
}
  }
