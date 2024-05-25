import java.util.ArrayList;
import java.util.List;

class Repertoire extends Element {
    private List<Element> elements;

    public Repertoire(String nom) {
        super(nom);
        elements = new ArrayList<>();
    }

    public void ajouterElement(Element element) {
        elements.add(element);
    }

    @Override
    public void afficher() {
        System.out.println("Nom du répertoire : " + getNom());
        System.out.println("Contenu :");
        for (Element element : elements) {
            System.out.println("- " + element.getNom());
        }
    }
}