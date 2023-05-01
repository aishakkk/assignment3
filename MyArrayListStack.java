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



}
