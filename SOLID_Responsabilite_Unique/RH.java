package SOLID_Responsabilite_Unique;

public class RH {
    GestionnaireEmployes gestionEmploye;
    AfficheurDetails afficheurDetails;

    public RH(GestionnaireEmployes gestionEmploye, AfficheurDetails afficheurDetails) {
        this.gestionEmploye = gestionEmploye;
        this.afficheurDetails = afficheurDetails;
    }

    // D'autres méthodes pour la logistique interne si nécessaire
}

