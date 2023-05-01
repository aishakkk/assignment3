import java.util.EmptyStackException;
import java.util.ArrayList;
public class MyArrayListStack<T> {
    private ArrayList<T> stack;
    public MyArrayListStack() {
        stack = new ArrayList<>();
    }
    public void push(T data) {
        stack.add(data);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }
    public T peek() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public int size() {
        return stack.size();
    }






}
