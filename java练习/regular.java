import java.util.Arrays;

//import com.sun.tools.javac.code.Attribute.Array;

public class regular{
    public static String knight = "You are my sunshine";
    public static void main(String args[]){
        System.out.println("-1234".matches("-1234"));
        System.out.println(Arrays.toString(knight.split("[^a-p]+")));
    }
}