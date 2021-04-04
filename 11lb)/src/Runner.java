import countries.Countries;
public class Runner {
    public static void main(String[] args) {
        Countries obj1 = new Countries("1", "1", 1, 3, true);
        Countries obj2 = new Countries("2", "2", 2, 5, false);
        Countries obj3 = new Countries("3", "3", 3, 8, true);
        Countries obj4 = new Countries("4", "4", 4, 1, false);
        Countries obj5 = new Countries("5", "5", 5, 2, true);
        Countries obj6 = new Countries("6", "6", 6, 7, false);
        Countries obj7 = new Countries("7", "7", 5, 9, true);
        Countries obj8 = new Countries("8", "8", 6, 4, false);
        Countries[] array = new Countries[6];
        array[0] = obj1;
        array[1] = obj2;
        array[2] = obj3;
        array[3] = obj4;
        array[4] = obj5;
        array[5] = obj6;
        Countries.qSortPopulation(array,0, array.length - 1);
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
