package _4._1;

public class Container {
    public class ContainerUpdateListener {
        private final int capturedValue;

        public ContainerUpdateListener() {
            this.capturedValue = value;
        }

        public boolean hasValueChanged() {
            return value != capturedValue;
        }
    }

    private int value;

    public Container(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
