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

    // On instancie le Scanner globalement.
    public static Scanner sc = new Scanner(System.in);
    public static int nbBombesTrouve = 0;
    public static int nbBombes = 0;

    public static void main(String[] args) {
        bombGame();
    }

    /**
     * Démarre le jeu
     */
    public static void bombGame() {
        // On demande le nombre de ligne et de colonnes à l'utilisateur
        int x = scanningInt("Combien de lignes ?");
        int y = scanningInt("Combien de colonnes ?");

        /**
         * On crée deux maps du jeu de dimension x lignes et y colonnes :
         *      - l'une où on y met les bombes
         *      - l'autre où on y met les positions trouvées avec une bombe dedans
         */

        // boolean[][] map = createMap(x,y);
        // Créer la map des positions trouvées
        boolean[][] positionTrouve = createMap(x,y);

        // Créer la map de jeu + Positionnement des bombes sur la map
        boolean[][] map = setupBombes(x, y, createMap(x,y));

        // En train de jouer le jeu
        coreGame(map, positionTrouve);

        // Affiche la map de fin avec les positions des bombes
        printMap(positionTrouve);

        sc.close();
    }

    /**
     * Gère le contenu du jeu
     * @param map map du jeu [x][y]
     * @param positionTrouve map du jeu des positions des bombes
     */
    public static void coreGame(boolean[][] map, boolean[][] positionTrouve) {

        /**
         * On veut maintenant chercher les bombes
         * Tant que l'utilisateur n'a pas trouvé toutes les bombes, on continue.
         * On affiche la map avec les cases non vérifiées et les bombes trouvées
         * L'utilisateur tape la position qu'il veut vérifier.
         * Si il trouve, la position de la map est clear
         * Et on ajoute "true" dans le tableau positionTrouve pour sauvegarder la position trouvée
         * Et empecher l'utilisateur de trouver plusieurs fois la même bombe
         */
        while (getNbBombesTrouve() < getNbBombes()) {

            printMap(positionTrouve);
            System.out.println("Sur quelle position vous voulez vérifier ?");
            int xAsked = scanningInt("\tPosition X ?");
            int yAsked = scanningInt("\tPosition Y ?");

            if(!validInput(xAsked, yAsked, map.length, map[0].length)) {
                continue;
            }

            if(map[xAsked][yAsked]) {
                setNbBombesTrouve(getNbBombesTrouve()+1);
                System.out.println("Trouvé !! Tu as trouvé la bombe n°"+getNbBombesTrouve());
                System.out.println("Il reste "+(getNbBombes()-getNbBombesTrouve())+" bombes");
                map[xAsked][yAsked] = false;
                positionTrouve[xAsked][yAsked] = true;
            } else {
                System.out.println("Raté !");
            }

        }

        System.out.println("Bravo ! vous avez trouvé les "+getNbBombesTrouve() + "bombes !");
    }

    /**
     * Positionne les bombes sur la map
     * @param x nombre de lignes
     * @param y nombre de colonnes
     * @param map map surlaquelle on ajoute les bombes dans la fonction
     * @return la map avec les bombes
     */
    public static boolean[][] setupBombes(int x, int y, boolean[][] map) {
        setNbBombes(scanningInt("Combien de bombes voulez vous placer ?"));

        int tempNbBombes = getNbBombes();

        /**
         * On place les bombes dans la map tant qu'on a des bombes à poser
         * Si une position est déjà prise, on en cherche une nouvelle
         */
        do {
            int posX = randomValue(x) ;
            int posY = randomValue(y) ;
            if(!map[posX][posY]) {
                map[posX][posY] = true;
                tempNbBombes--;
            }
        } while (tempNbBombes > 0);

        return map;
    }


    /**
     *
     * @param text Text à afficher avant de demander l'input
     * @return int
     */
    public static int scanningInt(String text) {
        System.out.println(text);
        return sc.nextInt();
    }


    /**
     * Créer un tableau de taille [x][y] type boolean
     * @param x nombre de lignes
     * @param y nombre de colonnes
     * @return une map[x][y] type boolean
     */
    public static boolean[][] createMap(int x, int y) {
        return new boolean[x][y];
    }

    /**
     * Créer un entier aléatoire entre 0 et x
     * @param x e
     * @return int
     */
    public static int randomValue(int x) {
        return (int) (Math.random() * x);
    }

    /**
     * Setter du nombre de bombes à trouver
     * @param x nombre bombes à trouver
     */
    public static void setNbBombesTrouve(int x) {
        nbBombesTrouve = x;
    }

    public static int getNbBombesTrouve() {
        return nbBombesTrouve;
    }

    /**
     * Setter du nombre de bombes
     * @param x nombre bombes
     */
    public static void setNbBombes(int x) {
        nbBombes = x;
    }

    public static int getNbBombes() {
        return nbBombes;
    }

    public static boolean validInput(int xAsked, int yAsked, int x, int y) {
        return xAsked <= x || yAsked <= y;
    }

    /**
     * Affiche la map du jeu
     *
     * 3x3
     * ooo
     * ooo
     * ooo
     *
     * 3x3 dont 1 trouvé
     *
     * ooo
     * oox
     * ooo
     *
     * @param positionTrouve tableau des positions trouvées
     */
    public static void printMap(boolean[][] positionTrouve) {
        for(int i =0; i < positionTrouve.length; i++) {
            for(int j =0; j < positionTrouve[i].length; j++) {
                if(positionTrouve[i][j])
                    System.out.print("x");
                else
                    System.out.print("o");
            }
            System.out.println();
        }
    }
}
