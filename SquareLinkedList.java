/**
 * This is a SquareLinkedList Class that implements a list using methods that
 * will allow you to perform the functions of a queue and stack
 * 
 * @author NadiraDewji
 *
 */
public class SquareLinkedList {
	/**
	 * Size datafield stores the size of the linked list it is incremented when
	 * a SquarePosition is added and decremented when a SquarePosition is
	 * removed. Head is of the type SquareNode and it is a reference to the
	 * first element of the list. Tail is of the type SquareNode and it is a
	 * reference to the last element of the list (the one who's next value is
	 * null).
	 */
	private int size;
	private SquareNode head;
	private SquareNode tail;

	/**
	 * This constructor just sets the values of the data fields to their default
	 * values.
	 */
	public SquareLinkedList() {
		head = null;
		size = 0;
	}

	/**
	 * This is size method and allows you to get the size of the linkedlist.
	 * 
	 * @return an integer that is the size (number of elements/SquarePositions
	 *         in the queue/stack).
	 */
	public int size() {
		return this.size;
	}

	/**
	 * This is an isEmpty method and it checks to see whether the linkedlist is
	 * empty by seeing is size is equal to zero.
	 * 
	 * @return a boolean value, false is that it is not empty, true is that it
	 *         is empty.
	 */
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * I added a contains method that is not used in the Queue or Stack.
	 * 
	 * @param o
	 * @return
	 */
	public boolean contains(Object o) {
		SquareNode current;
		current = head;
		while (current.getNext() != null) {
			if (current.getData().equals(o)) {
				return true;
			} else {
				current = current.getNext();

			}
		}

		return false;
	}

	/**
	 * This is a method that adds a SquarePosition to the beginning of the
	 * LinkedList. It first checks whether the object is null. If it is null it
	 * does not add it. If the object is not null, but there is only one element
	 * in the list, (head==0) it creates a node container for it, newSquareNode
	 * and then sets head to reference the new node, and tail and it increments
	 * size by 1. If else, which means the size of the list is greater than one,
	 * it sets the newNode next to head, and makes head now reference the new
	 * node and it increments size by 1.
	 * 
	 * @param e
	 *            this is the SquarePosition.
	 */
	public void addBeginning(SquarePosition e) {
		if (e == null) {
			return;
		}
		SquareNode newSquareNode = new SquareNode(e);
		if (head == null) {
			head = newSquareNode;
			tail = newSquareNode;
			size++;

		} else {
			newSquareNode.setNext(head);
			head = newSquareNode;
			size++;

		}

	}

	/***
	 * This first checks if the list is empty(head is referencing a null object)
	 * if it is return null and do not increment size. The next case checks
	 * whether there is only one object and it is being removed. Set head to
	 * head and tail to null decrement size by 1. If it does not meet the
	 * previous conditions then set head to the next element in the list and
	 * decrement size by 1.
	 * 
	 * @return This returns the SquarePosition that is at the "beginning" of the
	 *         list, where head is pointing to.
	 */
	public SquarePosition removeBeginning() {
		if (head == null) {
			// size--;
			return null;
		}

		else if (head.getNext() == null) {
			SquarePosition myPosition = head.getData();
			head = null;
			tail = null;
			size--;
			return myPosition;
		} else {
			SquarePosition myData = head.getData();
			head = head.getNext();
			size--;
			return myData;
		}
	}

	/**
	 * This method removes the last element. If there are no elements in the
	 * list return null. Else, parse through the linked list using current and
	 * remove the last element by setting the previous node next to null.
	 * 
	 * @return this returns a SquarePosition object.
	 */
	public SquarePosition removeEnd() {
		if (head == null) {
			return null;
		}
		SquareNode current;
		current = head;
		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}
		SquarePosition myData = current.getData();
		current.setNext(null);
		size--;
		return myData;

	}

	/**
	 * This method adds to the end of the list. First it checks whether the
	 * object being added is null. If it is null, it does not add it it. If
	 * there is no element in the list it sets both tail and head to reference
	 * the node. If it is not null it creates a SquareNode that contains the
	 * SquarePosition, it sets the tails next to this new node.
	 * 
	 * @param this
	 *            takes in a SquarePosition object e.
	 */

	public void addEnd(SquarePosition e) {
		if (e == null) {
			return;
		}
		SquareNode newSquareNode = new SquareNode(e);

		if (head == null) {
			head = newSquareNode;
			tail = newSquareNode;
			size++;
		} else {
			tail.setNext(newSquareNode);
			tail = newSquareNode;
			// SquareNode current;
			// current = head;
			// while(current.getNext()!=null){
			// current = current.getNext();
			// }
			// current.setNext(newSquareNode);
			size++;

		}
	}

}
