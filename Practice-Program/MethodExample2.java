
class MethodExample2{
    public int Add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
	MethodExample2 obj=new MethodExample2();
        int result = obj.Add(5,3);
        System.out.println(result);
    }
}

