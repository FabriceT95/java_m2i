package basics.abstracts.models;

public class Chien implements Animal {
    @Override
    public void communiquer() {
        System.out.println("WOUF WOUF");
        System.out.println(ATTRIBUT);
    }

    @Override
    public void bouger() {

    }
}
