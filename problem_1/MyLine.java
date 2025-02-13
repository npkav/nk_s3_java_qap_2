// Nickolas Kavanagh - SD12
// Semester 3 - Advanced Programming (Java)
// 2025/02/05 - 2025/02/13

// Problem #1: The MyLine and MyPoint Classes

// A class called MyLine, which models a line with a begin point at (x1, y1) and an end point at (x2, y2),
// is designed as shown in the class diagram. The MyLine class uses two MyPoint instances (written in the
// earlier exercise) as its begin and end points. Write the MyLine class. Also write a test driver to test
// all the public methods in the MyLine class.


package problem_1;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // getters and setters for begin and end points
    public MyPoint getBegin() { return begin; }
    public void setBegin(MyPoint begin) { this.begin = begin; }
    public MyPoint getEnd() { return end; }
    public void setEnd(MyPoint end) { this.end = end; }

    // getters and setters for coordinates
    public int getBeginX() { return begin.getX(); }
    public void setBeginX(int x) { begin.setX(x); }
    public int getBeginY() { return begin.getY(); }
    public void setBeginY(int y) { begin.setY(y); }
    public int getEndX() { return end.getX(); }
    public void setEndX(int x) { end.setX(x); }
    public int getEndY() { return end.getY(); }
    public void setEndY(int y) { end.setY(y); }

    // getters and setters for length and gradient
    public double getLength() {
        return Math.sqrt(Math.pow(end.getX() - begin.getX(), 2) + Math.pow(end.getY() - begin.getY(), 2));
    }

    // getters and setters for gradient
    public double getGradient() {
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    }

    // getters and setters for string representation
    public String toString() {
        return "MyLine[begin=(" + begin.getX() + "," + begin.getY() + "),end=(" + end.getX() + "," + end.getY() + ")]";
    }
}
