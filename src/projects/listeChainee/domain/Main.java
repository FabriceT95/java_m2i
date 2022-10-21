package projects.listeChainee.domain;

import projects.listeChainee.models.MaListeChainee;

/**
 * Creation d'une liste chainee (double)
 * Stock juste entier
 *
 *  - Add un element
 *  - Delete un element
 *  - size
 *  - print
 */

public class Main {
    public static void main(String[] args) {


        MaListeChainee maListe = new MaListeChainee();
        maListe.add(5);
        maListe.add(10);
        maListe.add(15);
        maListe.add(20);
        maListe.add(25);
        maListe.add(30);

        System.out.println("Printage de la liste: ");
        maListe.printList();
        maListe.printNextAndPrevious(2);

        System.out.println("Suppression d'un élément");
        maListe.delete(maListe.size()-1);

        System.out.println("Printage de la liste: ");
        maListe.printList();
        maListe.printNextAndPrevious(maListe.size()-1);

        maListe.printList();
        maListe.printNextAndPrevious(3);






    }
}
