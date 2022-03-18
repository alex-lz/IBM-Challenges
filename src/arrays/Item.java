package arrays;

public class Item implements Comparable<Item>{

    Integer id;
    String name;
    Integer price;

    public Item(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public int compareTo(Item o) {
        return Integer.compare(this.getPrice(), o.getPrice());
    }
    
}