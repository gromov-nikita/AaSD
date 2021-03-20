package queue;
import java.util.*;
public class Queue<T> {
    private ArrayList<T> queue;
    public Queue() {
        queue = new ArrayList<T>();
    }
    public Queue(T[] array) {
        queue = new ArrayList<T>();
        for(int i = 0; i < array.length; i++) {
            queue.add(array[i]);
        }
    }
    public void push(T obj) {
        queue.add(obj);
    }
    public T pop() {
        return queue.remove(0);
    }
    public List<T> pop(int n) {
        List<T> list = new ArrayList<T>();
        for(int i = 0; i < n; i++) {
            list.add(queue.remove(0));
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
