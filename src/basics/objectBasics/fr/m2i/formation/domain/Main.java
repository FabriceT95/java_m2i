package basics.objectBasics.fr.m2i.formation.domain;

import basics.objectBasics.fr.m2i.formation.models.Earth;
import basics.objectBasics.fr.m2i.formation.models.Personnage;
import basics.objectBasics.fr.m2i.formation.utils.OpeMath;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /**
         * Exercice :
         *      - Créer un programme où on indique le nombre de personne que vous voulez créer
         *      - Le programme va instancier automatiquement le nombre de personnes prévues (avec des attributs par défauts)
         *      - Affiche le nombre d'instances présents dans le programme
         *          - Ne pas utiliser la valeur de l'incrementation de la boucle
         *          - Utiliser un attribut static de la classe
         */

      /*  // Demande le nombre de personnes que l'on veut
        int nbUsers = askNumber("Combien d'utilisateurs voulez vous créer ?");

        // Personnage[] personnages = createEmptyPersonnagesList(nbUsers);

        // - On créé une liste de type Personnage vide de la taille indiqué par l'utilisateur
        // - On remplit la liste de taille nbUsers avec des objets Personnage
        Personnage[] personnages = populate(createEmptyPersonnagesList(nbUsers));
        System.out.println("Il y a " + Personnage.getId() + " instances de l'objet Personnage dans le programme : ");
        for(int i=0; i < Personnage.getId(); i++) {
            System.out.println(personnages[i]);
        }*/

        /**
         * Exercice : Créer classe utilisataire : OpeMath
         * - Methodes int add() argument prend soit : 2 valeurs, soit un tableau de valeur
         * Dans tous les cas il doit effectuer l'addition de tout ce qui est passé en argument
         */

        int nbValeurs = askNumber("Combien de valeurs voulez-vous additionner ?");
        int result = 0;
        if(nbValeurs == 2) {
            int a = askNumber("Entrez la première valeur.");
            int b = askNumber("Entrez la deuxième valeur.");
            result = OpeMath.add(a,b);

        } else if (nbValeurs > 2) {
            int[] values = new int[nbValeurs];
            for(int i = 0; i < values.length; i++) {
                values[i] = askNumber("Entrez la valeur n°"+(i+1));
            }
            result = OpeMath.add(values);
        } else {
            System.out.println("On a besoin d'au moins de deux nombres pour additionner");
            System.exit(0);
        }

        System.out.println("Le resultat des " + nbValeurs + " à additionner est de "+result);

        /**
         *  Exercice : Créer une classe Personnage
         *  nom
         *  prenom
         *  age
         *  sayHello()
         *  presentation()
         *
         *  Constructor :
         *  - nom, prenom
         *  - nom, prenom, age
         *  - rien
         */

        Personnage humanOne = new Personnage();
        humanOne.sayHello();
        humanOne.presentation();

        Personnage humanTwo = new Personnage("Maxime");
        humanTwo.sayHello();
        humanTwo.presentation();

        Personnage humanThree = new Personnage("Thomas", "Travolta");
        humanThree.sayHello();
        humanThree.presentation();

        Personnage humanFour = new Personnage("Timothé", "Deschamps", 21);
        humanFour.sayHello();
        humanFour.presentation();


        /**
         * Exercice Singleton
         * Une classe qui fournit une seule instance d'objet de son type dans le cycle d'exécution
         *
         *
         */
        Earth earthSingleton = Earth.getInstance(50000000);
        System.out.println(earthSingleton.getNumberOfTrees());


        Earth earthSingleton2 = Earth.getInstance(5);
        System.out.println(earthSingleton2.getNumberOfTrees());








    }

    public static int askNumber (String text) {
        System.out.println(text);
        return sc.nextInt();
    }

    public static Personnage[] createEmptyPersonnagesList(int size) {
        return new Personnage[size];
    }

    public static Personnage[] populate(Personnage[] list) {
        while(Personnage.getId() < list.length) {
            list[Personnage.getId()] = new Personnage("Fabrice", "Doe", 27);
        }
        return list;
    }
}
