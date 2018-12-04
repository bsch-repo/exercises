package main;

import java.util.ArrayList;

public class BinaryServiceProvider {

    private static ArrayList<Integer> binaryNumber = new ArrayList<>();

    public static void convertToBinary(int unconvertedNumber) {

        int remainder = 0;

        while (!(unconvertedNumber == 0)){
            System.out.println(unconvertedNumber);
            remainder = unconvertedNumber % 2;
            unconvertedNumber /= 2;
            binaryNumber.add(remainder);
        }
    }

    public static void displayBinary() {

        System.out.println(binaryNumber.isEmpty());

        for (int i = binaryNumber.size()-1; i >= 0; i--) {
            System.out.print(binaryNumber.get(i));
        }

    }

}
