package basics.inheritance.models.exo6;

/*
Quels résultats fournit le programme suivant ?

class A

{ public void affiche()

{ System.out.println ("Je suis un A") ;

}

}

class B extends A { }

class C extends A

{ public void affiche()

{ System.out.println ("Je suis un C") ;

}

}

class D extends C

{ public void affiche()

{ System.out.println ("Je suis un D") ;

}

}

class E extends B {}

class F extends C {}

public class DiagHeri

{ public static void main (String arg[])

{ A a = new A() ; a.affiche() ;

B b = new B() ; b.affiche() ;

C c = new C() ; c.affiche() ;

D d = new D() ; d.affiche() ;

E e = new E() ; e.affiche() ;

F f = new F() ; f.affiche() ;

}

}
 */

public class A{
    public void affiche() {
        System.out.println ("Je suis un A") ;
    }

}

class B extends A { }

class C extends A {
    public void affiche() {
        System.out.println ("Je suis un C") ;
    }
}

class D extends C {
    public void affiche() {
        System.out.println ("Je suis un D") ;
    }

}

class E extends B {}

class F extends C {}
