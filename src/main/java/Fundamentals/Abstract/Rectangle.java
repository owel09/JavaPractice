package Fundamentals.Abstract;

class Rectangle extends Shape {

    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    final double getArea() {
        return this.getHeight()*this.getWidth();
    }

}
