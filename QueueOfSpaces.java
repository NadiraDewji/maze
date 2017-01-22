/**
 * This is a QueueOfSpaces class and it implements SetOfSpaces.
 * 
 * @author NadiraDewji
 *
 */
public class QueueOfSpaces implements SetOfSpaces {

	/**
	 * This is the datafield that represents the queue and it is the type of
	 * SquareLinkedList.
	 */
	private SquareLinkedList myQueueOfSpaces;

	/**
	 * This is the constructor that creates an instance of a SquareLinkedList.
	 */
	public QueueOfSpaces() {
		myQueueOfSpaces = new SquareLinkedList();
	}

	/**
	 * This is a getter method for the private myQueueOfSpaces that represents
	 * the Queue.
	 * 
	 * @return this returns SquareLinkedList myQueueOfSpaces
	 */

	public SquareLinkedList getSquareLinkedQueue() {
		return this.myQueueOfSpaces;
	}

	/**
	 * This is an add method that adds squarePositions to the end of the queue.
	 * This is because with a tail the queue can be order 1, and so must be
	 * added at the end.
	 */
	public void add(SquarePosition e) {
		myQueueOfSpaces.addEnd(e);
	}

	/**
	 * This is a remove method that removes the first element in the queue(head
	 * is referencing). It returns that SquarePosition.
	 * 
	 * @return it returns the square position that is in the Node that head is
	 *         referencing.
	 */
	public SquarePosition remove() {
		return myQueueOfSpaces.removeBeginning();

	}

	/**
	 * This is an isEmpty method it checks to see whether the queue is empty by
	 * calling squarelinkedlist method.
	 * 
	 * @return boolean true if it is empty and false if it not empty.
	 */
	public boolean isEmpty() {
		return myQueueOfSpaces.isEmpty();
	}

	/**
	 * This is getsize method returns the size that represents the number of
	 * elements in the queue.
	 * 
	 * @return an integer that is the size of the queue.
	 */
	public int getSize() {
		return myQueueOfSpaces.size();
	}

}
