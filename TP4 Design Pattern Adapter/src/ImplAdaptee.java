public class ImplAdaptee {
    private String Nom;
    private String Poste;


    public String getNom() {
        return Nom;
    }

    public String getPoste() {
        return Poste;
    }

    public ImplAdaptee(String nom,String poste) {
       this.Nom = nom;
        this.Poste = poste;
    }

    public void AfficherNom(){
        System.out.println("employé Nom : " +Nom);
    }
    public void AfficherPoste(){
        System.out.println("employé poste : " +Poste +"\n");
    }
}
