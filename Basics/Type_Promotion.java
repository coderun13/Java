public class Type_Promotion {
    public static void main(String[] args){
        char a = 'a';
        char b = 'b';
        System.out.println(b-a);
        System.out.println(a + b);
        System.out.println((int)(a));
        System.out.println((int)(b));

    }
    
}

//Type Promotion in Java refers to the automatic conversion of a smaller data type to a larger data type when necessary. This occurs in expressions where different types are involved, ensuring that no data is lost during the conversion. For example, when an `int` is used in an expression with a `double`, the `int` is promoted to a `double` to maintain precision.
// This is particularly important in arithmetic operations and method calls where type compatibility is required. Type promotion
//byte, short, and char are promoted to int when used in expressions. This ensures that operations can be performed without losing information or causing errors due to type mismatches.
// one operand is long, float or double the whole expression is promoted to that type.

