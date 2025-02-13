package problem_2;

// import MyPoint class from problem_1
import problem_1.MyPoint;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle testRect1 = new MyRectangle(new MyPoint(64, 48), new MyPoint(128, 96));
        MyRectangle testRect2 = new MyRectangle(2, 4, 6, 8);

        // output rectangle 1
        System.out.println(testRect1);
        System.out.println("Rectangle 1 - Width: " + testRect1.getWidth());
        System.out.println("Rectangle 1 - Height: " + testRect1.getHeight());
        System.out.println("Rectangle 1 - Area: " + testRect1.getArea());
        System.out.println("Rectangle 1 - Perimeter: " + testRect1.getPerimeter());

        // output rectangle 2
        System.out.println(testRect2);
        System.out.println("Rectangle 2 - Width: " + testRect2.getWidth());
        System.out.println("Rectangle 2 - Height: " + testRect2.getHeight());
        System.out.println("Rectangle 2 - Area: " + testRect2.getArea());
        System.out.println("Rectangle 2 - Perimeter: " + testRect2.getPerimeter());
    }
}