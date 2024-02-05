public class Drawing {
    private final String name;
    private final String artistName;
    private final double price;
    private final double width;
    private final double length;

    public Drawing(String name, String artistName, double price, double width, double length) {
        this.name = name;
        this.artistName = artistName;
        this.price = price;
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "\nDrawing : \n" +
                "name='" + name + '\'' +
                ", artistName='" + artistName + '\'' +
                ", price=" + price +
                ", width=" + width +
                ", length=" + length;
    }
}
