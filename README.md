# AVL-Book-Tree
Makes an AVL Tree based on ISBN number of books
Part A: Write code using Java or C++ library to build and customize an AVL tree of Book nodes. Using an input file, insert Book nodes and detect imbalance. If imbalance is true, then call the proper rotation function as discussed in the lecture to fix the imbalance condition. 

1.	Must read AVLNode data from a text file
•	Create a text file containing Book objects
•	ISBN Number /n Title /n Author’s first and last name

       0133761312 
       Intro to Java Programming, Comprehensive Version (10th Edition) 10th Edition 
       Daniel Liang

2.	Create a Book Object; and an AVL node object to be inserted into the AVL tree
3.	At each insert, detect imbalance and fix the AVL tree
4.	Report each imbalance detection and the node where it occurred; and output the message: 

Example Output: 
Imbalance condition occurred at inserting ISBN 12345; fixed in LeftRight Rotation
Imbalance condition occurred at inserting ISBN 87654; fixed in Left Rotation
Imbalance condition occurred at inserting ISBN 974321; fixed in RightLeft Rotation

class BookNode {
Book bookObject; // ISBN <space> Title <space> Author’s name 
	int height;
	AVLNode leftPtr;
	AVLNode rightPtr;
}

You must verify the AVL balance condition at each insert and detect and fix imbalance, output result of each insertion. A null node is considered AVL property of height -1. 
