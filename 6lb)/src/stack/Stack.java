package stack;
import java.util.*;

public class Stack<T> {
    private LinkedList<T> stack;
    public Stack() {
        stack = new LinkedList<T>();
    }
    public Stack(T[] array) {
        stack = new LinkedList<T>();
        for(int i = 0; i < array.length; i++) {
            stack.addFirst(array[i]);
        }
    }
    public void push(T obj) {
        stack.addFirst(obj);
    }
    public T pop() {
        return stack.removeFirst();
    }
    public List<T> pop(int n) {
        List<T> list = new LinkedList<T>();
        for(int i = 0; i < n; i++) {
            list.add(stack.remove());
        }
        return list;
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public void printStack() {
        Iterator<T> it = stack.iterator();
        if(stack.isEmpty()) {
            System.out.println("EMPTY");
        }
        else {
            while(it.hasNext()) {
                System.out.println(it.next().toString());
            }
        }
    }
}
