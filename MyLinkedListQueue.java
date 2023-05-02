import java.util.NoSuchElementException;
import java.util.LinkedList;
public class MyLinkedListQueue<T> {
    private LinkedList<T> myList;
    public MyLinkedListQueue() {
        myList = new LinkedList<T>();
    }
    public void enqueue(T item) {
        myList.addFirst(item);
    }
    public T dequeue() {
        return myList.removeFirst();
    }
    public T peek() throws NoSuchElementException {
        isEmptyThrowException();
        return myList.getFirst();
    }
    public boolean isEmpty() {
        return myList.isEmpty();
    }
    public int size() {
        return myList.size();
    }
    private void isEmptyThrowException() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }
}