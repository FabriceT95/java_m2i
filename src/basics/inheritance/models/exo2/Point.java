package basics.inheritance.models.exo2;

/*
On dispose de la classe suivante :

class Point

{ public void setPoint (int x, int y) { this.x = x ; this.y = y ; }

public void deplace (int dx, int dy) { x += dx ; y += dy ; }

public void affCoord ()

{ System.out.println ("Coordonnees : " + x + " " + y) ;

}

private int x, y ;

}

Réaliser une classe PointNom, dérivée de Point permettant de manipuler des points définis
par deux coordonnées (int) et un nom (caractère). On y prévoira les méthodes suivantes :
• setPointNom pour définir les coordonnées et le nom d’un objet de type PointNom,
• setNom pour définir seulement le nom d’un tel objet,
• affCoordNom pour afficher les coordonnées et le nom d’un objet de type PointNom.
Écrire un petit programme utilisant la classe PointNom.
 */


public class Point {

    private int x, y ;
    public void setPoint (int x, int y) { this.x = x ; this.y = y ; }

    public void deplace (int dx, int dy) { x += dx ; y += dy ; }

    public void affCoord ()
    { 
        System.out.println ("Coordonnees : " + x + " " + y) ;
    }







} 
