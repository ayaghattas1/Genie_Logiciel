package SOLID_Responsabilite_Unique;

public interface GestionnaireEmployes {
    void ajouterEmploye(Composant employe);
    void supprimerEmploye(Composant employe);
    Composant getEmploye(int index);
}

