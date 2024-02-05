import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Factory method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the shape you want to create: ");
        String shapeName = scanner.nextLine();

        /* Part 2
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.createAndDrawShape(shapeName);
         */

        // Part 1 and 3
        switch (shapeName.toLowerCase()) {
            case "square" -> {
                /* Part 1
                Square square = new Square();
                square.draw();
                 */

                // Part 3
                new FactorySquare().createAndDrawShape();
            }
            case "rectangle" -> {
                /* Part 1
                Rectangle rectangle = new Rectangle();
                rectangle.draw();
                 */

                // Part 3
                new FactoryRectangle().createAndDrawShape();
            }
            case "triangle" -> {
                /* Part 1
                Triangle triangle = new Triangle();
                triangle.draw();
                 */

                // Part 3
                new FactoryTriangle().createAndDrawShape();
            }
            default -> System.out.println("Invalid shape name.");
        }

        // Builder
        DrawingBuilder builder = new DrawingBuilder();
        Drawing draw1 = builder.name("Mona Lisa")
                .artistName("Leonardo da Vinci")
                .price(900000)
                .build();

        builder = new DrawingBuilder();
        Drawing draw2 = builder.name("The Starry Night")
                .artistName("Vincent van Gogh")
                .width(2)
                .length(4)
                .build();

        builder = new DrawingBuilder();
        Drawing draw3 = builder.name("The Potato Eaters")
                .price(400000)
                .build();

        System.out.println(draw1);
        System.out.println(draw2);
        System.out.println(draw3);

        // Prototype
        Shape[] shapes = {new FactorySquare().createAndDrawShape(),
                new FactorySquare().createAndDrawShape(),
                new FactoryRectangle().createAndDrawShape(),
                new FactoryTriangle().createAndDrawShape(),
                 new FactoryTriangle().createAndDrawShape()};

        System.out.println("\n------ Cloned Shapes ------");
        for (Shape shape : shapes){
            Shape clonedShape = shape.clone();
            clonedShape.draw();
        }
    }
}