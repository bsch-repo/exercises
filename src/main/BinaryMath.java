package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryMath {

    static long a = 0;
    static long b = 0;
    static long result = 0;

    static long toBinary() {

        boolean correctInput = false;

        while (!correctInput) {
            Scanner reader = new Scanner(System.in);
            reader.useRadix(2);

            try {
                a = reader.nextLong();
                b = reader.nextLong();
                correctInput = true;
            } catch (InputMismatchException e) {

                System.out.println("Incorrect input format. Use binary system.");

                correctInput = false;
            }
        }

        return result = a + b;
    }

    public static void main(String[] args) {
//        System.out.println("Binary addition result: " + Long.toBinaryString(toBinary()));
        BinaryServiceProvider.convertToBinary(20);
        BinaryServiceProvider.displayBinary();
    }
}
