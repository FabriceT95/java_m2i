package projects.listeChainee.models;

import java.util.ArrayList;

public class MaListeChainee {

    // Liste de type "ArrayList" utile ici car dynamique
    private ArrayList<Element> list;

    // Dernier élément de la liste / Assez utile lors du delete !
    private Element lastEl = null;

    // Classe privée Element qui représentera chaque "élément" de la liste
    private static class Element {

        // Valeur stockée dans l'élément
        private final int value;

        // Element juste avant celui-ci
        private Element previous;

        // Element juste après celui-ci
        private Element next;

        // On instancie la valeur
        Element(int value) {
            this.value = value;
        }

        ///////////////////////////////////////////////////////////////////
        //// GETTERS ET SETTERS
        //////////////////////////////////////////////////////////////////
        public Element getNext() {
            return next;
        }

        public void setNext(Element next) {
            this.next = next;
        }

        public Element getPrevious() {
            return previous;
        }

        public void setPrevious(Element previous) {
            this.previous = previous;
        }

        public int getValue() {
            return value;
        }
    }

    // On instancie l'attribut list
    public MaListeChainee () {
        list = new ArrayList<>();
    }

    // On ajoute une nouvelle valeur. On ajoute un nouveau noeud
    // après le dernier
    // On doit aussi notifier à l'ancien dernier qu'il y a un nouveau à la fin !
    public void add(int value) {
        Element el = new Element(value);
        list.add(el);
        if(lastEl != null){
            lastEl.setNext(el);
            el.setPrevious(lastEl);
        }
        lastEl = el;
    }

    // On supprime un Element de la liste
    // On notifie les éléments avant et après en changeant leurs attributs previous et next
    // Cas particulier si c'est le premier ou le dernier
    public void delete(int index) {
        Element el = list.get(index);
        if(el != lastEl) {
            el.getNext().setPrevious(el.previous);
        } else {
            lastEl = el.getPrevious();
        }
        if(el.getPrevious() != null) {
            el.getPrevious().setNext(el.next);
        } else {
            el.getNext().setNext(null);
        }
        list.remove(index);
    }



    // Retourne la taille de la liste
    public int size() {
        return list.size();
    }

    // Affiche chaque valeur de la liste
    public void printList() {
        for (Element element : list) {
            System.out.println(element.getValue());
        }
    }

    // Affiche une valeur particulière en fonction de l'indice
    public void printElementsValue(int index) {
        System.out.println("Ceci est l'Element n°"+index+" et sa valeur est : " + list.get(index).getValue());
    }



    // Affiche les éléments d'avant et d'après
    public void printNextAndPrevious(int index) {
        System.out.println("L'Element n°" + index + " a pour valeur " + list.get(index).getValue());
        System.out.println("L'Element précédent a pour valeur : " +  list.get(index).getPrevious().getValue());
        if(list.get(index) != lastEl) {
            System.out.println("L'Element suivant a pour valeur : " + list.get(index).getNext().getValue());
        } else {
            System.out.println("Cet Element n'a pas de valeur suivante car il est le dernier.");
        }
    }

}
