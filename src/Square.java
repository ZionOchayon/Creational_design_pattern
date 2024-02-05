public class Square extends Shape{
    private double sideLength;

    public Square(int sideLength){
        this.sideLength = sideLength;
    }

    public Square() {
        this(4);
    }

    @Override
    void draw() {
        System.out.println();
        for(int i = 0;i < sideLength; i++){
            for(int j = 0;j <= sideLength; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public Square(Square square){
        this.sideLength = square.sideLength;
    }

    @Override
    public Shape clone() {
        return new Square(this);
    }
}
