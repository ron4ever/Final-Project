package collections;
/**
 * Node.java -a representation of a generic node for use with
 * a LinkedList object, and could be "visualized" as:
 * 
 *                      NODE
 *                +--------------+
 * previous <---- |              |
 *                |     data     |
 *                |   (generic)  |
 *                |              |----> next
 *                +--------------+
 * @Teacher Mr.Wachs
 * @since 6-May-2019 
 * @author r.stuchevsky
 */
public class Node <T> {
    //properties
    //self refrencing class
    Node next; //link
    Node previous; 
    T data; //the generic data to remember
    /**
     * Class constructor sets class properties
     * @param data the node data
     * @param next reference to the next Node object
     * @param previous reference to the previous Node object
     */
    public Node(T data, Node next, Node previous) {
        this.data     = data;
        this.next     = next;
        this.previous = previous;
    }
    /**
     * Class constructor sets class properties 
     * @param data the Node data
     */
    public Node(T data) {
        this.data = data;
        this.next = this.previous = null;
    }
    /** 
     * Default constructor for the class 
     */
    public Node() {
        this(null,null,null);
    }
     /**
     * String representation of this object
     * @return The object represented as a String
     */
     @Override
     public String toString() {
         if (data == null) return "Node null";
         return  data.toString();
     }
     /**
     * Determines if two objects are "equal" in this context
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
     @Override
     public boolean equals(Object object) {
        Node node = (Node)object; //casting object into a node
        return this.data.equals(node.data);
     }
     /**
     * Creates a duplicate object using new memory
     * @return a "clone" of the object using new memory
     */
     @Override
     public Node clone() {
         return new Node(this.data,this.next,this.previous);
     }
     /**
      * clears the node data and calls the garbage collector method
      * this help with memory and lag reduction on heavy programs
      */
    @Override
     public void finalize(){
      data = null;
      next = previous = null;
      System.gc(); // method that runs the garbage collector (memory managment)
     }
}
