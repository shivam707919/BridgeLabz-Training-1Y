public class ConstructorChaining {
    int id;
    String name;

    ConstructorChaining(){
        this(123,"Shivam");
        System.out.println("Default Constructor Called");

    }
    //Parameter constructor
    ConstructorChaining(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("parameter Constructor Called");
    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args){
        ConstructorChaining cd=new ConstructorChaining();
        cd.display();
    }
}
