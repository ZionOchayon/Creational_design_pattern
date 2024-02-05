public class FactorySquare extends ShapeFactory{
    @Override
    public Shape createAndDrawShape() {
        Square square = new Square();
        square.draw();
        return square;
    }
}
