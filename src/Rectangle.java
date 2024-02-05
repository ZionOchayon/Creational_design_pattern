public class Rectangle extends Shape{

    private double length;
    private double with;

    public Rectangle(int length,int with){
        this.length = length;
        this.with = with;
    }

    public Rectangle(){
        this(4,4);
    }

    @Override
    void draw() {
        System.out.println();
        for(int i = 0;i < length; i++){
            for(int j = 0;j <= with; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public Rectangle(Rectangle rectangle){
        this.length = rectangle.length;
        this.with = rectangle.with;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
