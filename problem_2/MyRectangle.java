// Nickolas Kavanagh - SD12
// Semester 3 - Advanced Programming (Java)
// 2025/02/05 - 2025/02/13

// Problem #2: The MyRectangle and MyPoint Classes

// Design a MyRectangle class which is composed of two MyPoint instances as its top-left and
// bottom-right corners. Draw the class diagrams, write the codes, and write the test drivers.


package problem_2;

// import the MyPoint class from problem #1
import problem_1.MyPoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // constructor with two MyPoint objects
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // constructor with four integers
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // getters and setters for topLeft and bottomRight
    public MyPoint getTopLeft() { return topLeft; }
    public void setTopLeft(MyPoint topLeft) { this.topLeft = topLeft; }
    public MyPoint getBottomRight() { return bottomRight; }
    public void setBottomRight(MyPoint bottomRight) { this.bottomRight = bottomRight; }

    // calculate width of rectangle
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // calculate height of rectangle
    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // calculate area of rectangle
    public int getArea() {
        return getWidth() * getHeight();
    }

    // calculate perimeter of rectangle
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // string output
    public String toString() {
        return "MyRectangle[topLeft=(" + topLeft.getX() + "," + topLeft.getY() + "), bottomRight=(" + bottomRight.getX() + "," + bottomRight.getY() + ")]";
    }
}