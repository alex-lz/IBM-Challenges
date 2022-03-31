package challenge.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        Collections.addAll(items, 
        new Item(1, "IPhone", "Telefono de marca EUA", "Juan", 30),
        new Item(2, "Xiaomi", "Telefono de marca China", "Pepe", 40),
        new Item(3, "Samsung", "Telefono de marca Coreana", "Toño", 50),
        new Item(4, "LG", "Telefono de marca Coreana", "Luis", 10) );

        System.out.println("-- The most expensive item --");
        getMostExpesiveItem(items);
        System.out.println("-- The cheapest item --");
        getCheapestItem(items);
        System.out.println("-- Items less than or equal to $40 USD --");
        getLessThanPriceItems(items, 40);
        System.out.println("-- Items greater than or equal to $40 USD --");
        getGreaterThanPriceItems(items, 40);
        System.out.println("-- Phone Deatails --");
        getPhoneDetails(items);
        System.out.println("-- Manufactures --");
        getManufacturersList(items);

    }

    public static void getMostExpesiveItem(List<Item> items) {
        Item expensiveItem = items.stream().max(Comparator.comparing(Item::getPrice)).get();
        System.out.println( expensiveItem );
    }

    public static void getCheapestItem(List<Item> items) {
        Item cheaperItem = items.stream().min(Comparator.comparing(Item::getPrice)).get();
        System.out.println( cheaperItem );
    }

    public static void getLessThanPriceItems(List<Item> items, int prc) {
        items.stream().filter(i -> i.getPrice() <= prc).collect(Collectors.toList()).forEach(System.out::println);
    }

    public static void getGreaterThanPriceItems(List<Item> items, int prc) {
        items.stream().filter(i -> i.getPrice() >= prc).collect(Collectors.toList()).forEach(System.out::println);
    }

    public static void getManufacturersList(List<Item> items) {
        List<String> manufacturers = items.stream().map(Item::getManufacturer).collect(Collectors.toList());
        manufacturers.forEach( System.out::println);
    }

    public static void getPhoneDetails(List<Item> items) {
        List<String> details = items.stream().map(i -> " Equipo: "+i.getName()+" - Descripcion: "+i.getDescription()+" - Price: $"+i.getPrice()).collect(Collectors.toList());
        details.forEach( System.out::println);
    }
    
}
