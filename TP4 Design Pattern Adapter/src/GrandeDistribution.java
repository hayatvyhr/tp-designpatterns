

public class GrandeDistribution  implements Utilisateur {
private String nom;

    public String getNom() {
        return nom;
    }

    public GrandeDistribution(String nom) {
        this.nom = nom;
    }

    @Override
    public void AfficherUtilisateur() {

    System.out.println("Utilisateur: "+ this.nom +"\n");
        }

}
