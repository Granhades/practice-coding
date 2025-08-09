
import java.util.*;
import java.util.stream.Collector;

public class ArrayList01 {
    /* Exercise 1 -> Basic Add, Access, Modify
    1. Create an ArrayList of Strings called fruits.
    2. Add "Apple", "Banana", "Orange".
    3. Insert "Mango" at index 1.
    4. Change "Orange" to "Watermelon".
    5. Print all fruits.
    */

    /* Exercise 2 -> Remove and Search
    1. Create an ArrayList<Integer> with [5, 10, 15, 20, 25].
    2. Remove the element at index 2.
    3. Remove the value 20.
    4. Check if 25 is in the list.
    5. Print the size of the list.
    */

    /* Exercise 3 -> Sorting
    1. Create an ArrayList of names: ["John", "Alice", "Bob", "Charlie"].
    2. Sort alphabetically.
    3. Sort by length of name.
    4. Print results.
    */

    /* Exercise 4 -> 2D List / Nested ArrayList
    1. Create an ArrayList<ArrayList<Integer>>.
    2. Add:
       Row 1: [1, 2, 3]
       Row 2: [4, 5]
    3. Print the second element of the first row.
    4. Print the first element of the second row.
    */

    /* Exercise 5 -> Filtering + Sorting
    Given a list of maps:
    [
     {"name":"Pizza", "price":12},
     {"name":"Salad", "price":8},
     {"name":"Burger", "price":10},
     {"name":"Pasta", "price":10}
    ]
    1. Keep only items with price >= 10.
    2. Sort by price ASC, then name ASC.
    3. Print results.
    */

    /* Exercise 6 -> Queries on Dynamic Data
    1. Read N lines of integers into ArrayList<ArrayList<Integer>>.
    2. Read Q queries: each query gives row and col.
    3. Print the value or "ERROR!" if not found.
    */

    public static void main(String[] args){
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFourth();
        exerciseFifth();


    }
    public static void exerciseOne(){
        //Exercise 1
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add(1, "Mango");
        int fruitIndex = fruits.indexOf("Orange");
        fruits.set(fruitIndex, "Watermelon");
        fruits.forEach(fruit -> System.out.println(fruit));
    }
    public static void exerciseTwo(){
        // Exercise 2
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,10,15,20,25));
        list.remove(2);
        int indexNumber = list.indexOf(20);
        list.remove(indexNumber);
        list.contains(25);
        System.out.println(list.size());
    }
    public static void exerciseThree()
    {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Alice", "Bob", "Charlie"));
        Collections.sort(names);
        names.sort((a,b) -> a.length() - b.length());
        names.forEach(s -> System.out.println(s));
    }

    public static void exerciseFourth() {
            /* Exercise 4 -> 2D List / Nested ArrayList
        1. Create an ArrayList<ArrayList<Integer>>.
        2. Add:
           Row 1: [1, 2, 3]
           Row 2: [4, 5]
        3. Print the second element of the first row.
        4. Print the first element of the second row.
        */
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        arr.add(new ArrayList<>(Arrays.asList(4, 5)));

        System.out.println(arr.get(0).get(1));
        System.out.println(arr.get(1).get(0));
    }

    public static void exerciseFifth()
    {
        /* Exercise 5 -> Filtering + Sorting
        Given a list of maps:
        [
         {"name":"Pizza", "price":12},
         {"name":"Salad", "price":8},
         {"name":"Burger", "price":10},
         {"name":"Pasta", "price":10}
        ]
        1. Keep only items with price >= 10.
        2. Sort by price ASC, then name ASC.
        3. Print results.
        */
       List<Map<String, Object>> menu = new ArrayList<>();
       menu.stream().filter(x -> (int) x.get("price") >= 10);
       Comparator<Map<String, Object>> byPrice = Comparator.comparingInt(a -> (int) a.get("price"));
       Comparator<Map<String, Object>> byName = Comparator.comparingInt(a -> (int) a.get("price"));
       menu.sort(byPrice.thenComparing(byName));
       menu.forEach( x -> System.out.println(x.get("Name")+ " " + x.get(" Price ")));
    }
    public static void exerciseSixth()
    {
        /* Exercise 6 -> Queries on Dynamic Data
        1. Read N lines of integers into ArrayList<ArrayList<Integer>>.
        2. Read Q queries: each query gives row and col.
        3. Print the value or "ERROR!" if not found.
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i<n; i++)
        {
            int d = sc.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j<d; j++)
            {
                row.add(sc.nextInt());
            }
            list.add(row);
        }
        //How many rows
        int q = sc.nextInt(); //Query gives row and col.

        for(int i = 0; i< q; i++)
        {
            int x = sc.nextInt() - 1; //Based on index 0
            int y = sc.nextInt() - 1; //Based on index 0

            try{
                list.get(x).get(y);
            }
            catch (Exception e){
                System.out.println(" ERROR !");
        }
        }
        sc.close();
    }
}

