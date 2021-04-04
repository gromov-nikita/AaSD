import java.lang.reflect.Array;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] array = new int[11];
        array[0] = 5;
        array[1] = 2;
        array[2] = 8;
        array[3] = 7;
        array[4] = 9;
        array[5] = 4;
        array[6] = 1;
        array[7] = 0;
        array[8] = 6;
        array[9] = 3;
        array[10] = 10;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int find = 1;
        int i;
        for(i = 11 / 2; i > 0 || i < array.length;) {
            if(array[i] < find) {
                i++;
            }
            else {
                if(array[i] > find) {
                    i--;
                }
                else {
                    break;
                }
            }
        }
        System.out.println(array[i]);
    }
}
