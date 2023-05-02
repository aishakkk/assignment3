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
}