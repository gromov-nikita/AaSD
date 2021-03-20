import countries.Countries;
import queue.Queue;


public class Runner {
    public static void main(String[] args) {
        Countries obj1 = new Countries();
        Countries obj2 = new Countries("1", "1", 1 ,1 , true);
        Countries obj3 = new Countries("2", "2", 2 ,2 , false);
        Queue<Countries> Queue1 = new Queue<Countries>();
        Queue1.push(obj1);
        Queue1.push(obj2);
        Queue1.push(obj3);
        System.out.println("Queue1:");
        Queue1.printQueue();
        System.out.println();
        Queue1.pop();
        System.out.println(Queue1.isEmpty());
        Queue1.printQueue();
        System.out.println();
        Queue1.pop(2);
        System.out.println(Queue1.isEmpty());
        Queue1.printQueue();
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
