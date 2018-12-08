package main;

import java.util.ArrayList;

public class BinaryServiceProvider {

    public static ArrayList<Integer> binaryNumberA = new ArrayList<>();
    public static ArrayList<Integer> binaryNumberB = new ArrayList<>();

    public static void convertToBinary(int unconvertedNumber, ArrayList<Integer> targetBinary) {

        int remainder = 0;
        System.out.println("Converted number: " + unconvertedNumber);

        while (!(unconvertedNumber == 0)){
            remainder = unconvertedNumber % 2;
            unconvertedNumber /= 2;
            targetBinary.add(remainder);
        }
    }

    public static void displayBinary(ArrayList<Integer> targetBinary) {

//      System.out.println(binaryNumberA.isEmpty());

        System.out.print("Conversion result: ");

        for (int i = targetBinary.size()-1; i >= 0; i--) {
            System.out.print(targetBinary.get(i));
        }

    }

}
