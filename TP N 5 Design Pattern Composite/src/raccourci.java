class raccourci extends Element {
    private Element cible;

    public raccourci(String nom, Element cible) {
        super(nom);
        this.cible = cible;
    }

    public Element getCible() {
        return cible;
    }

    @Override
    public void afficher() {
        System.out.println("Nom du raccourci : " + getNom());
        System.out.println("Cible : " + cible.getNom());
    }
}
