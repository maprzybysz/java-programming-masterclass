package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer min Value = " + myMinIntValue);
        System.out.println("Integer max Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MAX value = " + (myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min Value = " + myMinByteValue);
        System.out.println("Byte min Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min Value = " + myMinShortValue);
        System.out.println("Short max Value = " +myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long  myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min Value = " + myMinLongValue);
        System.out.println("Long max Value = " +myMaxLongValue);
    }
}
