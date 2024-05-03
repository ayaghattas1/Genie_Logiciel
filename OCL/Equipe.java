package OCL;

import java.util.Objects;
public class Equipe {

    private String nomEquipe;
    private ChefEquipe chefEquipe;

    public Equipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public ChefEquipe getChefEquipe() {
        return chefEquipe;
    }

    public void setChefEquipe(ChefEquipe chefEquipe) {
        this.chefEquipe = chefEquipe;
    }



    // Vérification des contraintes OCL (à intégrer à l'aide d'une bibliothèque OCL)
    @OCL(inv="self.chefEquipe <> null and self.chefEquipe.statut = \"Actif\"")
    
    public boolean validerContraintes() {
        // Contrainte : Une équipe ne peut pas être sans chef d'équipe
        if (chefEquipe == null) {
            throw new IllegalArgumentException("Un chef d'équipe ne peut pas être null.");
        }
        // Vérifier si le chef d'équipe à assigner est actif
        if (!chefEquipe.getStatut().equals("Actif")) {
            throw new IllegalStateException("Ce chef d'équipe est en congé ou hors ligne, il doit être actif.");
        }

        return true;
    }
}

