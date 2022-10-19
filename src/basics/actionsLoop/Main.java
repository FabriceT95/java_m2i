package basics.actionsLoop;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        printMenu();
        while(!quit) {
            System.out.println("Sélectionnez l'action à faire");
            choice = sc.nextInt();

            switch (choice) {
                case 0 -> doAdd();
                case 1 -> doSubstract();
                case 2 -> doMultiply();
                case 3 -> tellParity();
                case 4 -> doFactoriel();
                case 5 -> printMenu();
                case 6 -> quit = true;
                default -> System.out.println("Cette valeur n'est pas valide");
            }
        }

        sc.close();
    }

    public static void printMenu() {
        System.out.println("Press");
        System.out.println("\t 0 - Faire une addition");
        System.out.println("\t 1 - Faire une soustraction");
        System.out.println("\t 2 - Faire une multiplication");
        System.out.println("\t 3 - Pair ou impair ?");
        System.out.println("\t 4 - Faire la factorielle d'un nombre");
        System.out.println("\t 5 - Afficher le menu");
        System.out.println("\t 6 - Quitter le programme");

    }

    public static void doAdd() {
        System.out.println("Tapez le premier nombre");
        int a = sc.nextInt();
        System.out.println("Tapez le deuxieme nombre");
        int b = sc.nextInt();

        int res = a + b;

        System.out.println("Le résultat de l'addition est " + res);
    }

    public static void doSubstract() {
        System.out.println("Tapez le premier nombre");
        int a = sc.nextInt();
        System.out.println("Tapez le deuxieme nombre");
        int b = sc.nextInt();

        int res = a - b;

        System.out.println("Le résultat de la soustraction est " + res);
    }

    public static void doMultiply() {
        System.out.println("Tapez le premier nombre");
        int a = sc.nextInt();
        System.out.println("Tapez le deuxieme nombre");
        int b = sc.nextInt();

        int res = a * b;

        System.out.println("Le résultat de la multiplication est " + res);
    }

    public static void tellParity() {
        System.out.println("Tapez votre nombre à tester");
        int a = sc.nextInt();

        String res = a % 2 == 0 ? "pair" : "impair";

        System.out.println("Le nombre "+ a +" est " + res);
    }

    public static void doFactoriel() {
        System.out.println("Tapez votre nombre à factorialiser");
        int a = sc.nextInt();
        int res = factoriel(a);
        System.out.println("La factoriel de votre nombre est " + res);
    }

    public static int factoriel(int n) {
        if(n == 0) return 1;
        return n * factoriel(n-1);
    }
}
