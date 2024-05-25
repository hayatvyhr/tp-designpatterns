public class fichier extends Element{
    private String contenu;

    public fichier(String nom, String contenu) {
        super(nom);
        this.contenu = contenu;
    }

    @Override
    public void afficher() {
        System.out.println("Nom du fichier : " + getNom());
        System.out.println("Contenu :\n" + contenu);
    }
}
