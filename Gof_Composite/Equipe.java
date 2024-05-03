import java.util.ArrayList;
import java.util.List;


public class Equipe implements Composant {
    private List<Composant> membres = new ArrayList<>();
    private String nomEquipe;
    private ChefEquipe chefEquipe; 


    public Equipe(String nomEquipe, ChefEquipe chefEquipe) {
        this.nomEquipe = nomEquipe;
        this.chefEquipe = chefEquipe;
        this.ajouterComposant(chefEquipe);  // Ajoute automatiquement le chef à l'équipe
    }


    @Override
    public void ajouterComposant(Composant composant) {
        membres.add(composant);
    }
    @Override
    public void supprimerComposant(Composant composant) {
        membres.remove(composant);
    }
    @Override
    public Composant getChild(int i) {
        return membres.get(i);
    }
    @Override
    public void afficherDetails() {
        System.out.println("Equipe: " + nomEquipe);
        for (Composant membre : membres) {
            membre.afficherDetails();
        }
    }
}
