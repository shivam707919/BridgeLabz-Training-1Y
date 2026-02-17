public class SuperKeyword {
    int x=10;//parent variable

    //parent constructor
    SuperKeyword(){
        System.out.println("Super Constructor called");
    }

    //parent method
    void display(){
        System.out.println("Super Method Called");
    }
}
    //child class
class Employee extends SuperKeyword{
        int x = 20; // child variable

        Employee() {

          // Calling parent constructor
            super();
            // Access parent variable
            System.out.println("Parent variable x = " + super.x);

          // Calling parent method
            super.display();
            System.out.println("Employee Constructor Called");
        }

        public static void main(String[] args) {
            Employee e = new Employee();
        }
    }