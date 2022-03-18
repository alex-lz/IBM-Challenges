import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {

        int[] numbers = new int[]{6,3,1,2,7,5,4,8,9};

        System.out.println("Unsorted array => " + Arrays.toString(numbers));
        System.out.println("Sorted array => " + Arrays.toString( arrSort(numbers)) );

        /*ArrayList<Item> array2 = new ArrayList<Item>(Arrays.asList(
            new Item(7, "iPhone", 30),
            new Item(3, "Xiaomi", 15),
            new Item(9, "Samsung", 45)
        ));

        System.out.println("Unsorted => " + array2.toString());

        Collections.sort(array2);

        System.out.println("Sorted => " + array2.toString());
        */

       // System.out.println("El valor de la letra A es " + Letter.valueOf("B"));
    }
    
    // Challenge 2
    public static int[] arrSort(int[] arr) {
        boolean unsortedArr = true;
        while(unsortedArr){

            unsortedArr = false;
            for (int i = 0; i < arr.length-1;i++) {

                if(arr[i] > arr[i+1]) {
                    int max = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = max;
                    unsortedArr = true;
                }
                
            }

        }
        return arr;
    }

    public static void arrSort2(int[] arr) {
        Arrays.sort(arr);
    }


}
