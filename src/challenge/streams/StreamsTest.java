package challenge.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StreamsTest {

    Streams streams;
    List<Item> items;
    
    @BeforeEach
    void setUp() {
        streams = new Streams();

        items = new ArrayList<>();
        Collections.addAll(items, 
        new Item(1, "IPhone", "Telefono de marca EUA", "Juan", 30),
        new Item(2, "Xiaomi", "Telefono de marca China", "Pepe", 40),
        new Item(3, "Samsung", "Telefono de marca Coreana", "Toño", 50),
        new Item(4, "LG", "Telefono de marca Coreana", "Luis", 10) );
    }

    @Test
    @DisplayName("Test the most expensive item")
    void getMostExpesiveItemTest() {
        assertEquals(items.get(2), Streams.getMostExpesiveItem(items));
    }

    @Test
    @DisplayName("Test the cheapest item")
    void getCheapestItemTest() {
        assertEquals(items.get(3), Streams.getCheapestItem(items));
    }

    @Test
    @DisplayName("Test items less than or equal to $40 USD")
    void  getLessThanPriceItemsTest() {
        items.clear();
        Collections.addAll(items, 
        new Item(1, "IPhone", "Telefono de marca EUA", "Juan", 30),
        new Item(2, "Xiaomi", "Telefono de marca China", "Pepe", 40),
        new Item(4, "LG", "Telefono de marca Coreana", "Luis", 10) );
        assertEquals(items, Streams.getLessThanPriceItems(items, 40));
    }

    @Test
    @DisplayName("Test items greater than or equal to $40 USD")
    void getGreaterThanPriceItemsTest() {
        items.clear();
        Collections.addAll(items, 
        new Item(2, "Xiaomi", "Telefono de marca China", "Pepe", 40),
        new Item(3, "Samsung", "Telefono de marca Coreana", "Toño", 50) );
        assertEquals(items, Streams.getGreaterThanPriceItems(items, 40));
    }

    @Test
    @DisplayName("Test phone Deatails list")
    void getPhoneDetailsTest() {
        List<String> phoneDetails = new ArrayList<>();
        phoneDetails.add(" Equipo: IPhone - Descripcion: Telefono de marca EUA - Price: $30");
        phoneDetails.add(" Equipo: Xiaomi - Descripcion: Telefono de marca China - Price: $40");
        phoneDetails.add(" Equipo: Samsung - Descripcion: Telefono de marca Coreana - Price: $50");
        phoneDetails.add(" Equipo: LG - Descripcion: Telefono de marca Coreana - Price: $10");

        assertEquals(phoneDetails, Streams.getPhoneDetails(items));
    }

    @Test
    @DisplayName("Test manufactures list")
    void getManufacturersListTest() {
        List<String> manufacturers = new ArrayList<>();
        manufacturers.add("Juan");
        manufacturers.add("Pepe");
        manufacturers.add("Toño");
        manufacturers.add("Luis");
        assertEquals(manufacturers, Streams.getManufacturersList(items));
    }
    
}
