public class Test {
    public static void main(String[] args) {
        Shape s = new Shape(10, "red");
        System.out.println(s);

        Triangle t = new Triangle();
        t.setSize1(3);
        t.setSize2(4);
        t.setSize3(5);
        t.setColor("green");
        System.out.println(t);
    }
}
