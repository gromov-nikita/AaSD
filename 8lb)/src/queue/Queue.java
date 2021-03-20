package queue;
import java.util.*;
public class Queue<T> {
    private LinkedList<T> queue;
    public Queue() {
        queue = new LinkedList<T>();
    }
    public Queue(T[] array) {
        queue = new LinkedList<T>();
        for(int i = 0; i < array.length; i++) {
            queue.add(array[i]);
        }
    }
    public void push(T obj) {
        queue.add(obj);
    }
    public T pop() {
        return queue.remove();
    }
    public List<T> pop(int n) {
        List<T> list = new LinkedList<T>();
        for(int i = 0; i < n; i++) {
            list.add(queue.remove());
        }
        return list;
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public void printQueue() {
        Iterator<T> it = queue.iterator();
        if(queue.isEmpty()) {
            System.out.println("EMPTY");
        }
        else {
            while(it.hasNext()) {
                System.out.println(it.next().toString());
            }
        }
    }
}
