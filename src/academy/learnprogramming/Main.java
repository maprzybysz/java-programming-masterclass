package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer min Value = " + myMinIntValue);
        System.out.println("Integer max Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue +1));
        System.out.println("Busted MAX value = " + (myMinIntValue -1));
    }
}
