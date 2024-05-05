package SOLID_Responsabilite_Unique;

public class GestionEmployeController {
    private EmployeManager employeManager;

    public GestionEmployeController(EmployeManager employeManager) {
        this.employeManager = employeManager;
    }

    public void ajouterEmploye(Employe employe) {
        employeManager.ajouterEmploye(employe);
        System.out.println("Employé ajouté avec succès : " + employe.getNom());
    }

    public void supprimerEmploye(Employe employe) {
        employeManager.supprimerEmploye(employe);
        System.out.println("Employé supprimé avec succès : " + employe.getNom());
    }

    public void afficherEmployes() {
        employeManager.getTousLesEmployes().forEach(e -> System.out.println(e.getNom()));
    }
}

