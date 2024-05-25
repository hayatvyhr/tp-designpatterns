public class EmployeAdapter  implements Utilisateur{
    private ImplAdaptee implAdaptee;
    public EmployeAdapter(ImplAdaptee implAdapteee) {
        this.implAdaptee= implAdapteee;
    }
    @Override
    public void AfficherUtilisateur() {
        implAdaptee.AfficherNom();
        implAdaptee.AfficherPoste();    }
        }