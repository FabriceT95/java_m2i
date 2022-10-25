package basics.inheritance.models.exo2;

public class PointNom extends Point {

    private String nom;

    public void setPointNom(String nom, int x, int y) {
        setPoint(x, y);
        this.nom = nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void affCoordNom () {
        this.affCoord();
        System.out.println ("et son nom est " + this.nom) ;
    }
}
