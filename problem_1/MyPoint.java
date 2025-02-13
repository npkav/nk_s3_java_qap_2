// Nickolas Kavanagh - SD12
// Semester 3 - Advanced Programming (Java)
// 2025/02/05 - 2025/02/13

// Problem #1: The MyLine and MyPoint Classes

// A class called MyLine, which models a line with a begin point at (x1, y1) and an end point at (x2, y2),
// is designed as shown in the class diagram. The MyLine class uses two MyPoint instances (written in the
// earlier exercise) as its begin and end points. Write the MyLine class. Also write a test driver to test
// all the public methods in the MyLine class.


package problem_1;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getters and setters for x and y coordinates
    public int getX() { return x; }
    public int getY() { return y; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
}
