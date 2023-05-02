import java.util.NoSuchElementException;
import java.util.ArrayList;
public class MyArrayListQueue<T> {
    private ArrayList<T> myList;
    /**
     * @function MyArrayListQueue - constructor to create an arraylist
     * @noparam
     * @return void
     */
    public MyArrayListQueue() {
        this.myList = new ArrayList<>();
    }
    /**
     * @function enqueue - method adds an element to the back of the queue using the add method for ArrayList
     * @param item - given element to add in queue
     * @return void
     */
    public void enqueue(T item) {
        myList.add(0, item);
    }
    /**
     * @function dequeue - method removes and returns the front element of the queue using the remove method for ArrayList
     * @noparam
     * @return T - returning first element in queue in generic type
     */
    public T dequeue() {
        return myList.remove(myList.size()-1);
    }
    /**
     * @function peek -  method returns the front element of the queue without removing it using the get method for ArrayList
     * @noparam
     * @return T - returning first element in queue in generic type
     */
    public T peek() throws NoSuchElementException {
        isEmptyThrowException();
        return myList.get(myList.size()-1);
    }
    /**
     * @function isEmpty - method returns true if the queue is empty or false if it is not using the isEmpty method for ArrayList
     * @noparam
     * @return boolean - return true if queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return myList.isEmpty();
    }
    /**
     * @function size - method returns the number of elements in the queue using the size method for ArrayList
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
