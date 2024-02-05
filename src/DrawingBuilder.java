public class DrawingBuilder {
    private String name;
    private String artistName;
    private double price;
    private double width;
    private double length;

    public DrawingBuilder name(String name){
        this.name = name;
        return this;
    }

    public DrawingBuilder artistName(String artistName){
        this.artistName = artistName;
        return this;
    }

    public DrawingBuilder price(double price){
        this.price = price;
        return this;
    }

    public DrawingBuilder width(double width){
        this.width = width;
        return this;
    }

    public DrawingBuilder length(double length){
        this.length = length;
        return this;
    }

    public Drawing build() {
        return new Drawing(name, artistName, price, width, length);
    }
}
