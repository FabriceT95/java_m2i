package basics.perfectGame;
import java.util.Scanner;

/*
*  Demande au joueur la dimension de la grille
*  Demande au joueur combien de bombes on veut
*
* Le programme va mettre autant de bombes demandé sur la grille à des positions aléatoires (pas deux bombes au même endroit);
*
* On invite au joueur à choisir des cases et on lui indique si il a trouvé une bombe ou non.
*
* La fin du jeu est quand le joueur a trouvé toutes les bombes
*
* */

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Combien de lignes ?");
        int x = sc.nextInt();
        System.out.println("Combien de colonnes ?");
        int y = sc.nextInt();


        boolean[][] map = new boolean[x][y];
        boolean[][] positionTrouve = new boolean[x][y];

        for(int i =0; i < x; i++) {
            for(int j =0; j < y; j++) {
                map[i][j] = false;
            }
        }

        System.out.println("Combien de bombes voulez vous placer ?");
        int nbBombes = sc.nextInt();
        int tempNbBombes = nbBombes;

        do {
            int posX = (int) (Math.random() * x) ;
            int posY = (int) (Math.random() * y) ;
            if(!map[posX][posY]) {
                map[posX][posY] = true;

                tempNbBombes--;
            }
        } while (tempNbBombes > 0);

        int nbBombesTrouve = 0;

        while (nbBombesTrouve < nbBombes) {

            printMap(x, y, positionTrouve);
           System.out.println("Sur quelle position vous voulez vérifier ?");
           System.out.println("\tPosition X ?");
           int xAsked = sc.nextInt();
           System.out.println("\tPosition Y ?");
           int yAsked = sc.nextInt();

           if(map[xAsked][yAsked]) {
               nbBombesTrouve++;
               System.out.println("Trouvé !! Tu as trouvé la bombe n°"+nbBombesTrouve);
               System.out.println("Il reste "+(nbBombes-nbBombesTrouve)+" bombes");
               map[xAsked][yAsked] = false;
               positionTrouve[xAsked][yAsked] = true;
           } else {
               System.out.println("Raté !");
           }



        }

        System.out.println("Bravo ! vous avez trouvé les "+nbBombesTrouve + "bombes !");
        printMap(x, y, positionTrouve);

    }

    public static void printMap(int x, int y, boolean[][] positionTrouve) {
        for(int i =0; i < x; i++) {
            for(int j =0; j < y; j++) {
                if(positionTrouve[i][j])
                    System.out.print("x");
                else
                    System.out.print("o");
            }
            System.out.println();
        }
    }
}
