import static org.junit.Assert.*;

import org.junit.Test;

public class QueueOfSpacesTest {

	@Test
	public void testQueueOfSpaces() {
		try {
			QueueOfSpaces myQueueOfSpaces = new QueueOfSpaces();
			/**
			 * This is to check that the queue is not referencing a null object.
			 */
			assertNotNull("Default constructor rerturned null reference.", myQueueOfSpaces);
			/**
			 * This is to check that the initial size of  a created queue is zero.
			 */
			assertEquals("Default value should be 0.", 0, myQueueOfSpaces.getSize());

		} catch (Exception e) {
			fail("testQueueOfSpaces failed: Exception thrown \n" + e.getClass() + "\n" + e.getMessage());

		}
	}

	@Test
	public void testRemove() {
		try {
			QueueOfSpaces myQueue = new QueueOfSpaces();
			myQueue.add(null);
			assertNull("Should return null", myQueue.remove());

			/**
			 * This test is to check whether a newly made empty queue returns
			 * null when remove is called.
			 */
			assertNull("Should return null", myQueue.remove());
			SquarePosition mySquareOne = new SquarePosition(3, 4);
			/**
			 * This test is to check whether the  queue with only one
			 * SquarePosition removes that SquarePosition when called.
			 */
			myQueue.add(mySquareOne);
			assertEquals("Should return the element at the beginning", mySquareOne, myQueue.remove());

			SquarePosition mySquareTwo = new SquarePosition(4, 5);
			SquarePosition mySquareThree = new SquarePosition(5, 6);
			myQueue.add(mySquareTwo);
			myQueue.add(mySquareThree);
			/**
			 * This test is to check whether the  queue with two SquarePosition
			 * removes the first SquarePosition added.
			 */
			assertEquals("Should return the element that was added first", mySquareTwo, myQueue.remove());
			assertEquals("Should return the element that was added second", mySquareThree,
					myQueue.remove());
			assertEquals("Should return null", null, myQueue.remove());

		} catch (Exception e) {
			fail("testStackOfSpaces failed: Exception thrown \n" + e.getClass() + "\n" + e.getMessage());

		}
	}

	@Test
	public void testAdd() {
		try {
			QueueOfSpaces myQueue = new QueueOfSpaces();
			int mySize = myQueue.getSize();
			myQueue.add(null);
			/**
			 * This test is to check that a null object is not added. The size
			 * should stay the same.
			 */
			assertEquals("Should return the original size without adding", mySize, myQueue.getSize());
			/**
			 * This test is to check that an object is added. The size should
			 * increment.
			 */
			SquarePosition mySquareOne = new SquarePosition(3, 4);
			myQueue.add(mySquareOne);
			/**
			 * This is to check that the one squareposition is added and size =1.
			 */
			assertEquals("Should return 1", 1, myQueue.getSize());
			assertEquals("Should return the SquarePosition added", mySquareOne, myQueue.remove());

		} catch (Exception e) {
			fail("testStackOfSpaces failed: Exception thrown \n" + e.getClass() + "\n" + e.getMessage());

		}
	}

	@Test
	public void testIsEmpty() {
		try {
			QueueOfSpaces myQueue = new QueueOfSpaces();
			myQueue.add(null);
			/**
			 * Checking that the initial queue is empty.
			 */
			assertEquals("Should return true", true, myQueue.isEmpty());
			assertEquals("Should return true", true, myQueue.isEmpty());
			SquarePosition mySquareOne = new SquarePosition(3, 4);
			/**
			 * this is to check that it is not empty after adding an object.
			 */
			myQueue.add(mySquareOne);
			assertEquals("Should return the false", false, myQueue.isEmpty());
			myQueue.remove();
			assertEquals("Should return true", true, myQueue.isEmpty());
			myQueue.add(null);
			assertEquals("Should return true", true, myQueue.isEmpty());

		} catch (Exception e) {
			fail("testStackOfSpaces failed: Exception thrown \n" + e.getClass() + "\n" + e.getMessage());

		}
	}
}