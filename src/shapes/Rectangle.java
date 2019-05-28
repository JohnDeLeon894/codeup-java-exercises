package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(int x, int y) {
        setLength(x);
        setWidth(y);
    }


    protected void setLength(double x) {
        this.width = x;
    }

    public void setWidth(double x) {
        this.width = x;
    }

    @Override
    public double getPerimeter() {
        double x = this.getLength();
        double y = this.getWidth();
        return (x*2) + (y*2);
    }

    @Override
    public double getArea() {
        double x = this.getLength();
        double y = this.getWidth();
        return x*y;
    }

}
