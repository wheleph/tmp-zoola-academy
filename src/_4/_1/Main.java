package _4._1;

public class Main {
    public static void main(String[] args) {
        Container c = new Container(1);
        c.setValue(2);

        Container.ContainerUpdateListener listener = c.new ContainerUpdateListener();
        System.out.println(listener.hasValueChanged());

        c.setValue(3);
        System.out.println(listener.hasValueChanged());

        c.setValue(2);
        System.out.println(listener.hasValueChanged());
    }
}
