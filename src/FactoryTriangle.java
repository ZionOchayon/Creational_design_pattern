public class FactoryTriangle extends ShapeFactory{
    @Override
    public Shape createAndDrawShape() {
        Triangle triangle = new Triangle();
        triangle.draw();
        return triangle;
    }
}
