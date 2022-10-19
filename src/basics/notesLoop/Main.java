package basics.notesLoop;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Combien avez vous d'élèves ?");
        int nbEleves = sc.nextInt();
        System.out.println("Combien y a t-il de matières ?");
        int nbMatieres = sc.nextInt();
        float[][] moyennes = new float[nbEleves][nbMatieres];
        float[] moyenneGenerale = new float[nbEleves];
        for (int i = 0; i < nbEleves; i++) {
            System.out.println("Elèves n°" + (i + 1) + " :");
            float tempMoyenneParMatiere = 0;
            for (int j = 0; j < nbMatieres; j++) {
                System.out.println("Combien de notes pour cette matière ?");
                int nbNotes = sc.nextInt();
                float tempCumulNote = 0;
                for (int k = 0; k < nbNotes; k++) {
                    System.out.println("Quelle est la note n°" + (k + 1) + " ?");
                    float note = sc.nextFloat();
                    tempCumulNote += note;
                }
                moyennes[i][j] = tempCumulNote / nbNotes;
                tempMoyenneParMatiere += moyennes[i][j];

            }
            moyenneGenerale[i] = tempMoyenneParMatiere / nbMatieres;
        }

        for (int i = 0; i < nbEleves; i++) {
            for (int j = 0; j < nbMatieres; j++) {
                System.out.println("La moyenne de matière " + (j + 1) + " de l'élève n°" + (i + 1) + " : " + moyennes[i][j]);
            }
            System.out.println("La moyenne générale de l'élève n°" + (i + 1) + " : " + moyenneGenerale[i] + "\n");

        }
    }
}
