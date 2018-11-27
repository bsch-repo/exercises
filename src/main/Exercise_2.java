package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_2 {

    static void toBinary() throws InputMismatchException {

        Scanner reader = new Scanner(System.in);
        reader.useRadix(2);

        long a = reader.nextLong();
        long b = reader.nextLong();
        long result = a+b;

        System.out.println(Long.toBinaryString(result));

    }

    public static void main(String[] args) {
        toBinary();
    }
}
