package basics.inheritance.models.exo6;

public class Main {
    public static void main(String[] args) {

        A a = new A() ;
        // Je suis un A
        a.affiche() ;

        B b = new B() ;
        // Je suis un A
        b.affiche() ;

        C c = new C() ;
        // Je suis un C
        c.affiche() ;

        D d = new D() ;
        // Je suis un D
        d.affiche() ;

        E e = new E() ;
        // Je suis un A
        e.affiche() ;

        F f = new F() ;
        // Je suis un C
        f.affiche() ;
    }
}
