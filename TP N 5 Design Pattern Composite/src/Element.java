public abstract class Element {
    private String nom;

    public Element(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public abstract void afficher();
}

