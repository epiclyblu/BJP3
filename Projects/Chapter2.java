// only contains Projects 1, 2, 3, 5

public class Chapter2 {
    public static void main(String[] args) {
        Project1();
        Project2();
        Project3();
        Project5();
    }

    public static void Project1() {
        int i, j, k, l, m;

        System.out.println(">>>>>> Project #1 <<<<<<<");
        for (i = 1; i <= 7; i++) {
            for (j = 1; j <= 7 - i; j++) {
                System.out.print("*");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (k = 1; k <= 14 - (i * 2); k++) {
                System.out.print("/");
            }
            for (l = 1; l <= i * 2 - 2; l++) {
                System.out.print("\\");
            }
            for (l = 1; l <= i; l++) {
                System.out.print(" ");
            }
            for (m = 1; m <= 7 - i; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Project2() {
        System.out.println("\n\n>>>>>> Project #2 <<<<<<<\n");

        PlusLine();
        TopTriangle();
        TopTriangle();
        PlusLine();
        BottomTriangle();
        BottomTriangle();
        PlusLine();
    }

    public static void Project3() {
        int i, j, k;
        System.out.println("\n\n>>>>>> Project #3 <<<<<<<\n");

        System.out.print("+");
        for (i = 1; i <= 9; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println();

        for (i = 1; i <= 4; i++) {
            System.out.print("|");
            for (j = 1; j <= (5 - i); j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (i - 1); j++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (j = 1; j <= (i - 1); j++) {
                System.out.print("\\");
            }
            for (j = 1; j <= (5 - i); j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }

        for (i = 1; i <= 4; i++) {
            System.out.print("|");
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 4 - i; j++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for (j = 1; j <= 4 - i; j++) {
                System.out.print("/");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.print("+");
        for (i = 1; i <= 9; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println();
        for (i = 1; i <= 4; i++) {
            System.out.print("|");
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 4 - i; j++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for (j = 1; j <= 4 - i; j++) {
                System.out.print("/");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
        for (i = 1; i <= 4; i++) {
            System.out.print("|");
            for (j = 1; j <= (5 - i); j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (i - 1); j++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (j = 1; j <= (i - 1); j++) {
                System.out.print("\\");
            }
            for (j = 1; j <= (5 - i); j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public static int change = 5;

    public static void Project5(){
        int i, j, k;
        System.out.println("\n\n>>>>>> Project #5 <<<<<<<\n");

        for (i = 1; i <= change; i++) {
            for (k = 1; k <= 27 - i * 5; k++) {
                System.out.print(" ");
            }
            System.out.print("o  ******");

            for (k = 0; k<= 5 * i - 6; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();

            for (j = 1; j <= 1; j++) {
                for (k = 1; k <= 26 - i * 5; k++) {
                    System.out.print(" ");
                }
                System.out.print("/|\\ *");

                for (k = 1; k<= i * 4 + i; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }

            for (j = 1; j <= 1; j++) {
                for (k = 1; k <= 26 - i * 5; k++) {
                    System.out.print(" ");
                }
                System.out.print("/ \\ *");

                for (k = 1; k <= i * 4 + i; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }

        for (i = 1; i <= 32; i++) {
            System.out.print("*");
        }
    }

    // Methods for Project 2 are below

    public static void PlusLine() {
        int i;

        System.out.print("+");
        for (i = 1; i <= 6; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println();
    }

    public static void TopTriangle() {
        int i, j;

        for (i = 1; i <= 3; i++) {
            System.out.print("|");
            for (j = 1; j <= (3 - i); j++) {
                System.out.print(" ");
            }
            System.out.print("^");
            for (j = 1; j <= (i * 2) - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("^");
            for (j = 1; j <= (3 - i); j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public static void BottomTriangle() {
        int i, j;

        for (i = 1; i <= 3; i++) {
            System.out.print("|");
            for (j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("V");
            for (j = 1; j <= 6 - 2 * i; j++) {
                System.out.print(" ");
            }
            System.out.print("V");
            for (j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}

