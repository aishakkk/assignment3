import java.util.EmptyStackException;
import java.util.ArrayList;
public class MyArrayListStack<T> {
    private ArrayList<T> stack;
    /**
     * @function MyArrayListStack - constructor to create an arraylist
     * @noparam
     * @return void
     */
    public MyArrayListStack() {
        stack = new ArrayList<>();
    }
    /**
     * @function push - method adds an element to the top of the stack using the add method for MyArrayList
     * @param data - given item to add in stack
     * @return void
     */
    public void push(T data) {
        stack.add(data);
    }
    /**
     * @function pop - method removes and returns the top element of the stack using the remove method for MyArrayList
     * @noparam
     * @return T - returning top element in generic type
     */
    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }
    /**
     * @function peek - method returns the top element of the stack without removing it using the get method for MyArrayList
     * @noparam
     * @return T - returning top element in generic type
     */
    public T peek() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }
    /**
     * @function isEmpty - method returns true if the stack is empty or false if it is not using the isEmpty method for MyArrayList
     * @noparam
     * @return boolean - true if stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    /**
     * @function size - method returns the number of elements in the stack using the size method for MyArrayList
     * @noparam
     * @return int - size of stack
     */
    public int size() {
        return stack.size();
    }
}
