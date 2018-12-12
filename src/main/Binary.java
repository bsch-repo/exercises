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

    public static int getBiggerBinary(ArrayList<Integer> BinaryA, ArrayList<Integer> BinaryB) {
        int biggerBinary = 0;

        // check which binary number is smaller and fill smaller with 0
        if (BinaryA.size() > BinaryB.size()) {
            biggerBinary = BinaryA.size();
            for (int i = (BinaryA.size() - (BinaryA.size()- BinaryB.size())); i < BinaryA.size(); i++) {
                BinaryB.add(i, 0);
            }
        } else {
            biggerBinary = BinaryB.size();
            for (int i = (BinaryB.size() - (BinaryB.size()- BinaryA.size())); i < BinaryB.size(); i++) {
                BinaryA.add(i, 0);
            }
        }

        return biggerBinary;
    }

    public static void addBinary(ArrayList<Integer> BinaryA, ArrayList<Integer> BinaryB, ArrayList<Integer> targetBinary) {
        boolean carryFlag = false;

        for (int i = 0; i < Binary.getBiggerBinary(BinaryA, BinaryB); i++) {

            switch (BinaryA.get(i) + BinaryB.get(i)) {
                case 0:
                    targetBinary.add(carryFlag ? 1 : 0);
                    carryFlag = false;
                    break;
                case 1:
                    targetBinary.add(carryFlag ? 0 : 1);
                    break;
                case 2:
                    targetBinary.add(carryFlag ? 1 : 0);
                    carryFlag = true;
                    break;
            }

            if (i == BinaryA.size()-1 && carryFlag) {
                targetBinary.add(1);
            }
        }

        displayBinary(resultBinary);
    }

    public static void multiplybinary(ArrayList<Integer> multipliedBinary, ArrayList<Integer> multiplier, ArrayList<Integer> targetBinary) {
        ArrayList<Integer> interSum = new ArrayList<>();

        for (int i = 0; i < Binary.getBiggerBinary(multipliedBinary, multiplier); i++) {

            for (int j = 0; j < multiplier.size(); j++) {
                switch (multipliedBinary.get(i) * multiplier.get(i)) {
                    case 0:
                        interSum.add(0);
                        break;
                    case 1:
                        interSum.add(1);
                        break;
                }
            }

        }

        displayBinary(resultBinary);
    }

}
