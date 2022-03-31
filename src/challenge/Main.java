package challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        Collections.addAll(items, 
        new Item(1, "IPhone", "Telefono de marca1", "Juan", 30),
        new Item(2, "Xiaomi", "Telefono de marca2", "Pepe", 40),
        new Item(3, "Samsung", "Telefono de marca3", "Toño", 50) );

        //getCheapItemsByprice(items, 40);
        //getExpensiveItemsByprice(items, 40);
        //getPhoneDetails(items);
        getCheaperItem(items);

    }

    public static void getCheaperItem(List<Item> items) {
        items.stream().min(Comparator.comparing(Item::getPrice));
        //items.stream().filter(i -> i.getPrice() <= prc).collect(Collectors.toList()).forEach(System.out::println);
    }

    public static void getCheapItemsByprice(List<Item> items, int prc) {
        items.stream().filter(i -> i.getPrice() <= prc).collect(Collectors.toList()).forEach(System.out::println);
    }

    public static void getExpensiveItemsByprice(List<Item> items, int prc) {
        items.stream().filter(i -> i.getPrice() >= prc).collect(Collectors.toList()).forEach(System.out::println);
    }

    public static void getManufacturersList(List<Item> items) {
        List<String> manufacturers = items.stream().map(Item::getManufacturer).collect(Collectors.toList());
        manufacturers.forEach( System.out::println);
    }

    public static void getPhoneDetails(List<Item> items) {
        List<String> details = items.stream().map(i -> " Equipo: "+i.getName()+" Desc: "+i.getDescription()+" Price: $"+i.getPrice()).collect(Collectors.toList());
        details.forEach( System.out::println);
    }
    
}
