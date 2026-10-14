
public class main6 {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 1. Arithmetic Operators
        System.out.println("1. Arithmetic Operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // 2. Relational Operators
        System.out.println("\n2. Relational Operators");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 3. Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("\n3. Logical Operators");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // 4. Assignment Operators
        System.out.println("\n4. Assignment Operators");
        int c = 10;
        c += 5;
        System.out.println("c += 5: " + c);
        c -= 3;
        System.out.println("c -= 3: " + c);
        c *= 2;
        System.out.println("c *= 2: " + c);
        c /= 4;
        System.out.println("c /= 4: " + c);
        c %= 3;
        System.out.println("c %= 3: " + c);

        // 5. Unary Operators
        System.out.println("\n5. Unary Operators");
        int n = 5;
        System.out.println("+n: " + (+n));
        System.out.println("-n: " + (-n));
        System.out.println("++n: " + (++n));
        System.out.println("n++: " + (n++));
        System.out.println("After n++: " + n);
        System.out.println("--n: " + (--n));
        System.out.println("!x: " + (!x));
        System.out.println("~n: " + (~n));

        // 6. Bitwise Operators
        System.out.println("\n6. Bitwise Operators");
        int p = 5;
        int q = 3;
        System.out.println("p & q: " + (p & q));
        System.out.println("p | q: " + (p | q));
        System.out.println("p ^ q: " + (p ^ q));

        // 7. Shift Operators
        System.out.println("\n7. Shift Operators");
        System.out.println("p << 1: " + (p << 1));
        System.out.println("p >> 1: " + (p >> 1));
        System.out.println("p >>> 1: " + (p >>> 1));

        // 8. Ternary Operator
        System.out.println("\n8. Ternary Operator");
        int max = (a > b) ? a : b;
        System.out.println("Maximum: " + max);

        
    }
}

