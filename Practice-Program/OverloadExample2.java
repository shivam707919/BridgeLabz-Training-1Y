class OverloadExample2 {

    void add(int a, int b) {
        System.out.println("Integer Sum: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Double Sum: " + (a + b));
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        obj.add(10, 20);
        obj.add(5.5, 2.5);
    }
}
