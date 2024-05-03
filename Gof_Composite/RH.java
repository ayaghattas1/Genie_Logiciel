import java.util.ArrayList;
import java.util.List;

public class RH extends User {
    private List<Composant> composants = new ArrayList<>();


    public RH(String prenom, String nom, String email, String motdepasse, String URLimg, String statut) {
        super(prenom, nom, email, motdepasse, URLimg, statut);
    }


    @Override
    public void ajouterComposant(Composant composant) {
        composants.add(composant);
    }


    @Override
    public void supprimerComposant(Composant composant) {
        composants.remove(composant);
    }


    @Override
    public Composant getChild(int i) {
        return composants.get(i);
    }


    @Override
    public void afficherDetails() {
        super.afficherDetails();
        for (Composant composant : composants) {
            composant.afficherDetails();
        }
    }
}
