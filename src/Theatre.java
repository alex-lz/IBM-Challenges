import java.util.ArrayList;
import java.util.List;

public class Theatre {
    
    String name;
    List<Seat> listOfSeats;
    String numberOfRows;
    Integer numberOfSeats;

    public Theatre(String name, String numberOfRows, Integer numberOfSeats) {
        this.name = name;
        this.listOfSeats = listOfSeats;
        this.numberOfRows = numberOfRows;
        this.numberOfSeats = numberOfSeats;

        List<Seat> listOfSeats = new ArrayList<>();
    }

    
}
