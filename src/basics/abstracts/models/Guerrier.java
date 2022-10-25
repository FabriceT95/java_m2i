package basics.abstracts.models;

public class Guerrier extends Personne {
    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("GUERRIER HELLO");
    }

    public void attaque() {
        System.out.println("ATTAQUE");
    }

    @Override
    public void sayBye() {
        System.out.println("Bye");
    }
}
