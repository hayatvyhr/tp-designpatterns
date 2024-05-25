public class Facture extends Prototype{
    private String client;
    private String NumCmd;

    public Facture(String client, String Num) {
        this.client = client;
        this.NumCmd = Num;
    }


    @Override
    public Prototype clone() {
        return new Facture(this.client, this.NumCmd);
    }

    @Override
    public void information() {
        System.out.println("Facture générée pour le client : " + this.client + "  Numéro de client : " + this.NumCmd);
    }

    public void setNumClient(String numClient) {
        this.NumCmd= numClient;
    }
}
