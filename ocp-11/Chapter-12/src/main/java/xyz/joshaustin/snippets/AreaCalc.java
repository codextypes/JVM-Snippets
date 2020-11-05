package xyz.joshaustin.snippets;

// Local class example
public class AreaCalc {

    private int length;

    public AreaCalc(int length) {
        this.length = length;
    }

    public void calculate() {
        final int width = 20;
        class MyLocalClass {
            public void multiply() {
                System.out.println(length * width);
            }
        }
        var localClass = new MyLocalClass();
        localClass.multiply();
    }

    public static void main(String[] args) {
        var areaCalc = new AreaCalc(10);
        areaCalc.calculate();
    }

}
