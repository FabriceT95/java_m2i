package basics.abstracts.domain;


import basics.abstracts.models.Chien;
import basics.abstracts.models.Guerrier;
import basics.abstracts.models.Personne;

public class Main {
    public static void main(String[] args) {
        Personne g =  new Guerrier();
        g.sayHello();
        g.sayBye();

        Chien ch = new Chien();
        ch.communiquer();




    }
}
