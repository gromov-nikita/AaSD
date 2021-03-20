package sort;

import java.lang.reflect.Array;

public interface ISort {
    default Array[] sort(Array[] array) {

        return array;
    }
}
