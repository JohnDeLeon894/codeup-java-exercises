package shapes;

public class Square extends Quadrilateral{


    public Square(int num) {
        this.width=num;
        this.length=num;
    }


//    protected void setLength() {
//        this.length = 16;
//    }

    protected void setLength(double x){
        this.length = x;
    }

    protected void setWidth(double y) {
        this.width = this.length;
    }


//    protected double setLength(int length) {
//        return this.length = length;
//
//    }

    @Override
    public double getArea() {
        return (this.length) * (this.width);
    }

    @Override
    public double getPerimeter() {
        return (this.length * 4);
    }

    @Override
    public double getLength() {
        return this.length;
    }

    @Override
    public double getWidth() {
        return this.width;
    }
}
