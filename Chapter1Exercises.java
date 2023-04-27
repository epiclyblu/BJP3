// basically introduction to Java, file looks really stupid

public class Chapter1Exercises {
    public static void main(String[] args) {
        System.out.println("\u001B[31mChapter 1 Exercises\u001B[0m\n");

        System.out.println("Exercise 1:\n");
        System.out.println("//////////////////////"); // 22 slashes
        System.out.println("|| Victory is mine! ||");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"); // 44 backslashes

        System.out.println("\nExercise 2:\n");
        System.out.println("   \\/");
        System.out.println("  \\\\//");
        System.out.println(" \\\\\\///");
        System.out.println(" ///\\\\\\");
        System.out.println("  //\\\\");
        System.out.println("   /\\");

        // To make the code shorter, I'm using new line escape sequences
        System.out.println("\nExercise 3:\n");
        System.out.println("A well formed Java-program has\na main method with { and }\nbraces.\n");
        System.out.println("A System.out.println statement\nhas { and } and usually a\nString that starts and ends");
        System.out.println("with a \" character.\n(But we type \" instead!)");

        System.out.println("\nExercise 4:\n");
        System.out.println("What is the difference between\na ' and a \"? Or between a \" and a \\\"?\n");
        System.out.println("One is what we see when we're typing our program.");
        System.out.println("The other is what appears on the \"console.\"");

        System.out.println("\nExercise 5:\n");
        System.out.println("A \"quoted\" String is\n'much' better if you learn");
        System.out.println("the rules of \"escape sequences.\"\nAlso, \"\" represents an empty String.");
        System.out.println("Don't forget: use \\\" instead of \" !");
        System.out.println("' ' is not the same as \"");

        System.out.println("\nExercise 6:\n");
        System.out.println("public class Meta {");
        System.out.println("\tpublic static void main(String[] args) {");
        System.out.println("\t\tSystem.out.println(\"Hello, world!\");");
        System.out.println("\t}");
        System.out.println("}");

        System.out.println("\nExercise 7:\n");
        cmd();
        cmd();

        System.out.println("\nExercise 8:\n");
        System.out.println("//////////////////////");
        victory();
        victory();
        victory();
        victory();

        System.out.println("\nExercise 9:\n");
        System.out.println("   -------");
        System.out.println("  /       \\");
        System.out.println(" /         \\");
        System.out.println(" _\"_'_\"_'_\"_");
        System.out.println(" \\         /");
        System.out.println("  \\       /");
        System.out.println("   _______");

        System.out.println("\nExercise 10:\n");
        shape_top();
        shape_bottom();
        System.out.println("\n _\"_'_\"_'_\"_\n");
        shape_top();
        shape_bottom();
        System.out.println("\n _\"_'_\"_'_\"_");
        shape_bottom();
        shape_top();
        System.out.println(" _\"_'_\"_'_\"_");
        shape_bottom();

        System.out.println("\nExercise 11:\n");
        rocket_roof();
        rocket_box();
        rocket_text();
        rocket_box();
        rocket_roof();

        System.out.println("\nExercise 12:\n");
        song1();
        song2();
        song2();
        song1();

        System.out.println("\nExercise 13:\n");
        row_5();
        row_pattern();
        System.out.println("\n");
        row_5();
        row_pattern();
        row_5();
        System.out.println("\n");
        row_1();
        row_5();
        row_pattern();

        System.out.println("\nExercise 14:\n");
        lantern_structure();
        lantern_structure2();

        System.out.println("\nExercise 15:\n");
        shape_top();
        shape_bottom();
        shape_bottom();
        System.out.println("  +-------+\n");
        shape_top();
        System.out.println(" |   STOP  |");
        shape_bottom();
        System.out.println();
        shape_top();
        System.out.println(" +---------+\n");

        System.out.println("\nExercise 16:\n");
        for (int i=0; i<1000; i++) {
            System.out.println("All work and no play makes Jack a dull boy.");
        }
    }

    public static void cmd() {
        System.out.println("There's one thing every coder must understand:\nThe System.out.println command.\n");
    }

    public static void victory() {
        System.out.println("|| Victory is mine! ||");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    public static void shape_top() {
        System.out.println("   -------");
        System.out.println("  /       \\");
        System.out.println(" /         \\");
    }

    public static void shape_bottom() {
        System.out.println(" \\         /");
        System.out.println("  \\       /");
        System.out.println("   _______");
    }

    public static void rocket_roof() {
        System.out.println("   /\\          /\\ ");
        System.out.println("  /  \\        /  \\");
        System.out.println(" /    \\      /    \\");
    }

    public static void rocket_box() {
        System.out.println("+------+    +------+");
        System.out.println("|      |    |      |");
        System.out.println("|      |    |      |");
        System.out.println("+------+    +------+");
    }

    public static void rocket_text() {
        System.out.println("|United|    |United|");
        System.out.println("|States|    |States|");
    }

    public static void song1() {
        System.out.println("Go, team, go!\nYou can do it.\n");
    }

    public static void song2() {
        System.out.println("Go, team, go!\nYou can do it.");
        System.out.println("You're the best,\nIn the West.");
        song1();
    }

    public static void row_1() {
        System.out.println("  *\n  *\n  *");
    }

    public static void row_5() {
        System.out.println("*****\n*****");
    }

    public static void row_pattern() {
        System.out.println(" * *");
        System.out.println("  * ");
        System.out.println(" * *");
    }

    public static void lantern_pyramid() {
        System.out.println("    *****");
        System.out.println("  *********");
        System.out.println("*************");
    }

    public static void lantern_line() {
        System.out.println("*************");
    }

    public static void lantern_cage() {
        System.out.println("* | | | | | *");
    }

    public static void lantern_structure() {
        lantern_pyramid();
        System.out.println();
        lantern_pyramid();
        lantern_cage();
        lantern_line();
        lantern_pyramid();
        System.out.println();
    }

    public static void lantern_structure2() {
        lantern_pyramid();
        System.out.println("    *****");
        lantern_cage();
        lantern_cage();
        System.out.println("    *****\n    *****");
    }

}
