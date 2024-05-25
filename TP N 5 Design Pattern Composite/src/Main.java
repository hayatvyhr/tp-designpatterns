
public class Main {
    public static void main(String[] args) {
        //  Repertoire
        Repertoire root = new Repertoire("doc1");
        Repertoire documents = new Repertoire("Doc2");
        Repertoire picturesR = new Repertoire("doc3");

        // fichiers
        fichier f1 = new fichier("f1.txt", "contenu ***** de f1 ...");
        fichier f2 = new fichier("Photo.jpg", "Image *******...");

        //  raccourcis
        raccourci f1Shortcut = new raccourci("f1 Shortcut", f1);
        raccourci f2Shortcut = new raccourci("f2 Shortcut", picturesR);

        root.ajouterElement(documents);
        root.ajouterElement(picturesR);
        documents.ajouterElement(f1);
        picturesR.ajouterElement(f2);
        root.ajouterElement(f1Shortcut);
        root.ajouterElement(f2Shortcut);
        System.out.println("******root rep ****************");
        root.afficher();

        Element cible = f1Shortcut.getCible();
        if (cible instanceof fichier) {
            System.out.println("f1  par raccourci...");
            ((fichier) cible).afficher();
        } else {
            System.out.println("Error");
        }
    }
    }
