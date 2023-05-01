import java.util.EmptyStackException;
import java.util.LinkedList;
public class MyLinkedListStack<T> {
    private LinkedList<T> stack;
    public MyLinkedListStack() {
        stack = new LinkedList<>();
    }

    /**
     *
     * @param data
     */
    public void push(T data) {
        stack.addFirst(data);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public T peek() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.getFirst();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public int size() {
        return stack.size();
    }


}
