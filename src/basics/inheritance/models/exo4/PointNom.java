package basics.inheritance.models.exo4;

public class PointNom extends Point {

    private String nom;

    public PointNom(String nom, int x, int y) {
        super(x, y);
        this.nom = nom;
    }
    @Override
    public void affiche() {
        super.affiche();
        System.out.println ("et son nom est : " + this.nom) ;

    }
}
