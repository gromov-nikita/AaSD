import countries.Countries;
import deque.Deque;

import java.util.Iterator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Countries obj1 = new Countries();
        Countries obj2 = new Countries("1", "1", 1, 1, true);
        Countries obj3 = new Countries("2", "2", 2, 2, false);
        Countries obj4 = new Countries("3", "3", 3, 3, true);
        Countries obj5 = new Countries("4", "4", 4, 4, false);
        Countries obj6 = new Countries("5", "5", 5, 5, true);
        Countries obj7 = new Countries("6", "6", 6, 6, false);
        Deque<Countries> deque1 = new Deque<Countries>();
        deque1.push(obj1);
        deque1.pushFirst(obj2);
        deque1.push(obj3);
        deque1.pushFirst(obj4);
        deque1.push(obj5);
        deque1.pushFirst(obj6);
        deque1.push(obj7);
        System.out.println("Deque1:");
        deque1.printDeque();
        System.out.println();
        System.out.println("DELETE:");
        System.out.println(deque1.pop());
        System.out.println(deque1.popBack());
        System.out.println();
        List<Countries> list = deque1.popBack(2);
        Iterator<Countries> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        list = deque1.pop(2);
        it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
        deque1.printDeque();
        System.out.println(deque1.isEmpty());
        Countries[] array = new Countries[7];
        array[0] = obj1;
        array[1] = obj2;
        array[2] = obj3;
        array[3] = obj4;
        array[4] = obj5;
        array[5] = obj6;
        array[6] = obj7;
        Deque<Countries> deque2 = new Deque<Countries>(array);
        System.out.println();
        System.out.println("Deque2:");
        deque2.printDeque();
    }
}