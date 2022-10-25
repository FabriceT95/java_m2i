package basics.inheritance.models.exo5;

public class Main {
    public static void main(String[] args) {
        // System.out.println ("Entree Constr A - n=" + 0 + " p=" + 10) ;
        // System.out.println ("Sortie Constr A - n=" + 5 + " p=" + 10) ;
        A a = new A(5) ;


        // System.out.println ("Entree Constr A - n=" + 0 + " p=" + 10) ;
        // System.out.println ("Sortie Constr A - n=" + 5 + " p=" + 10) ;
        // System.out.println("Entree Constr B - n=" + 5 + " p=" + 10 + " q=" + 25);
        // System.out.println("Entree Constr B - n=" + 5 + " p=" + 3 + " q=" + 10);
        B b = new B(5, 3) ;
    }
}
