package basics.inheritance.domain;

import basics.inheritance.models.exo2.PointNom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exo 2 : ");
        // Exo 2
        PointNom pn1 = new PointNom();
        pn1.setPointNom("A", 0,1);
        pn1.affCoordNom();
        pn1.setNom("B");
        pn1.affCoordNom();

        System.out.println("\nExo 3 : ");
        // Exo 3
        basics.inheritance.models.exo3.PointNom pn2 = new basics.inheritance.models.exo3.PointNom("C", 2,3);
        pn2.affCoordNom();

        System.out.println("\nExo 4 : ");
        // Exo 4
        basics.inheritance.models.exo4.PointNom pn3 = new basics.inheritance.models.exo4.PointNom("D", 3, 4);
        pn3.affiche();
    }
}
