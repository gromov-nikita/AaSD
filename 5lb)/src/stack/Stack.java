package stack;
import java.util.*;

public class Stack<T> {
    private ArrayList<T> stack;
    public Stack() {
        stack = new ArrayList<T>();
    }
    public Stack(T[] array) {
        stack = new ArrayList<T>();
        for(int i = 0; i < array.length; i++) {
            stack.add(0,array[i]);
        }
    }
    public void push(T obj) {
        stack.add(0,obj);
    }
    public T pop() {
        return stack.remove(0);
    }
    public List<T> pop(int n) {
        List<T> list = new LinkedList<T>();
        for(int i = 0; i < n; i++) {
            list.add(stack.remove(0));
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
