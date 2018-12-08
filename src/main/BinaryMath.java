package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryMath {

    public static void main(String[] args) {
//        System.out.println("Binary addition result: " + Long.toBinaryString(toBinary()));
        BinaryServiceProvider.convertToBinary(20, BinaryServiceProvider.binaryNumberA);
        BinaryServiceProvider.displayBinary(BinaryServiceProvider.binaryNumberA);
    }
}
