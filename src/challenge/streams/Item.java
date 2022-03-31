package challenge.streams;

public class Item {

    int id;
    String name;
    String description;
    String manufacturer;
    int price;

    public Item(int id, String name, String description, String manufacturer, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", name=" + name + ", description=" + description + ", manufacturer=" + manufacturer + ", price=" + price + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
