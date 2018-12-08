package main;

import java.util.ArrayList;
import java.util.Iterator;

public class Binary {

    public static ArrayList<Integer> binaryNumberA = new ArrayList<>();
    public static ArrayList<Integer> binaryNumberB = new ArrayList<>();
    public static ArrayList<Integer> resultBinary = new ArrayList<>();
    public static Iterator iterator = resultBinary.iterator();

    public static void convertToBinary(int unconvertedNumber, ArrayList<Integer> targetBinary) {

        int remainder = 0;
        System.out.println("\n\nConverted number: " + unconvertedNumber);

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

    public static void addBinary(ArrayList<Integer> BinaryA, ArrayList<Integer> BinaryB) {
        boolean carry = false;

        // check which binary number is smaller and fill smaller with 0
        if (BinaryA.size() > BinaryB.size()) {
            for (int i = (BinaryA.size() - (BinaryA.size()- BinaryB.size())); i < BinaryA.size(); i++) {
                BinaryB.add(i, 0);
            }
        } else {
            for (int i = (BinaryB.size() - (BinaryB.size()- BinaryA.size())); i < BinaryB.size(); i++) {
                BinaryA.add(i, 0);
            }
        }



        for (int i = 0; i < BinaryA.size(); i++) {

            switch (BinaryA.get(i) + BinaryB.get(i)) {
                case 0:
                    resultBinary.add(i, carry ? 1 : 0);
                    break;
                case 1:
                    resultBinary.add(i, carry ? 1 : 1);
                    break;
                case 2:
                    resultBinary.add(i, carry ? 1 : 0);
                    carry = true;
                    break;
            }
        }

        displayBinary(resultBinary);
    }
}

//if (BinaryA.get(i) > BinaryB.get(i)) {
//        resultBinary.add(BinaryA.get(i));
//        }