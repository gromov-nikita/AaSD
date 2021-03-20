package deque;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Deque<T> {
    private LinkedList<T> deque;
    public Deque() {
        deque = new LinkedList<T>();
    }
    public Deque(T[] array) {
        deque = new LinkedList<T>();
        for(int i = 0; i < array.length; i++) {
            deque.add(array[i]);
        }
    }
    public void push(T obj) {
        deque.add(obj);
    }
    public void pushFirst(T obj) {
        deque.addFirst(obj);
    }
    public T pop() {
        return deque.remove();
    }
    public T popBack() {
        return deque.remove(deque.size() - 1);
    }
    public List<T> pop(int n) {
        List<T> list = new LinkedList<T>();
        for(int i = 0; i < n; i++) {
            list.add(deque.remove());
        }
        return list;
    }
    public List<T> popBack(int n) {
        List<T> list = new LinkedList<T>();
        for(int i = 0; i < n; i++) {
            list.add(deque.remove(deque.size() - 1));
        }
        return list;
    }
    public boolean isEmpty() {
        return deque.isEmpty();
    }
    public void printDeque() {
        Iterator<T> it = deque.iterator();
        if(deque.isEmpty()) {
            System.out.println("EMPTY");
        }
        else {
            while(it.hasNext()) {
                System.out.println(it.next().toString());
            }
        }
    }
}
