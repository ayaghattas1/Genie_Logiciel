package GRASP_Controller;
public class GestionEmployeController {
    private RH rh; // Supposons que RH gère tout le personnel


    public GestionEmployeController(RH rh) {
        this.rh = rh;
    }


    public void ajouterEmploye(Employe employe) {
        try {
            rh.ajouterComposant(employe);
            System.out.println("Employé ajouté avec succès.");
        } catch (Exception e) {
            System.out.println("Erreur lors de l'ajout de l'employé : " + e.getMessage());
        }
    }


    public void supprimerEmploye(Employe employe) {
        try {
            rh.supprimerComposant(employe);
            System.out.println("Employé supprimé avec succès.");
        } catch (Exception e) {
            System.out.println("Erreur lors de la suppression de l'employé : " + e.getMessage());
        }
    }


    public void mettreAJourEmploye(Employe employe, String email, String URLimg) {
        employe.modifierProfile(email, URLimg);
        System.out.println("Profil de l'employé mis à jour.");
    }
}

