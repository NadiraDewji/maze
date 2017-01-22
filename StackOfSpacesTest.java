/**
 * This is the test class for the StackOfSpaces
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class StackOfSpacesTest {
	/**
	 * Designed to test the constructor
	 */
	@Test
	public void testStackOfSpaces() {
		try {
			StackOfSpaces myStack = new StackOfSpaces();
			/**
			 * This is testing to see that the stack created is not a null object.
			 */
			assertNotNull("Default constructor rerturned null reference.", myStack);
			assertEquals("Default value should be 0.", 0, myStack.getSize());
			//assertEquals("Default value should be null.", null, myStack);

		} catch (Exception e) {
			fail("testStackOfSpaces failed: Exception thrown \n" + e.getClass() + "\n" + e.getMessage());

		}
	}

	@Test
	public void testRemove() {
		try {
			StackOfSpaces myStack = new StackOfSpaces();
			myStack.add(null);
			/**
			 * This is testing to see that the stack is empty when a null object is added.
			 */
			assertEquals("Should return null",true, myStack.isEmpty());
			/**
			 * This is to see that  should return null 
			 */
			assertNull("Should return null", myStack.remove());
			/**
			 * This is to check the stack is still empty after calling remove method.
			 */
			assertEquals("Should return null",true, myStack.isEmpty());
			/**
			 * Adding multiple squarePositions to see the way the remove method work.
			 */
			SquarePosition mySquare = new SquarePosition(3, 4);
			SquarePosition mySquare1 = new SquarePosition(3, 4);
			SquarePosition mySquare2 = new SquarePosition(3, 4);

			myStack.add(mySquare);
			/***
			 * Should not be empty after adding one squarePosition
			 */
			assertEquals("Should return null",false, myStack.isEmpty());
			myStack.remove();
			/**
			 * testing to see if the remove method works for a stack with one object.
			 */
			assertEquals("Should return null",true, myStack.isEmpty());
			myStack.add(mySquare1);
			myStack.add(mySquare2);
			/**
			 * checks to see that the last squarePosition added is the first removed.
			 */
			assertEquals("Should return null", mySquare2, myStack.remove());
			/**
			 * The isEmpty should still be false because myS
			 */
			assertEquals("Should return null",false, myStack.isEmpty());
			assertEquals("Should return 1",1, myStack.getSize());
			assertNotNull("Should not be null",myStack.remove());
			assertEquals("Should return 0",0, myStack.getSize());
			myStack.remove();
			assertEquals("Should return 0",0, myStack.getSize());
			assertEquals("Should return null",null, myStack.remove());
			assertEquals("Should return null",true, myStack.isEmpty());
			myStack.remove();
			assertEquals("Should return 0",0, myStack.getSize());
			assertEquals("Should return null",true, myStack.isEmpty());

			/**
			 * This test is to check whether a newly made empty stack returns
			 * null when remove is called.
			 */
			assertNull("Should return null", myStack.remove());
			SquarePosition mySquareOne = new SquarePosition(3, 4);
			/**
			 * This test is to check whether the a stack with only one
			 * SquarePosition removes that SquarePosition when called.
			 */
			myStack.add(mySquareOne);
			assertEquals("Should return the element at the beginning", mySquareOne, myStack.remove());

			SquarePosition mySquareTwo = new SquarePosition(4, 5);
			SquarePosition mySquareThree = new SquarePosition(5, 6);
			myStack.add(mySquareTwo);
			myStack.add(mySquareThree);
			/**
			 * This test is to check whether the a stack with two SquarePosition
			 * removes the last SquarePosition added.
			 */
			assertEquals("Should return the element that was added first", mySquareThree, myStack.remove());
			assertEquals("Should return the element that was added last", mySquareTwo,
					myStack.remove());
			assertEquals("Should return null", null, myStack.remove());

		} catch (Exception e) {
			fail("testStackOfSpaces failed: Exception thrown \n" + e.getClass() + "\n" + e.getMessage());

		}
	}

	@Test
	public void testAdd() {
		try {
			StackOfSpaces myStack = new StackOfSpaces();
			int mySize = myStack.getSize();
			myStack.add(null);
			/**
			 * This test is to check that a null object is not added. The size
			 * should stay the same.
			 */
			assertEquals("Should return the original size without adding", mySize, myStack.getSize());
			/**
			 * This test is to check that an object is added. The size should
			 * increment.
			 */
			SquarePosition mySquareOne = new SquarePosition(3, 4);
			myStack.add(mySquareOne);
			assertEquals("Should return 1", 1, myStack.getSize());
			assertEquals("Should return the SquarePosition added", mySquareOne, myStack.remove());

		} catch (Exception e) {
			fail("testStackOfSpaces failed: Exception thrown \n" + e.getClass() + "\n" + e.getMessage());

		}
	}

	@Test
	public void testIsEmpty() {
		try {
			StackOfSpaces myStack = new StackOfSpaces();
			myStack.add(null);
			/**
			 * This checks to see that the stack is still empty after adding null obkect
			 */
			assertEquals("Should return false", true, myStack.isEmpty());
		
			assertEquals("Should return false", true, myStack.isEmpty());
			SquarePosition mySquareOne = new SquarePosition(3, 4);
			myStack.add(mySquareOne);
			/**
			 * This is to check that the stack is not empty after adding an object.
			 */
			assertEquals("Should return the true", false, myStack.isEmpty());
			myStack.remove();
			/**
			 * This is to check that the stack is empty after removing an object;
			 */
			assertEquals("Should return true", true, myStack.isEmpty());
			myStack.add(null);
			
			assertEquals("Should return true", true, myStack.isEmpty());

		} catch (Exception e) {
			fail("testStackOfSpaces failed: Exception thrown \n" + e.getClass() + "\n" + e.getMessage());


		}
	}

}
