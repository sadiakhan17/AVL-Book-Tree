import java.io.*;
import java.util.*;

public class TestAVLTree {
  public static void main(String[] args)throws IOException{
	  
	  
	 //calling function read file and create tree
	getInput();
	
 }
 
 public static void getInput()throws IOException{
	 
 	//create avl tree
 	AVLTree<Book> tree = new AVLTree<>();
	 
 	//open file
 	File file = new File("book.txt"); 
	 
 	//scanner object using the input file
 	Scanner inputFile = new Scanner(file);
	
	
 	//read lines from the file until no more are left
 	while (inputFile.hasNext()){
 		String isbn= inputFile.nextLine();
 		String name=inputFile.nextLine();
 		String author=inputFile.nextLine();
 		tree.insert(new Book(name, isbn, author)); //create object
		
 	}//while
	      
 	//close file
 	inputFile.close();
	
	//printTree(tree);
	
 	
 }
 
 
 
 //can print isbn numbers out in this order
 public static void printTree(BST<Book> tree) {
   // Traverse tree
   System.out.print("\nInorder (sorted): ");
   tree.inorder();
   System.out.print("\nPostorder: ");
   tree.postorder();
   System.out.print("\nPreorder: ");
   tree.preorder();
   System.out.print("\nThe number of nodes is " + tree.getSize());
 }

}

class Book implements Comparable<Book>{ 
	private String name;
	private String isbn;
	private String author;
	
	public Book(String name, String isbn, String author){
		this.isbn = isbn;
		this.name = name;
		this.author = author;
	}
	
	//returns num of pages
    public String getIsbn(){
		return isbn;
    }//getIsbn
	  
	//returns title of book
    public String getTitle(){
    	return name;
    }//getTitle
	
	//returns author of book
    public String getAuthor(){
    	return name;
    }//getTitle
	
	//to string
	public String toString(){
		String info = "ISBN: " + getIsbn();
		return info;
	}//toString
	
	public int compareTo(Book o){
		return getIsbn().compareTo(o.getIsbn());
	}
	
   
}//book class


 
