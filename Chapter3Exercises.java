import java.util.Scanner;

public class Chapter3Exercises {
    public static void main(String[] args) {
        System.out.println("Chapter 3 Exercises");

        Exercise1(15);
        Exercise2(10);
        Exercise3(6, 8);
        Exercise4(3, 7);
        Exercise5(4, 6);
        Exercise6(11, 2);
        Exercise7(7, 2, 11);
        Exercise8(1, -7, 12);
        Exercise9(3572);
        Exercise10(2.0);
        Exercise11(1, 0, 4, 4);
        Exercise12(6.23, 5);
        Exercise13();
        Exercise14(3.0, 4.5);
        Exercise15(2.0);
        Exercise16(8, 5.2, 7.1);
        Exercise17("Hello", 10);
        Exercise18("test");
        Exercise19("Hello");
        Exercise20();
        Exercise21();
    }

    public static void Exercise1(int value) {
        System.out.println("\n>>>>> Exercise 1: <<<<<\n");
        int i;

        for (i = 1; i <= value; i++) {
            System.out.print("[" + i + "] ");
        }
        System.out.println();
    }

    public static void Exercise2(int value) {
        System.out.println("\n>>>>> Exercise 2: <<<<<\n");
        int i;

        for (i = 0; i <= value; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
        System.out.println();
    }

    public static void Exercise3(int base, int exp) {
        System.out.println("\n>>>>> Exercise 3: <<<<<\n");
        int i;

        for (i = 0; i <= exp; i++) {
            System.out.print((int) Math.pow(base, i) + " ");
        }
        System.out.println();
    }

    public static void Exercise4(int min, int max) {
        System.out.println("\n>>>>> Exercise 4: <<<<<\n");
        int i, j, k;

        for (i = min; i <= max; i++) {
            for (j = i; j <= max; j++) {
                System.out.print(j);
            }
            for (k = 0; k < i - min; k++) {
                System.out.print(min + k);
            }
            System.out.println();
        }
    }

    public static void Exercise5(int rows, int columns) {
        System.out.println("\n>>>>> Exercise 5: <<<<<\n");
        int i, j;
        int a;

        for (i = 1; i <= rows; i++) {
            System.out.print(i + ",");
            a = i;

            // change the operator to less than, so we don't print an extra column
            for (j = 1; j < columns; j++) {
                a += rows;
                System.out.print("" + a + ",");
            }
            System.out.println();
        }
    }

    public static void Exercise6(int int1, int int2) {
        System.out.println("\n>>>>> Exercise 6: <<<<<\n");

        System.out.println(Math.max(Math.abs(int1), Math.abs(int2)));
    }

    public static void Exercise7(int int1, int int2, int int3) {
        System.out.println("\n>>>>> Exercise 7: <<<<<\n");

        System.out.println(Math.max(Math.abs(int1), Math.max(Math.abs(int2), Math.abs(int3))));
    }

    public static void Exercise8(int a, int b, int c) {
        System.out.println("\n>>>>> Exercise 8: <<<<<\n");

        System.out.println("First root = " + (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
        System.out.println("Second root = " + (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));

    }

    public static void Exercise9(int number) {
        System.out.println("\n>>>>> Exercise 9: <<<<<\n");

        System.out.println(Math.abs(number % 10));
    }

    public static void Exercise10(double radius) {
        System.out.println("\n>>>>> Exercise 10: <<<<<\n");

        System.out.println(Math.PI * Math.pow(radius, 2));
    }

    public static void Exercise11(int x1, int y1, int x2, int y2) {
        System.out.println("\n>>>>> Exercise 11: <<<<<\n");

        System.out.println(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }

    public static void Exercise12(double base, int exponent) {
        System.out.println("\n>>>>> Exercise 12: <<<<<\n");

        System.out.println(base * Math.pow(10, exponent));
    }

    public static void Exercise13() {
        System.out.println("\n>>>>> Exercise 13 <<<<<\n");

        System.out.println("Skip Exercise 13");
    }

    public static void Exercise14(double r, double height) {
        System.out.println("\n>>>>> Exercise 14 <<<<<\n");

        System.out.println(2 * Math.PI * r * r + 2 * Math.PI * r * height);
    }

    public static void Exercise15(double r) {
        System.out.println("\n>>>>> Exercise 15 <<<<<\n");

        System.out.println(4 * Math.PI * r * r * r / 3);
    }

    public static void Exercise16(double a, double b, double c) {
        System.out.println("\n>>>>> Exercise 16 <<<<<\n");

        double s = (a + b + c) / 2;
        System.out.println(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }

    public static void Exercise17(String a, int b) {
        System.out.println("\n>>>>> Exercise 17 <<<<<\n");

        if (b == a.length()) {
            System.out.println(a);
        }

        else {
            int l = (b - a.length());
            String s = "";

            for (int i = 0; i < l; i++) {
                s += " ";
            }
            System.out.println(s + a);
        }
    }

    public static void Exercise18(String s) {
        System.out.println("\n>>>>> Exercise 18 <<<<<\n");

        int i;

        for (i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }


    public static void Exercise19(String string) { // assigned Exercise
        System.out.println("\n>>>>> Exercise 19: <<<<<\n");
        int i;

        for (i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }
        System.out.println();
    }

    public static void Exercise20() {
        System.out.println("\n>>>>> Exercise 20 <<<<<\n");

        Scanner s = new Scanner(System.in);
        System.out.print("On what day of the month were you born? ");
        int day = s.nextInt();

        System.out.print("What is the name of the month in which you were born? ");
        String month = s.next();

        System.out.print("During what year were you born? ");
        int year = s.nextInt();

        System.out.print("You were born on " + month + " " + day + ", " + year + ". ");
        System.out.println("You're mighty old!");
    }

    public static void Exercise21() {
        System.out.println("\n>>>>> Exercise 21 <<<<<\n");

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your full name: ");

        String fullname = s.nextLine();
        String[] parts = fullname.split(" ");

        System.out.println("Your name in reverse order is " + parts[1] + ", " + parts[0]);
    }
}
