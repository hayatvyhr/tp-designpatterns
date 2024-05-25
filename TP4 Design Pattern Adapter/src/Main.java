import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Application app = new Application();

        app.setUtilisateur(new GrandeDistribution("test"));

        ImplAdaptee implAdaptee = new ImplAdaptee("test14", "test");
        app.setUtilisateur(new EmployeAdapter(implAdaptee));
        ImplAdaptee implAdapte2 = new ImplAdaptee("t2", "te4");
        app.setUtilisateur(new EmployeAdapter(implAdapte2));
        app.afficher();
        }
    }
