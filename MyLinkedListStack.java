import java.util.EmptyStackException;
import java.util.LinkedList;
public class MyLinkedListStack<T> {
    private LinkedList<T> stack;
    /**
     * @function MyLinkedListStack - constructor to create an linkedlist
     * @noparam
     * @return void
     */
    public MyLinkedListStack() {
        stack = new LinkedList<>();
    }
    /**
     * @function push - method adds an element to the top of the stack using the add method for MyListList
     * @param data - given item to add in stack
     * @return void
     */
    public void push(T data) {
        stack.addFirst(data);
    }
    /**
     * @function pop - method removes and returns the top element of the stack using the remove method for MyLinkedList
     * @noparam
     * @return T - returning top element in generic type
     */
    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    /**
     * @function peek - method returns the top element of the stack without removing it using the get method for MyLinkedList
     * @noparam
     * @return T - returning top element in generic type
     */
    public T peek() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.getFirst();
    }
    /**
     * @function isEmpty - method returns true if the stack is empty or false if it is not using the isEmpty method for MyLinkedList
     * @noparam
     * @return boolean - true if stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    /**
     * @function size - method returns the number of elements in the stack using the size method for MyLinkedList
     * @noparam
     * @return int - size of stack
     */
    public int size() {
        return stack.size();
    }


}
