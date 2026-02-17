public class Constructorexample {
            int id;
            String name;
            int age;

        public Constructorexample(){
                System.out.println("default Constructor");

            }
        public Constructorexample(int id,String name,int age){
                this.id=id;
                this.name=name;
                this.age=age;

            }
            void display(){
            System.out.println("ID : "+id);
            System.out.println("NAME : "+name);
            System.out.println("AGE : "+age);
            }
            public static void main(String[] args){
                Constructorexample cd=new Constructorexample();
                Constructorexample cdd=new Constructorexample(15,"Shivam",20);
                cdd.display();

            }

        }



