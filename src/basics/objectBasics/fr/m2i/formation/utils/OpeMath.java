package basics.objectBasics.fr.m2i.formation.utils;

public class OpeMath {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int... args) {
        int sum = 0;
        for (int number: args) {
            sum += number;
        }
        return sum;
    }
}
