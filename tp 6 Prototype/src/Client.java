public class Client {
    public static void main(String[] args) {
        String numFacture = "F.2024001";
        String Client = "Client1";
        Facture f1= new Facture(Client, numFacture);
        f1.setNumClient(numFacture);
       f1.information();
        System.out.println("***************************************");
       Facture facture = ((Facture) f1.clone());
       facture.information();
        System.out.println("***************************************");
       facture.setNumClient("hihkn66161");
       facture.information();

    }

}
