public class Seat {

    private Integer line;
    private String row;
    private Float price;
    private Boolean booking;

    public Seat(Integer line, String row, Float price) {
        this.line = line;
        this.row = row;
        this.price = price;
    }

    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    } 
    
}
