import java.util.*;

public class Type_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer value:");
        float number = sc.nextInt();
        System.out.println("The float value is: " + number);
        sc.close();

    }}


//Type Conversion in Java
//Type conversion is the process of converting a value from one data type to another.
// In Java, type conversion can be done automatically by the compiler (implicit conversion) or manually by the programmer (explicit conversion).
//The value of source data type is converted to the value of the target data type.
//Value of source is less than value of target data type.
//Type is converted to a compatible type.
//byte -> short -> int -> long -> float -> double

//There are two types of type conversion in Java:
//1. Implicit Conversion (Widening): This occurs when a smaller data type is converted to a larger data type.
//2. Explicit Conversion (Narrowing): This occurs when a larger data type is converted to a smaller data type, which may lead to loss of information.

//Example of Implicit Conversion
//int to long, float to double, etc.

//Example of Explicit Conversion
//double to int, float to int, etc.

//Type conversion is essential in Java to ensure that operations between different data types are performed correctly.