import java.util.NoSuchElementException;
import java.util.LinkedList;
public class MyLinkedListQueue<T> {
    private LinkedList<T> myList;
    /**
     * @function MyLinkedListQueue - constructor to create a linkedList
     * @noparam
     * @return void
     */
    public MyLinkedListQueue() {
        myList = new LinkedList<T>();
    }
    /**
     * @function enqueue - method adds an element to the back of the queue using the addFirst method for LinkedList
     * @param item - given element to add in queue
     * @return void
     */
    public void enqueue(T item) {
        myList.addFirst(item);
    }
    /**
     * @function dequeue - method removes and returns the front element of the queue using the removeFirst method for LinkedList
     * @noparam
     * @return T - returning first element in queue in generic type
     */
    public T dequeue() {
        return myList.removeFirst();
    }
    /**
     * @function peek -  method returns the front element of the queue without removing it using the getFirst method for LinkedList
     * @noparam
     * @return T - returning first element in queue in generic type
     */
    public T peek() throws NoSuchElementException {
        isEmptyThrowException();
        return myList.getFirst();
    }
    /**
     * @function isEmpty - method returns true if the queue is empty or false if it is not using the isEmpty method for LinkedList
     * @noparam
     * @return boolean - return true if queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return myList.isEmpty();
    }
    /**
     * @function size - method returns the number of elements in the queue using the size method for LinkedList
     * @noparam
     * @return int - size of queue
     */
    public int size() {
        return myList.size();
    }
    /**
     * @function isEmptyThrowException - throwing exception to avoid errors
     * @noparam
     * @return void
     */
    private void isEmptyThrowException() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }
}




