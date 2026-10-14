import java.util.Scanner;

public class sample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check leap year
        System.out.println("Enter the year:");
        int year = sc.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

        // Check positive, negative, or zero
        System.out.println("Enter a number:");
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println("Positive");
        } else if (a < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}

public class sample3 {
    public static void main(String[] args) {
        boolean check = true;
        boolean a = false;
        boolean b = true;
        int c = 5;

        if ((c << 2) > 15) {
            if (b) {
                a = !a;

                if (a) {
                    b = !b;
                }

                if (b) {
                    c += 5;
                } else {
                    c += 10;
                }
            }
        }

        System.out.println(c);
    }

}

