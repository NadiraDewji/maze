/**
 * This is the stack of spaces class and it implements SetOfSpaces.
 * @author NadiraDewji
 *
 */
public class StackOfSpaces implements SetOfSpaces {
	/**
	 * This is the datafield that represents the stack and it is the type of
	 * SquareLinkedList.
	 */
	private SquareLinkedList myStackOfSpaces = new SquareLinkedList();
	/**
	 * This is the constructor. 
	 */
	public StackOfSpaces() {

	}
	/**
	 * This is a getter method for stack. 
	 * @return the stack implemented by SquareLinkedList
	 */
	public SquareLinkedList getSquareLinkedSpaces(){
		return myStackOfSpaces;
	}
	/**
	 * This is a remove method, it removes from the beginning, and thus calls the removeBeginning method from the linkedlist class. It 
	 * @return the SquarePosition that is at the top of the stack.
	 */
	public SquarePosition remove() {
		return myStackOfSpaces.removeBeginning();

	}
	/**
	 * This is the add method it adds to the beginning of the stack so as to be order 1 and thus calls the addBeginning method of 
	 * linked list.
	 */
	public void add(SquarePosition e) {
		myStackOfSpaces.addBeginning(e);
	}
	/**
	 * This is an is empty method it determines whether the stack is empty by calling linkedlist's is empty method which checks size.
	 * @return it returns a boolean indicating whether the stack is empty or not. 
	 */
	public boolean isEmpty() {
		return myStackOfSpaces.isEmpty();
	}
	/**
	 * This is a get size method that returns the size of the stack. 
	 * 
	 * @return an integer that represents the number of elements in the stack.
	 */
	public int getSize() {
		return myStackOfSpaces.size();
	}

}
