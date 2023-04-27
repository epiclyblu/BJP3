public class Chapter2 {

    public static void main(String[] args) {
        System.out.println("Chapter 2 Exercises");

        System.out.println("\nExercise 1\n");
        Exercise1();

        System.out.println("\nExercise 2:\n");
        Exercise2();

        System.out.println("\n\nExercise 3:\n");
        Exercise3();

        System.out.println("\n\nExercise 4:\n");
        Exercise4();

        System.out.println("\n\nExercise 5:\n");
        Exercise5();

        System.out.println("\n\nExercise 6:\n");
        Exercise6();

        System.out.println("\n\nExercise 7:\n");
        Exercise7();

        System.out.println("\n\nExercise 8:\n");
        Exercise8();

        System.out.println("\n\nExercise 9:\n");
        Exercise9();

        System.out.println("\n\nExercise 10:\n");
        Exercise10();

        System.out.println("\n\nExercise 11:\n");
        Exercise11();

        System.out.println("\n\nExercise 12:\n");
        Exercise12();

        System.out.println("\n\nExercise 13:\n");
        Exercise13();

        System.out.println("\n\nExercise 14:\n");
        Exercise14();

        System.out.println("\n\nExercise 15:\n");
        Exercise15();

        System.out.println("\n\nExercise 16:\n");
        Exercise16();

        System.out.println("\n\nExercise 17:\n");
        Exercise17();

        System.out.println("\n\nExercise 19:\n");
        Exercise19();

        System.out.println("\n\nExercise 20:\n");
        Exercise20();

        System.out.println("\n\nExercise 21:\n");
        Exercise21();

        System.out.println("\n\nExercise 22:\n");
        Exercise22();

        System.out.println("\n\nExercise 23:\n");
        Exercise23();

    }

    public static void Exercise1() {
        double s0 = 12.0;
        double v0 = 3.5;
        double a = 9.8;
        double t = 10;

        double s = s0 + (v0 * t) + 0.5 * a * t * t;
        System.out.println(s);
    }

    public static void Exercise2() {
        int i;

        for (i = 1; i <= 10; i++) {
            System.out.print(i * i + " ");
        }
    }

    public static void Exercise3() {
        int a = 0;
        int b = 1;
        int c;
        int i;

        System.out.print(1 + " ");

        for (i = 1; i <= 11; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void Exercise4() {
        int i;

        for (i = 0; i <= 3; i++) {
            System.out.println("*****");
        }
    }

    public static void Exercise5() {
        int i, j;

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Exercise6() {
        int i, j;

        for (i = 1; i <= 7; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void Exercise7() {
        int i, j;

        for (i = 1; i <= 5; i++) {
            for (j = i; j <= 4; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }

    public static void Exercise8() {
        int i, j, k;

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void Exercise9() {
        int i, j;

        for (i = 1; i <= 40; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (i = 1; i <= 10; i++) {
            System.out.print("_-^-");
        }
        System.out.println();

        for (i = 0; i < 2; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.print(j % 10);
                System.out.print(j % 10);
            }
        }
        System.out.println();

        for (i = 1; i <= 40; i++) {
            System.out.print("-");
        }
    }

    public static void Exercise10() {
        int i, j;

        for (i = 1; i <= 6; i++) {
            for (j = 1; j <= 9; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();

        for (i = 1; i <= 6; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.print(j % 10);
            }
        }
    }

    public static final int repetitions = 6;
    public static final int range = 10;

    public static void Exercise11() {
        int i, j, k;

        for (i = 1; i <= repetitions; i++) {
            for (j = 1; j < range; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for (k = 1; k <= (range * repetitions); k++) {
            System.out.print(k % range);
        }
    }

    public static void Exercise12() {
        int i, j, k;

        for (i = 1; i <= 3; i++) {
            for (j = 0; j <= 9; j++) {
                for (k = 1; k <= 3; k++) {
                    System.out.print(j % 10);
                }
            }
            System.out.println();
        }
    }

    public static void Exercise13() {
        int i, j, k;

        for (i = 1; i <= 5; i++) {
            for (j = 9; j >= 0; j--) {
                for (k = 1; k <= 5; k++) {
                    System.out.print(j % 10);
                }
            }
            System.out.println();
        }
    }

    public static void Exercise14() {
        int i, j, k;

        for (i = 1; i <= 4; i++) {
            for (j = 9; j >= 1; j--) {
                for (k = j - 1; k >= 0; k--) {
                    System.out.print(j % 10);
                }
            }
            System.out.println();
        }
    }

    public static void Exercise15() {
        int i, j;

        for (i = 1; i <= 9; i += 2) {
            for (j = 0; j < (11 - i) / 2; j++)
                System.out.print("-");

            for (j = 0; j < i; j++)
                System.out.print(i);

            for (j = 0; j < (11 - i) / 2; j++)
                System.out.print("-");

            System.out.println();
        }
    }

    public static void Exercise16() {
        int i, j;

        for (i = 1; i <= 6; i++) {
            for (j = 0; j <= 2 * i - 3; j++) {
                System.out.print("\\");
            }
            for (j = 1; j <= 11 - (i * 2 - 2); j++) {
                System.out.print("!");
            }
            for (j = 1; j <= 11 - (i * 2 - 2); j++) {
                System.out.print("!");
            }
            for (j = 0; j <= 2 * i - 3; j++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }

    public static final int height = 4;

    public static void Exercise17() {
        int i, j;

        for (i = 1; i <= height; i++) {
            for (j = 0; j <= 2 * i - 3; j++) {
                System.out.print("\\");
            }
            for (j = 1; j <= 2 * height - 2 * i + 1; j++) {
                System.out.print("!");
            }
            for (j = 1; j <= 2 * height - 2 * i + 1; j++) {
                System.out.print("!");
            }
            for (j = 0; j <= 2 * i - 3; j++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }

    public static final int R = 5;
    public static void Exercise19() {
        int i, j, k;

        System.out.print("+");

        for (i = 1; i <= 2; i++) {
            for (j = 1; j <= R; j++)
                System.out.print("=");
            System.out.print("+");
        }
        System.out.println();

        for (k = 1; k <= R; k++) {
            for (i = 1; i <= 3; i++) {
                System.out.print("|");
                for(j = 1; j <= R; j++)
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.print("+");
        for (i = 1; i <= 2; i++) {
            for (j = 1; j <= R; j++)
                System.out.print("=");
            System.out.print("+");
        }
        System.out.println();

        for (k = 1; k <= R; k++) {
            for (i = 1; i <= 3; i++) {
                System.out.print("|");
                for (j = 1; j <= R; j++)
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.print("+");
        for (i = 1; i <= 2; i++) {
            for (j = 1; j <= R; j++)
                System.out.print("=");
            System.out.print("+");
        }
    }

    public static void Exercise20() {
        int i, j;

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= (5 - i); j++) {
                System.out.print("////");
            }
            for (j = 1; j <= i - 1; j++) {
                System.out.print("********");
            }
            for (j = 1; j <= 5 - i; j++) {
                System.out.print("\\\\\\\\");
            }
            System.out.println();
        }
    }

    public static final int height_s = 5;

    public static void Exercise21() {
        int i, j;

        for (i = 1; i <= height_s; i++) {
            for (j = 1; j <= (5 - i); j++) {
                System.out.print("////");
            }
            for (j = 1; j <= i - 1; j++) {
                System.out.print("********");
            }
            for (j = 1; j <= 5 - i; j++) {
                System.out.print("\\\\\\\\");
            }
            System.out.println();
        }

    }

    public static void Exercise22() {
        int i, j;

        for (i = 1; i <= 7; i++) {
            for (j = 1; j <= 2 * i - 2; j++) {
                System.out.print("*");
            }
            for (j = 1; j <= 8 - i; j++) {
                System.out.print("$");
            }
            for (j = 1; j <= -2 * i + 16; j++) {
                System.out.print("*");
            }
            for (j = 1; j <= 8 - i; j++) {
                System.out.print("$");
            }
            for (j = 1; j <= 2 * i - 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static final int height_$ = 10;

    public static void Exercise23() {
        int i, j;

        for (i = 1; i <= height_$; i++) {
            for (j = 1; j <= 2 * i - 2; j++) {
                System.out.print("*");
            }
            for (j = 1; j <= height_$ - i + 1; j++) {
                System.out.print("$");
            }
            for (j = 1; j <= -2 * i + (height_$ * 2 + 2); j++) {
                System.out.print("*");
            }
            for (j = 1; j <= height_$ - i + 1; j++) {
                System.out.print("$");
            }
            for (j = 1; j <= 2 * i - 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
