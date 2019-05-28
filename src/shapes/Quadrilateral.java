package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

//    public Quadrilateral(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }

    public double getLength() {
        return length;
    }

    protected abstract void setLength(double x);

    public double getWidth() {
        return width;
    }

    protected abstract void setWidth(double y);

    @Override
    public abstract double getPerimeter();

    @Override
    public abstract double getArea();
}
