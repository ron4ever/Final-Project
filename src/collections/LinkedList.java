package collections;
import java.lang.reflect.Array;
/**
 * LinkedList.java -  an implementation of a linked list abstract (advanced)
 * data (dynamic) type (ADT) and useful methods, and could be "visualized" as:
 * +------+       +------+       +------+       +------+      
 *  null <---- |      | <---- |      | <---- |      | <---- |      |  
 *             | NODE |       | NODE |       | NODE |       | NODE |       
 *             |      |---->  |      |---->  |      |---->  |      |----> null  
 *             +------+       +------+       +------+       +------+      
 *                 ^                                           ^
 *                 |                                           |
 *                head                                        tail
 * @Instructor Mr.Wachs
 * @since 6-May-2019 
 * @author r.stuchevsky
 */
public class LinkedList <T> {
     //properties
     private Node head; // refrence (link) to the first node in the list (entry point)
     private Node tail; // refrence (link) to the last node in the list (entry point)
      /**
      * The number of nodes in the list
      * immutable property
      */
     private int length;
     public static final int NOT_FOUND = -1;
    /**   
     * Default constructor for the class, sets class properties
     */
     public LinkedList() {
        finalize();
     }
     /**
      * Constructor instantiates list from the passed data
      * @param array  array the data objects to create the list from
      */
     public LinkedList (T[] array){
         finalize();
         addAll(array);
     }
     /**
      * Constructor instantiates list from the passed data
      * @param list list the data objects to create the list from
      */
     public LinkedList (LinkedList<T> list){
         finalize();
         addAll(list);
     }
     /**
      * Returns an array that contains the same data as the list
      * @param array array the data type array
      * @return an array of generic type T
      */
     public T[] toArray(T[] array){
         array = (T[])
                 (Array.newInstance( array.getClass().getComponentType(),length));  
         for (int i = 0; i < length; i++) {
             array[i] = get(i);
         }
         return array;
     }
     /**
      * Frees up all memory used by this object
      */
     @Override
     public void finalize(){
         length = 0;
         head = tail = null;
         System.gc();
     }
     /**
      * Determines if the list is empty (no content)
      * @return is empty (true) or not empty (false)
      */
     public boolean isEmpty(){
         return length == 0; 
     }
     /**
      * Accessor method of the immutable property
      * @return the number of nodes in the list
      */
     public int size(){
         return length;
     }
     /**
      * Inserts data into the front (head) of the list
      * @param data data the data type to add
      * @return the operation was successful (true) or not (false)
      */
     public boolean addFront(T data){
         //When mutating a linked lsit
         //should consider
         // 1.Empty list
         //2. List has 1 node
         //3. List has > 1 node
         if (data == null) return false;
         Node node = new Node(data);
         if (isEmpty()) head = tail = node;
         else{
           node.next = head; //linking the new node to the other one
           head.previous = node; // 
           head = node; // re setting the head to the new node that was added in front
         }
         length++;
         return true;
     }
     /**
      * Inserts data into the back (tail) of the list
      * @param data data the data type to add
      * @return the operation was successful (true) or not (false)
      */
     public boolean addBack(T data){
         if (data == null) return false;
         Node node = new Node(data);
         if (isEmpty()) head = tail = node;
         else{
           node.previous = tail; //linking the new node to the other one
           tail.next = node; // 
           tail = node; // re setting the tail to the new node that was added in front
         }
         length++;
         return true;
     }
     /**
     * String representation of this object
     * @return The object represented as a String
     */
     @Override
     public String toString() {
        if (isEmpty()) return "Empty Linked List";
        else{
           String text = "";
            Node current = head;
            while (current.next != null){
                text += current.toString() + ",";
                current = current.next;  
            }
            return text + current.toString();
        }
     }
     /**
     * Determines if two objects are "equal" in this context
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
     @Override
     public boolean equals(Object object) {
        LinkedList<T> that = (LinkedList<T>)object; //casting the object into a linked list of generics
        if (this.size() != that.size()) return false;  
        Node current1 = this.getFirstNode();
        Node current2 = that.getFirstNode();
        while (current1 != null){
            if (!current1.equals(current2)){ // this equlas method is from the node class not recursion
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
         return true;
     }
     /**
     * Createss a duplicate object using new memory
     * @return a "clone" of the object using new memory
     */
     @Override
     public LinkedList clone() {
         LinkedList<T> list = new LinkedList<>();
         for (int i = 0; i < length; i++) {
             T data = this.get(i);
             list.addBack(data);
         }
         return list;
     }
     /**
      * method that returns tail
      * @return tail
      */
     protected Node getLastNode(){
         return tail;
     }
     /**
      * returns head
      * @return the head
      */
     protected Node getFirstNode(){
         return head;
     }
     /**
      * Accessor for the data at the specified index
      * @param index index the index location to access
      * @return the data (or null) at the index
      */
     private boolean inRange (int index){
         if (isEmpty()) return false;
         if (index < 0) return false;
         if (index >= length) return false;
         return true;
     }
    /**
     * Checks if the specified data is inside the list
     * @param data data the data to check for
     * @return  data is in the list (true) or not (false)
     */
     public boolean contains(T data){
         Node current = head;
         while (current != null){
             if (current.data.equals(data)){
             return true;
         }
         current = current.next;
       }
        return false;
     }
    /**
    * Accesses the node reference for this index location
    * @param index index the index location
    * @return  a reference to the node at this index or null
    */
    protected Node getNode(int index){
    if (!inRange(index)) return null;  //if not in range     
    if (index == 0) return getFirstNode();
    if (index == length-1) return getLastNode();
    Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
    return current;
    }
    /**
     * accessor method returns a thing in the node at a certain spot
     * @param index the node spot 
     * @return the stuff the node holds
     */
    public T get(int index){
       if (!inRange(index)) return null;
       return (T) getNode(index).data;  
    }
    /**
     * Inserts data as a new node after the passed index
     * @param data the data to add
     * @param index after the certain spot
     * @return the operation was successful (true) or not (false)
     */
    public boolean addAfter(T data, int index){
      if (data == null) return false;
      if (!inRange(index)) return false;  
      if(index == length-1) return addBack(data);
      Node<T> node = new Node<>(data);
      Node current = getNode(index); //reference node
      node.next = current.next; 
      current.next.previous = node; // double refrencing 
      current.next = node;
      node.previous = current;
      length++;
      return true;    
    }
    /**
     * Inserts data as a new node before the passed index
     * @param data data the data type to insert
     * @param index index the index location to insert before
     * @return the operation was successful (true) or not (false)
     */ 
    public boolean addBefore(T data, int index){
      if (data == null) return false;
      if (!inRange(index)) return false;  
      if(index == 0) return addFront(data);
      Node<T> node = new Node<>(data);
      Node current = getNode(index); //reference node
      node.previous = current.previous; 
      current.previous.next = node; // double refrencing 
      current.previous = node;
      node.next = current;
      length++;
      return true;    
    }
    /**
     * Wrapper method adds to the back
     * @param data the data to add
     * @return the operation was successful (true) or not (false)
     */
    public boolean add (T data){
        return addBack(data);
    }
    /**
     * Wrapper method to add to the back of a data
     * @param data the data to add
     * @param index the spot to add the data after
     * @return the method
     */
    public boolean add (T data, int index){
        return addAfter(data, index);
    }
    /**
     * Mutator method
     * @param index the node spot
     * @param data the data to change to
     * @return if successful or not
     */
    public boolean set(int index, T data){
        if (data == null) return false;
        Node current = getNode(index);
        if (current == null) return false;
        current.data = data;
        return true;
    }
    /**
     * Get the front of the linked list
     * @return the head data
     */
    public T front(){
       return get(0);
   }
   /**
    * Accesses the last, tail, back data in the list
    * @return the tail data
    */
    public T back(){
       return get(length-1);
   }
   /**
    * Removes (deletes) the first (head) node of the list
    * @return the data in the first node (or null)
    */
   public T removeFront(){
       if (isEmpty()) return null;
       else{
        T data = front();
        if(length == 1) finalize();
        else{
           head = head.next;
           head.previous.next = null;
           head.previous = null;
            length--;
            System.gc();
        }
        return data;
       } 
   }
   /**
    * Removes (deletes) the last (tail) node of the list
    * @return the data in the last node (or null)
    */
   public T removeBack(){
       if (isEmpty()) return null;
       else{
        T data = back();
        if(length == 1) finalize();
        else{
           tail = tail.previous;
           tail.next.previous = null;
           tail.next = null;
            length--;
            System.gc();
        }
        return data;
       }
  }
   /**
    * removes a certain spot in the list
    * @param index the spot to remove
    * @return 
    */
   public T remove(int index){
    if (!inRange(index)) return null;
    if (index == 0) return removeFront();
    if (index == length-1) return removeBack();
    Node current = getNode(index);
    current.next.previous = current.previous;
    current.previous.next = current.next;
    current.next = current.previous = null;
    length--;
    System.gc();
    return (T)current.data;
   }
   /**
    * Remove the first index of the data provided
    * @param data the data to remove
    * @return false if no data given or true if successful
    */
   public boolean remove (T data) {
       if (data == null) return false;
       int index = firstIndexOf(data);
       if (index == NOT_FOUND) return false;
       remove(index);
       return true; 
   }
   /**
    * Remove the last index of the data provided
    * @param data the data to remove
    * @return false if no data given or true if successful
    */
   public boolean removeLast (T data) {
       if (data == null) return false;
       int index = lastIndexOf(data);
       if (index == NOT_FOUND) return false;
       remove(index);
       return true; 
   }
   /**
    * Remove all the data from all the indxes of the list
    * @param data  the data to remove
    * @return true if successful or false if not
    */
   public boolean removeAll (T data){
      if (data == null) return false; 
      if (!contains(data)) return false;
      while(contains(data)){
          remove(data);
      }
      return true;
   }
   /**
    * Basic search method to find the first index of a data
    * @param data the data passed to find the first index of it
    * @return if found the first index for the data passed or if not found return -1 to symbolize that
    */
   public int firstIndexOf(T data){
      Node current = head;
      int index = 0;
      while (current != null){
          if (current.data.equals(data)){
              return index;
          }
          current = current.next;
          index++;
      }
      return NOT_FOUND;
   }
   /**
    * Basic search method to find the last index of a data
    * @param data the data passed to find the last index of it
    * @return if found the last index for the data passed or if not found return -1 to symbolize that
    */
    public int lastIndexOf(T data){
      Node current = tail;
      int index = length-1;
      while (current != null){
          if (current.data.equals(data)){
              return index;
          }
          current = current.previous;
          index--;
      }
      return NOT_FOUND;
   }
    /**
     * Count how many of the data are in the list
     * @param data the data to count in the list
     * @return how many spots the data occupies in the list
     */
    public int numberOf (T data){
       if (data == null) return 0;
       int counter = 0;
       Node current = head;
       while (current != null){
          if (current.data.equals(data)){
              counter++;
          }
           current = current.next;
       }
       return counter;
    }
    /**
     * Returns all indices of the array
     * @param data the data to check for the indices
     * @return the array which contains all the spot the data has been found at
     */
    public int[] allIndices(T data){
        if (data == null) return null;
        if (!contains(data)) return null;
        int size = numberOf(data);
        int[] array = new int[size];
        Node current = head;
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (current.data.equals(data)){
                array[counter] = i;
                counter++;
                if (counter >= size){
                    return array;
                }
            }
            current = current.next;
        }
        return array;
    }
    /**
     * Add an initre array of items to the list
     * @param items 
     */
    public void addAll (T[] items){
        for (T item : items) { //enchanced for loop
            add(item);
        }
    }
    /**
     * Add an intire linked list to a linked list
     * @param that the data to add to the linked list
     */
    public void addAll (LinkedList<T> that){
        for (int i = 0; i < that.size(); i++) {
            this.add(that.get(i));
        }
    }
}
