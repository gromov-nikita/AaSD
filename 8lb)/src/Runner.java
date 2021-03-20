import countries.Countries;
import queue.Queue;


public class Runner {
    public static void main(String[] args) {
        Countries obj1 = new Countries();
        Countries obj2 = new Countries("1", "1", 1 ,1 , true);
        Countries obj3 = new Countries("2", "2", 2 ,2 , false);
        Queue<Countries> queue1 = new Queue<Countries>();
        queue1.push(obj1);
        queue1.push(obj2);
        queue1.push(obj3);
        System.out.println("Queue1:");
        queue1.printQueue();
        System.out.println();
        queue1.pop();
        System.out.println(queue1.isEmpty());
        queue1.printQueue();
        System.out.println();
        queue1.pop(2);
        System.out.println(queue1.isEmpty());
        queue1.printQueue();
        Countries[] array = new Countries[3];
        array[0] = obj1;
        array[1] = obj2;
        array[2] = obj3;
        Queue<Countries> queue2 = new Queue<Countries>(array);
        System.out.println();
        System.out.println("Queue2:");
        queue2.printQueue();
    }
}
