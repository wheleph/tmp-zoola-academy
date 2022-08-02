package _3;

public class Main {

    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();

        Drawing d = new Drawing(c, s);

        d.printTotalPerimeter();
    }
}
