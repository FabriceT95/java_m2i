package basics.inheritance.models.exo4;


/*
On dispose de la classe suivante :

class Point

{ public Point (int x, int y) { this.x = x ; this.y = y ; }

public void affiche()

{ System.out.println ("Coordonnees : " + x + " " + y) ;

}

private int x, y ;

}

Réaliser une classe PointNom, dérivée de Point permettant de manipuler des points définis
par leurs coordonnées et un nom (caractère). On y prévoira les méthodes suivantes :
• constructeur pour définir les coordonnées et le nom d’un objet de type PointNom,
• affiche pour afficher les coordonnées et le nom d’un objet de type PointNom.
 */

public class Point {
    public Point (int x, int y) {
        this.x = x ; this.y = y ;
    }

    public void affiche() { System.out.println ("Coordonnees : " + x + " " + y) ;

    }
    private int x, y ;
}
