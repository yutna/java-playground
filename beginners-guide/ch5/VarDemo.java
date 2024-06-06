// A simple demonstration of local variable type inference.
class VarDemo {
    public static void main(String[] args) {
        // Use type inference to determine the type of the
        // variable named avg. In this case, double is inferred.
        var avg = 10.0;
        System.out.println("Value of avg: " + avg);

        // In the following context, var is NOT predefined indentifier.
        // It is simple a user-defined variable name.
        int var = 1;
        System.out.println("Value of var: " + var);

        // Interestingly, in the following sequence, var is used
        // as both the type of the declaration and as a variable name
        // in the initializer.
        var k = -var;
        System.out.println("Value of k: " + k);

        // You can also use `var` to declare an array.
        // both of these declaration is invalid
        // var[] myArray = new int[10] ❌
        // var myArray[] = new int[10] ❌
        // var nums = { 1, 2, 3, 5, 5, 6 }; ❌
        // In both cases, the use of the brackets is wrong because the type is inferred
        // from the type of the initializer.
        // It is important to emphasize that `var` can be used to declare a variable
        // only
        // when that variable is initialized. Therefore, the following statement is
        // wrong:
        // var counter; // ❌ wrong! initializer required.
        // Also, remember that `var` can be used only to declare **local variable**.
        // It CANNOT be used when declaring
        // 1) Instance variable ❌
        // 2) Parameters ❌
        // 3) Return types ❌
        var myArray = new int[10];
        System.out.println("Length of myArray: " + myArray.length);

        // Local Variable Type Inference with Reference Types
        // Full separate example see: VarDemo2.java
        var myStr = "This is a string";
        var mySubStr = myStr.substring(5, 10);
        System.out.println(mySubStr);

        // Some `var` Restrictions
        // 1) Only one variable can by declared at a time
        // 2) A variable CANNOT use **null** as an initializer
        // 3) The variable being declared CANNOT be used by the initializer expression.
        // ขยายประเด็นข้อสามคือ ตัวอย่างนี้แบบข้างบน var nums = { 1, 2, 3, 5, 5, 6 }; ❌
        // 4) The `var` CANNOT be used as the name of a class
        // 5) It also CANNOT be used as the name of other reference types, including an
        // interface, enumeration and annotation.
        // ขยายประเด็นข้อห้าในความเข้าใจของเราคือ String var = "xxxx"; ❌
        // 6) It also CANNOT be used to declare the exception type
        // caught by a catch statement. Also, neither lambda expression nor method
        // references can be used as initializers.
    }
}
