package challenge.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 -Create two functions that sorts arrays (array handling and using Array class)
  array1 = new int[]{6,3,1,2,7,5,4,8,9};

-Define a class Item(id, name, price) and initialize an array as follows 
and create a function that prints items sorted by price
  array2 = {
            new Item(7, "iPhone", 30),
            new Item(3, "Xiaomi", 15),
            new Item(9, "Samsung", 45)
    };
 */

public class MyArrays {

    public static void main(String[] args) throws Exception {

        // Challenge 1
        System.out.println("--Challenge 1--");
        int[] numbers = new int[]{6,3,1,2,7,5,4,8,9};
        int[] numbers2 = new int[]{6,3,1,2,7,5,4,8,9};

        System.out.println("Unsorted array => " + Arrays.toString(numbers));
        System.out.println("Sorted array => " + Arrays.toString( arrSort(numbers)) );

        System.out.println("Unsorted array => " + Arrays.toString(numbers2));
        arrSort2(numbers);
        System.out.println("Sorted array => " + Arrays.toString( numbers2));

        // Challenge 2
        System.out.println("--Challenge 2--");
        ArrayList<Item> array2 = new ArrayList<Item>(Arrays.asList(
            new Item(7, "iPhone", 30),
            new Item(3, "Xiaomi", 15),
            new Item(9, "Samsung", 45)
        ));

        System.out.println("Unsorted => " + array2.toString());

        Collections.sort(array2);

        System.out.println("Sorted => " + array2.toString());

        // Challenge 2 method
        System.out.println("--Challenge 2 method--");
        Item[] items = new Item[]{
            new Item(7, "iPhone", 30),
            new Item(3, "Xiaomi", 15),
            new Item(9, "Samsung", 45)
        };
        System.out.println("Unsorted => " + Arrays.asList(items).toString());

        sortObj(items);

        System.out.println("Sorted => " + Arrays.asList(items).toString());

    }
    
    // Challenge 1 Methods
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

    // Challenge 2 Method sort by greater than
    public static void sortObj(Item[] items) {

        Arrays.sort(items, (n1, n2) -> n2.getPrice() - n1.getPrice());

    }
}

