import java.util.ArrayList;
import java.util.List;

public class Application {
    private List<Utilisateur> utilisateurs = new ArrayList<>();


    public void setUtilisateur(Utilisateur utilisateur) {
        utilisateurs.add(utilisateur) ;
    }


    public void afficher() {
        for (Utilisateur utilisateur : utilisateurs) {
            utilisateur.AfficherUtilisateur();
        }
    }
}
