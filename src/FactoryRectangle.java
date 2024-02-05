public class FactoryRectangle extends ShapeFactory{
    @Override
    public Shape createAndDrawShape() {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        return rectangle;
    }
}
