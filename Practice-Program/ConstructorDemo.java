public class ConstructorDemo {

        int id;
        String name;
        int age;

      //  public ConstructorDemo(){
      // System.out.println("Default Constructor");
      //  }
        public ConstructorDemo(int id, String name, int age){
            this.id=id;
            this.name=name;
            this.age=age;
        }
        void Display(){
            System.out.println("Id: "+id);
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
        }


        public static void main(String[] args){
            ConstructorDemo c1=new ConstructorDemo(10,"Shivam",20);
            System.out.println(c1);
            c1.Display();
        }
}
