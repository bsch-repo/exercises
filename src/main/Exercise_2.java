package main;

public class Exercise_2 {

    static int x = 1;
    static int y = 2;
    static int buffer_1 = 0;
    static int buffer_2 = 0;

    static void printVariables(String type) {
        switch (type) {
            case "unswapped":
                System.out.println("Unswapped variables: " + x + " " + y);
                break;
            case "swapped":
                System.out.println("Swapped variables: " + x + " " + y);
                break;
        }

    }

    static void swapVariables() {
        buffer_1 = y;
        buffer_2 = x;
        x = buffer_1;
        y = buffer_2;
    }

    public static void main(String[] args) {
        printVariables("unswapped");
        swapVariables();
        printVariables("swapped");
    }
}
