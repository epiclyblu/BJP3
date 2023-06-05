public class Chapter4Exercises {
    public static void main(String[] args) {
        System.out.println("Chapter 4 Exercises");

        System.out.println("\n>>>>> Exercise 1: <<<<<\n");
        System.out.println(Exercise1(5));

        System.out.println("\n>>>>> Exercise 2: <<<<<\n");
        System.out.println(Exercise2("hello", 3));

        System.out.println("\n>>>>> Exercise 3: <<<<<\n");
        System.out.println(Exercise3(4, 2));

        System.out.println("\n>>>>> Exercise 4: <<<<<\n");
        System.out.println(Exercise4(2));

        System.out.println("\n>>>>> Exercise 5: <<<<<\n");
        System.out.println(Exercise5(3, 4));

        System.out.println("\n>>>>> Exercise 6: <<<<<\n");
        Exercise6(5, 5);

        System.out.println("\n>>>>> Exercise 7: <<<<<\n");
        Exercise7(4);

        System.out.println("\n\n>>>>> Exercise 8: <<<<<\n");
        Exercise8(5, 11, -2, 3, 4);

        System.out.println("\n\n>>>>> Exercise 9: <<<<<\n");
        Exercise9(2, 9, 18, 4, 5);

        System.out.println("\n\n>>>>> Exercise 10: <<<<<\n");
        Exercise10("Maria", 72, 91, 84, 89, 78);

        System.out.println("\n\n>>>>> Exercise 11: <<<<<\n");
        Exercise11("Roy", "DANE", "sTeFaNiE", "Mariana");

        System.out.println("\n>>>>> Exercise 12: <<<<<\n");
        Exercise12(1, 1, 1);
        Exercise12(3, 3, 2);
        Exercise12(3, 2, 3);
        Exercise12(2, 3, 3);
        Exercise12(3, 4, 5);

        System.out.println("\n>>>>> Exercise 13: <<<<<\n");
        System.out.println(Exercise13(3, 5));

        System.out.println("\n>>>>> Exercise 14: <<<<<\n");
        System.out.println(Exercise14(-4, -2));

        System.out.println("\n>>>>> Exercise 15: <<<<<\n");
        System.out.println(Exercise15(98));

        System.out.println("\n>>>>> Exercise 16: <<<<<\n");
        Exercise16("raceCar");

        System.out.println("\n>>>>> Exercise 17: <<<<<\n");
        System.out.println(Exercise17("hello there"));

        System.out.println("\n>>>>> Exercise 18: <<<<<\n");
        System.out.println(Exercise18(" this   string " + " has  wide spaces   "));

        System.out.println("\n>>>>> Exercise 19: <<<<<\n");
        System.out.println(Exercise19(-36, 5));

        System.out.println("\n>>>>> Exercise 20: <<<<<\n");
        System.out.println(Exercise20(18, 3, 3));

        System.out.println("\n>>>>> Exercise 21: <<<<<\n");
        Exercise21(34);

    }

    public static double Exercise1(int n) {
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static String Exercise2(String a, int b) {
        if (b < 1) {
            return "";
        }

        StringBuilder s = new StringBuilder();

        for (int i = 1; i <= b; i++) {
            s.append(a);
        }
        return s.toString();
    }

    public static String Exercise3(int month, int day) {
        // 12/16 to 3/15: Winter
        // 3/16 to 6/15: Spring
        // 6/16 to 9/15: Summer
        // 9/16 to 12/15: Fall

        if (month < 3 || month == 12 && day >= 16 || month == 3 && day <= 15) {
            return "Winter";
        } else if (month < 6 && month > 3 || month == 6 && day <= 15 || month == 3) {
            return "Spring";
        } else if (month > 6 && month < 9 || month == 6 || month == 9 && day <= 15) {
            return "Summer";
        } else {
            return "Fall";
        }
    }

    public static int Exercise4(int month) {
        // February has 28 days
        // April, June, September, and November have 30 days
        // January, March, May, July, August, October, and December have 31 days

        if (month > 12) {
            return 0;
        }
        if (month == 2) {
            return 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }

    }


    public static int Exercise5(int base, int exp) {
        int num = 1;

        for (int i = 1; i <= exp; i++) {
            num *= base;
        }

        return num;
    }

    public static void Exercise6(int a, int b) {
        if (a > b) {
            for (int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
        } else if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println(a);
        }
    }

    public static void Exercise7(int size) {
        if (size % 2 == 0) {
            for (int i = 1; i <= size / 2; i++) {
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print("o");
                }
                System.out.print("x");
                for (int j = 1; j <= size - i * 2; j++) {
                    System.out.print("o");
                }
                System.out.print("x");
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print("o");
                }
                System.out.println();
            }
            for (int i = 1; i <= size / 2; i++) {
                for (int j = 1; j <= size / 2 - i; j++) {
                    System.out.print("o");
                }
                System.out.print("x");
                for (int j = 1; j <= i * 2 - 2; j++) {
                    System.out.print("o");
                }
                System.out.print("x");
                for (int j = 1; j <= size / 2 - i; j++) {
                    System.out.print("o");
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= Math.floor(size / 2.0); i++) {
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print("o");
                }
                System.out.print("x");
                for (int j = 1; j <= size - i * 2; j++) {
                    System.out.print("o");
                }
                System.out.print("x");
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print("o");
                }
                System.out.println();
            }
            for (int j = 1; j <= Math.floor(size / 2.0); j++) {
                System.out.print("o");
            }
            System.out.print("x");
            for (int j = 1; j<= Math.floor(size / 2.0); j++) {
                System.out.print("o");
            }
            System.out.println();
            for (int i = 1; i <= Math.floor(size / 2.0); i++) {
                for (int j = 1; j <= Math.floor(size / 2.0) - i; j++) {
                    System.out.print("o");
                }
                System.out.print("x");
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("o");
                }
                System.out.print("x");
                for (int j = 1; j<= Math.floor(size / 2.0) -i; j++) {
                    System.out.print("o");
                }
                System.out.println();
            }
        }
    }


    public static void Exercise8(int a, int b, int c, int d, int e) {
        int max = 0, min = 0;

        max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        if (e > max) {
            max = e;
        }

        min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }

        if (e < min) {
            min = e;
        }
        System.out.println("Smallest = " + min + "\nLargest: " + max);
    }

    public static void Exercise9(int a, int b, int c, int d, int e) {
        double sum = 0.0;
        double max = 0.0;

        if (a % 2 == 0) {
            if (a > max) {
                max = a;
            }
            sum += a;
        }
        if (b % 2 == 0) {
            if (b > max) {
                max = b;
            }
            sum += b;
        }
        if (c % 2 == 0) {
            if (c > max) {
                max = c;
            }
            sum += c;
        }
        if (d % 2 == 0) {
            if (d > max) {
                max = d;
            }
            sum += d;
        }
        if (e % 2 == 0) {
            if (e > max) {
                max = e;
            }
            sum += e;
        }

        System.out.println("Even sum = " + sum + ", Even max: " + max);
    }

    public static void Exercise10(String name, int a, int b, int c, int d, int e) {
        double grade = (double) (a + b + c + d + e) / 5;

        System.out.println(name + "'s grade is " + grade);
    }

    public static void Exercise11(String a, String b, String c, String d) {
        String name = "";

        if (a.length() > 0) {
            name = a;
        }
        if (b.length() > name.length()) {
            name = b;
        }
        if (c.length() > name.length()) {
            name = c;
        }
        if (d.length() > name.length()) {
            name = d;
        }

        String name2 = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println(name2 + "'s name is longest");
    }

    public static void Exercise12(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("equilateral");
        } else if (a == b || a == c || b == c) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
    }

    public static double Exercise13(int a, int b) {
        return (double) (a + b) / 2;
    }

    public static double Exercise14(double base, int exp) {
        double num = 1.0;

        if (exp < 0) {
            for (int i = -1; i >= exp; i--) {
                num /= base;
            }
        } else {
            for (int i = 1; i <= exp; i++) {
                num *= base;
            }

        }
        return num;
    }

    public static double Exercise15(int grade) {
        double num = 0.0;

        if (grade > 100 || grade < 0) {
            throw new IllegalArgumentException();
        } else if (grade < 60) {
            num = 0.0;
        } else if (grade <= 62) {
            num = 0.7;
        } else if (grade < 95) {
            num += 0.8 + (grade - 63) * 0.1;
        } else {
            num = 4.0;
        }

        return num;
    }

    public static void Exercise16(String a) {
        String b = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }

        if (a.equals(b)) {
            System.out.println(a + " is a palindrome!");
        } else {
            System.out.println(a + " is not a palindrome");
        }
    }

    public static String Exercise17(String s) {
        String s2 = "";

        for (int i = 0; i < s.length() / 2; i++) {
            s2 += s.charAt(2 * i + 1);
            s2 += s.charAt(2 * i);
        }

        if (s.length() % 2 != 0) {
            s2 += s.charAt(s.length() - 1);
        }

        return s2;
    }

    public static int Exercise18(String s) {
        int words = 0;
        char start = s.charAt(0);

        if (start != ' ') {
            words++;
        }

        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            if (start == ' ' && current != ' ') {
                words++;
            }
            start = current;
        }

        return words;
    }

    public static String Exercise19(double x, double y) {
        if (x > 0.0 && y > 0.0) {
            return "1";
        } else if (x < 0.0 && y > 0.0) {
            return "2";
        } else if (x < 0.0 && y < 0.0) {
            return "3";
        } else if (x > 0.0 && y < 0.0) {
            return "4";
        } else if (x == 0.0 && y == 0.0) {
            return "Origin";
        } else if (x == 0.0) {
            return "X-axis";
        } else if (y == 0.0) {
            return "Y-axis";
        }
        return "0";
    }

    public static int Exercise20(int a, int b, int c) {
        if (a == c && a == b) {
            return 1;
        } else if (a == b || a == c) {
            return 2;
        } else if (a != b && a != c) {
            return 3;
        }
        return 0;
    }

    public static void Exercise21(int max) {
        int sum = 0;
        String k = "";

        for (int i = 1; i <= max; i++) {
            for (int j = 1; j < i; j++)
                if (i % j == 0) {
                    sum += j;
                }
            if (sum == i) {
                k += i + " ";
            }
            sum = 0;
        }

        System.out.println("Perfect numbers up to " + max + ": " + k);
    }
}
