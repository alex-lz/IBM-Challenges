package challenge.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/**
 Having a list of Items write down 10 methods that uses stream() to perform
 several actions over the items like: sort, filter, perform calculations, etc...
 chaining at least two intermediate operations like: map, flatMap, reduce, filter, etc...

 public class Item {
    int id;
    String name;
    String description;
    String manufacturer;
    int price;
 }
 */
public class Streams {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        Collections.addAll(items, 
        new Item(1, "IPhone", "Telefono de marca EUA", "Juan", 30),
        new Item(2, "Xiaomi", "Telefono de marca China", "Pepe", 40),
        new Item(3, "Samsung", "Telefono de marca Coreana", "Toño", 50),
        new Item(4, "LG", "Telefono de marca Coreana", "Luis", 10) );

        System.out.println("-- The most expensive item --");
        System.out.println( getMostExpesiveItem(items) );
        System.out.println("-- The cheapest item --");
        System.out.println( getCheapestItem(items) );
        System.out.println("-- Items less than or equal to $40 USD --");
        getLessThanPriceItems(items, 40).forEach(System.out::println);
        System.out.println("-- Items greater than or equal to $40 USD --");
        getGreaterThanPriceItems(items, 40).forEach(System.out::println);
        System.out.println("-- Phone Deatails --");
        getPhoneDetails(items).forEach(System.out::println);
        System.out.println("-- Manufactures --");
        getManufacturersList(items).forEach(System.out::println);

    }

    public static Item getMostExpesiveItem(List<Item> items) {
        Item expensiveItem = items.stream().max(Comparator.comparing(Item::getPrice)).get();
        // System.out.println( expensiveItem );
        return expensiveItem;
    }

    public static Item getCheapestItem(List<Item> items) {
        Item cheaperItem = items.stream().min(Comparator.comparing(Item::getPrice)).get();
        // System.out.println( cheaperItem );
        return cheaperItem;
    }

    public static List<Item> getLessThanPriceItems(List<Item> items, int prc) {
        List<Item> listItems = items.stream().filter(i -> i.getPrice() <= prc).collect(Collectors.toList());
        // listItems.forEach(System.out::println);
        return listItems;
    }

    public static List<Item> getGreaterThanPriceItems(List<Item> items, int prc) {
        List<Item> listItems = items.stream().filter(i -> i.getPrice() >= prc).collect(Collectors.toList());
        // listItems.forEach(System.out::println);
        return listItems;
    }

    public static List<String> getPhoneDetails(List<Item> items) {
        List<String> details = items.stream().map(i -> " Equipo: "+i.getName()+" - Descripcion: "+i.getDescription()+" - Price: $"+i.getPrice()).collect(Collectors.toList());
        // details.forEach( System.out::println);
        return details;
    }

    public static List<String> getManufacturersList(List<Item> items) {
        List<String> manufacturers = items.stream().map(Item::getManufacturer).collect(Collectors.toList());
        // manufacturers.forEach( System.out::println);
        return manufacturers;
    }
    
}
