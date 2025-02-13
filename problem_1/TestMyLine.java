package problem_1;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine testLine1 = new MyLine(1, 2, 3, 4);
        MyLine testLine2 = new MyLine(new MyPoint(56, 78), new MyPoint(910, 1011));

        // output begin and end points of line
        System.out.println(testLine1);
        System.out.println(testLine2);

        // set begin and end points of line 1
        testLine1.setBeginX(1213);
        testLine1.setEndY(1314);
        System.out.println(testLine1);

        // set begin and end points of line 2
        testLine2.setBeginX(1213);
        testLine2.setEndY(1314);
        System.out.println(testLine2);

        // output length and gradient of line 1
        System.out.println("Line 1 - Length: " + testLine1.getLength());
        System.out.println("Line 1 - Gradient: " + testLine1.getGradient());

        // output length and gradient of line 2
        System.out.println("Line 2 - Length: " + testLine2.getLength());
        System.out.println("Line 2 - Gradient: " + testLine2.getGradient());
    }
}