package basics.abstracts.models;

public class Chat implements Animal{
    @Override
    public void communiquer() {
        System.out.println("MIAOU MIAOU");
    }

    @Override
    public void bouger() {

    }
}
