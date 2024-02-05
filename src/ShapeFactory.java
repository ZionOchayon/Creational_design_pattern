public abstract class ShapeFactory{

    // Part 3
    public abstract Shape createAndDrawShape();

    /* Part 2
    public Shape createAndDrawShape(String shapeName){
        switch (shapeName.toLowerCase()) {
            case "square" -> {
                Shape shape = new Square();
                shape.draw();
                return shape;
            }
            case "rectangle" -> {
                Shape shape = new Rectangle();
                shape.draw();
                return shape;
            }
            case "triangle" -> {
                Shape shape = new Triangle();
                shape.draw();
                return shape;
            }
            default -> {
                System.out.println("Invalid shape name.");
                return null;
            }

        }
    }
     */
}
