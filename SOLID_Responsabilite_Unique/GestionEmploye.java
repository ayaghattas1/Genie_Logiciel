package SOLID_Responsabilite_Unique;
import java.util.ArrayList;
import java.util.List;

public class GestionEmploye {
    private List<Composant> employes = new ArrayList<>();

    public void ajouterEmploye(Composant employe) {
        employes.add(employe);
    }

    public void supprimerEmploye(Composant employe) {
        employes.remove(employe);
    }

    public Composant getEmploye(int index) {
        return employes.get(index);
    }
}

