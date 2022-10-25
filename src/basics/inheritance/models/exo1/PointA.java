package basics.inheritance.models.exo1;

// Si il n'y avait pas de getters dans la classe "Point", nous n'aurions pas pu récupérer ses coordonnées dans la classe "PointA" car x et y sont privées donc accessible
// uniquement dans la classe "Point"

public class PointA extends Point {

    public PointA(int x, int y) {
        super(x, y);
    }

    @Override
    public void affCoord () {
        System.out.println("x : " + this.getX() + ", y : " + this.getY());
    }
}
