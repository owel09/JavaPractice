package SoloLearn.Abstract;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Square(10);
        Shape s2 = new Rectangle(10,20);

        System.out.println("width of S1: " + s1.getWidth());
        System.out.println("height of S1: " + s1.getHeight());

        System.out.println("width of S2: " + s2.getWidth());
        System.out.println("height of S2: " + s2.getHeight());

        System.out.println("area of S1: " + s1.getArea());
        System.out.println("area of S2: " + s2.getArea());
    }
}
