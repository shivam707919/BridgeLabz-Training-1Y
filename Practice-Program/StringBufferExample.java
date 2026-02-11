public class StringBufferExample {
    public static void main(String[] args){

//create a stringbuffer	object with initial value "hello"
        StringBuffer sb=new StringBuffer("Hello");

//append add text to existing string
        sb.append("World");
        System.out.println("append : "+sb);

//insert add text to a specific index
        sb.insert(5,",");
        System.out.println("insert : "+sb);

//replace() replaces characters from start index to end index
        sb.replace(6,11,"Java");
        System.out.println("replace : "+sb);

//delete() removes characters between start and end index
        sb.delete(5,6);
        System.out.println("delete : "+sb);

//reverse the string
        sb.reverse();
        System.out.println("reverse : "+sb);

        System.out.println("Length : "+sb.length());

//set CharAt() changes the characters at specific  index
        sb.setCharAt(2,'A');
        System.out.println("setCharAt : "+sb);

//substring() returns a part of string
        System.out.println("substring: "+sb.substring(1,4));
    }
}

