package InterfaceEx2;

public interface InterfaceExample {

//void show();

    default void display() {
        show();
        System.out.println("Default method");
    }
    private void show(){
        System.out.println("private Method ");
    }
}
