import countries.Countries;
import stack.Stack;
public class Runner {
    public static void main(String[] args) {
        Countries obj1 = new Countries();
        Countries obj2 = new Countries("1", "1", 1 ,1 , true);
        Countries obj3 = new Countries("2", "2", 2 ,2 , false);
        Stack<Countries> stack1 = new Stack<Countries>();
        stack1.push(obj1);
        stack1.push(obj2);
        stack1.push(obj3);
        System.out.println("Stack1:");
        stack1.printStack();
        System.out.println();
        stack1.pop();
        System.out.println(stack1.isEmpty());
        stack1.printStack();
        System.out.println();
        stack1.pop(2);
        System.out.println(stack1.isEmpty());
        stack1.printStack();
        Countries[] array = new Countries[3];
        array[0] = obj1;
        array[1] = obj2;
        array[2] = obj3;
        Stack<Countries> stack2 = new Stack<Countries>(array);
        System.out.println();
        System.out.println("Stack2:");
        stack2.printStack();
    }
}

