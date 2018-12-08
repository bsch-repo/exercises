package main;

public class BinaryMath {

    public static void main(String[] args) {
//        System.out.println("Binary addition result: " + Long.toBinaryString(toBinary()));
        Binary.convertToBinary(1, Binary.binaryNumberA);
        Binary.displayBinary(Binary.binaryNumberA);
        Binary.convertToBinary(3, Binary.binaryNumberB);
        Binary.displayBinary(Binary.binaryNumberB);

        System.out.println("\n\nBinary addition result: ");
        Binary.addBinary(Binary.binaryNumberA, Binary.binaryNumberB);

        System.out.println("\n\nFirst converted number: ");
        Binary.displayBinary(Binary.binaryNumberA);
    }
}
