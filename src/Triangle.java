public class Triangle extends Shape{

    private double hight;

    public Triangle(int hight){
        this.hight = hight;
    }

    public Triangle(){
        this(4);
    }

    @Override
    public void draw() {
        System.out.println();
        for(int i = 0;i < hight; i++){
            for(int j = 0;j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public Triangle(Triangle triangle){
        this.hight = triangle.hight;
    }

    @Override
    public Shape clone() {
        return new Triangle(this);
    }
}
