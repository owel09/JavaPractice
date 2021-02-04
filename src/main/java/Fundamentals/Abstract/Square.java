package Fundamentals.Abstract;

class Square extends Shape {
    public Square(double side) {
        super(side,side);
    }

    @Override
    final double getArea() {
        return this.getHeight()*this.getWidth();
    }
}
