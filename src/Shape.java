public abstract class Shape implements Prototype{

    abstract void draw();

    @Override
    public abstract Shape clone();
}
