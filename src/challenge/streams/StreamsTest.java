package challenge.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
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


    
}
