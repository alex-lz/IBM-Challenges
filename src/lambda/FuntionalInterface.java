package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class FuntionalInterface {

    public static void main(String[] args){

        List<Item> items = new ArrayList<>();
        Collections.addAll(items, 
        new Item("IPhone", 30),
        new Item("Xiaomi", 40),
        new Item("Samsung", 50) );


        Function<String, String> toUpper = str -> str.toUpperCase();
        System.out.println(toUpper.apply("academy"));

        BiFunction<String, String, String> concat = (str1, str2) -> str1 + " " + str2;
        System.out.println(concat.apply("java", "academy"));

        List<String> itnNames = items.stream().map(i -> i.getName()/**Item::getName */).collect(Collectors.toList());
        for(String nam: itnNames) {
            System.out.println(nam);
        }

        itnNames.forEach( n -> System.out.println(n));
        itnNames.forEach( System.out::println);

        List<Offer> offers = items.stream().map( i -> {
            if(i.getPrice() < 40) {
                return new Offer(i, 5);
            } else {
                return new Offer(i, 10);
            }
        }).collect(Collectors.toList());

        for(Offer ofr: offers) {
            System.out.println(ofr);
        }
        offers.forEach( System.out::println);

        Predicate<Item> filterByPrice = i -> i.getPrice() < 20;
        for(Item i: items) {
            if(filterByPrice.test(i)){
                System.out.println(i);
            }
        }
        items.stream().filter(i -> i.getPrice() < 31).collect(Collectors.toList()).forEach(System.out::println);
    }

} 

class Offer {
    private Item item;
    private int disc;

    public Offer(Item item, int disc){
        this.item = item;
        this.disc = disc;
    }

    @Override
    public String toString() {
        return "Offer [disc=" + disc + ", item=" + item + "]";
    }

}

class Item {
    private String name;
    private int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item [name=" + name + ", price=" + price + "]";
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}