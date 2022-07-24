public class Drawing {
    private Shape shape1;
    private Shape shape2;

    public Drawing(Shape shape1, Shape shape2) {
        this.shape1 = shape1;
        this.shape2 = shape2;
    }

    public void printTotalPerimeter() {
        double totalPerimeter = shape1.perimeter() + shape2.perimeter();
        System.out.println(totalPerimeter);
    }
}
