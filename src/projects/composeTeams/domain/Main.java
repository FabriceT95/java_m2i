package projects.composeTeams.domain;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> personnes = new ArrayList<>();
        personnes.add("JP");
        personnes.add("JORIS");
        personnes.add("MAUD");
        personnes.add("SEGO");
        personnes.add("FABRICE");
        personnes.add("HUGO");
        personnes.add("LISA");
        personnes.add("BENOIT");
        personnes.add("VICTOR");
        personnes.add("KESA");
        personnes.add("BAPTISTE");

        do {
            int rand1 = (int) Math.floor(Math.random() * (personnes.size()));
            int rand2 = (int) Math.floor(Math.random() * (personnes.size()));
            if(rand2 == rand1) {
                continue;
            }
            System.out.println("Ce groupe est constitué de " + personnes.get(rand1) + " et de " + personnes.get(rand2));

            personnes.remove(Math.max(rand1, rand2));
            personnes.remove(Math.min(rand1, rand2));

        } while(personnes.size() > 3);

        System.out.println("Il reste trois personnes. Ce sera le dernier groupe : " + personnes.get(0)+ ", " + personnes.get(1)+ ", "  + personnes.get(2));
    }
}
