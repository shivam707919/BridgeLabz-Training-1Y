package Interface;

public class MarkerClass implements Marker{
    String name="Shivam";

    public static void main(String[] args) {
        MarkerClass s=new MarkerClass();

        if(s instanceof Marker){
            System.out.println("Marked class - special permission given");
        }else{
            System.out.println("Not Marked");
        }
    }
}
