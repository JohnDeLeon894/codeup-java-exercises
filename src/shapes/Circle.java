package shapes;

public class Circle {
    /*Circle class

 Inside of src, create a directory named shapes. Inside of shapes, create a class named Circle.
 This class should have a private radius property that is set through the constructor, and
 various methods for getting information about the circle, detailed below.


 public Circle(double radius)
 public double getArea()
 public double getCircumference()


***** at this step
 Inside of shapes, create a class named CircleApp that prompts the user for the
radius of the
 circle using your Input class, creates a Circle object, and displays the circumference and area.
 (Note that you will need to import your Input class.)

The formulas for circumference and area:


circumference = 2 x pi x radius
area = pi x (radius ^ 2)
For the value of pi, use the PI constant of the Math class.

Bonus

 After a circle is created, use the yesNo method of your Input class and ask the user if they
 would like to make another. Continue creating circles and displaying information about them
 until the user says they do not want to continue.

 Before exiting, the program should output the total number of circles created. Use a private
 static property, along with a public static method to keep track of and display the total number of circles created.
*/
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {

        double x = Math.pow(this.radius, 2);
        double PI = Math.PI;
        double area = x * PI;
        return area;
    }

    public double getCircumference() {
        //circumference = 2 x pi x radius
        double x = this.radius;
        double PIsqr = Math.PI * 2;
        double circumference = x * PIsqr;
        return circumference;
    }

}
