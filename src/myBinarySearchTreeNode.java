class myBinarySearchTreeNode{
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;
    
  myBinarySearchTreeNode(int inValue){
    // created a new node with empty child pointers
    // done in one line of code
    // saving myValue into inValue
      myBinarySearchTreeNode instance = new myBinarySearchTreeNode(inValue);
  }
  
  myBinarySearchTreeNode(int[] A){
    // creates a new Binary Search Tree rooted at the first value in the array
    /// by inserting elements into the tree in the order they are given in A.
    // only need three lines of code in this whole method.
          this.myValue = myValue;
          left = null;
          right = null;
  }

  public void insert(int inValue){
    // This method takes a new integer as input and decides 
    // if it should be place: 
    //    * as the left child,
    //    * as the right child, 
    //    * in the left subtree,
    //    * or in the right subtree.
    // If the value already exists in the tree, no action is taken.
    //
    if(inValue < myValue){
        if(left != null){ // if there are no nodes on the left...
            insert(inValue); // then insert the
        }else{
            left = new myBinarySearchTreeNode(inValue);
        }
    }
    if(inValue >= myValue){ // if the next value is greater than or equal to myValue...
        if(right != null){ // and if the right node is not equal to null
            insert(inValue); // then we will move to the next node of the tree
        }else{
            right = new myBinarySearchTreeNode(inValue); // set a new node to store inValue
        }
    }
    if(inValue == myValue){ // if the current number is equal to the value, then the number cannot be inserted in the binary tree.
        System.out.print("duplicate cannot be added");
    }
  }
  
  public int height(){
     // This method recursively calculates the height of the entire (sub)tree.
     // This method will take O(n) time
     return -1;
  }
  
  public int depth(int search){
     // This method recursively calculates the depth of a given search value. 
     // If the given value is not in the tree, this method returns -1. 
     // Note that if the tree is a proper BST, this method should complete in O(log n) time.
     // Additionally, remember that the depth is the number of nodes on the path from a node to the root 
     // (i.e. the number of the recursie calls).
    return -1;
  }

  public int size(){
    // This method recursively calculates the number of nodes in the (sub)tree.
    return 0;
  }
  
  // Utility function included so you can debug your solution. 
  public void print() {
      print("");
  }
  private void print(String prefix) {
    System.out.println(prefix + myValue);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    if(right != null) right.print(prefix + "\u2514 ");
  }
  
} 
