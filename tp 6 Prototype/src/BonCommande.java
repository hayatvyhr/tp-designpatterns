public class BonCommande extends Prototype {
    private String client;
    private String NumCommandes;

    public BonCommande(String client,String NumCommandes) {
        this.client = client;
        this.NumCommandes = NumCommandes;
    }


    @Override
    public Prototype clone() {
        return new BonCommande(this.client, this.NumCommandes);
    }

    @Override
    public void information() {
        System.out.println("Bon de commande  : " + this.client  + this.NumCommandes + ")");
    }
    public void setNumClient(String numClient) {
        this.NumCommandes= numClient;
    }

}
