import java.util.Scanner;
class AreaofCircle{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);

System.out.println("Enter The Radius");
double Radius=scanner.nextDouble();

double Area=(22.0/7)*Radius*Radius;
System.out.println("Area of circle of Radius "+Radius+" is : "+Area);
scanner.close();
}
}
