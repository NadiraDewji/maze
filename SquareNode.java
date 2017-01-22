/**
 * This is SquareNode class. Created specifically to make Nodes for
 * SquarePosition objects. SquareNode has a SquareNode data field that
 * references the next SquareNode. It contains a SquarePosition data field that
 * holds the data associated with SquarePositon.
 * 
 * @author NadiraDewji
 *
 */
public class SquareNode {
	private SquareNode next;
	private SquarePosition data;

	/**
	 * This is the constructor for the SquareNode class and it sets the data
	 * field to reference the SquarePosition.
	 * 
	 * @param s
	 *            this is the SquarePosition to be contained in the SquareNode.
	 */
	public SquareNode(SquarePosition s) {
		this.data = s;
	}

	/**
	 * This is getter method for the Data because it is a private data field.
	 * 
	 * @return the SquarePosition contained in this node.
	 */
	public SquarePosition getData() {
		return this.data;
	}

	/**
	 * This is a setter method for the next node, and it it sets the next node
	 * to reference the SquareNode s.
	 * 
	 * @param s
	 *            the squareNode S we are referencing next to.
	 */
	public void setNext(SquareNode s) {
		this.next = s;
	}

	/**
	 * This is getting the next SquareNode.
	 * 
	 * @return a SquareNode.
	 */
	public SquareNode getNext() {
		return next;
	}

}
