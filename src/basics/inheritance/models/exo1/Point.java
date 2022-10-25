package basics.inheritance.models.exo1;

/**
 * On dispose de la classe suivante :
 *
 * class Point
 * { public void initialise (int x, int y) { this.x = x ; this.y = y ; }
 * public void deplace (int dx, int dy) { x += dx ; y += dy ; }
 * public int getX() { return x ; }
 * public int getY() { return y ; }
 * private int x, y ;
 * }
 *
 * Réaliser une classe PointA, dérivée de Point disposant d’une méthode affiche affichant (en
 * fenêtre console) les coordonnées d’un point. Ecrire un petit programme utilisant les deux
 * classes Point et PointA.
 * Que se passerait-il si la classe Point ne disposait pas des méthodes getX et getY ?
 *
 */

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplacer(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void affCoord ()

    { System.out.println ("Coordonnees : " + x + " " + y) ;

    }
}
