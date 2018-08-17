package shapes;
//Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.

abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    public Quadrilateral(double l, double w) {
        this.length = l;
        this.width = w;

    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }
//    Since we dont' know what kind of Quad it is, the
//    process it's defined in each class
////when you need to set up setters it always uses the void

    abstract void setLength(double length);
    abstract void setWidth(double width);




    //control enter brings in override Methods
//    @Override
//    public double getPerimeter() {
//        return (2 * this.length) + (2 * this.width);
//    }
//
//    @Override
//    public double getArea() {
//        return this.length * this.width;
//    }


}
