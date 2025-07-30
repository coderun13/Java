
import java.util.Scanner;

public class Type_casting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = 25.12f;
        int b = (int) a;
        System.out.println(b);
    }
    
}

//Type casting is the process of converting a variable from one type to another. In Java, there are two types of type casting: implicit and explicit. Implicit casting happens automatically when converting a smaller data type to a larger data type, while explicit casting requires a cast operator to convert a larger data type to a smaller one.
//loss of data can occur during explicit casting if the value exceeds the range of the target type.

// Example of implicit casting
// int to double

//example of explicit casting
// double to int
// Implicit casting example