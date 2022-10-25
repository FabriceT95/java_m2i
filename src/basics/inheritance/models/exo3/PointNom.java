package basics.inheritance.models.exo3;

public class PointNom extends Point {

    private String nom;

    public PointNom(String nom, int x, int y) {
        super(x, y);
        this.nom = nom;
    }

    public void affCoordNom(){
        this.affCoord();
        System.out.println ("et son nom est " + this.nom) ;

    }
}
