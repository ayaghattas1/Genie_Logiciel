package SOLID_Responsabilite_Unique;
import java.util.ArrayList;
import java.util.List;

public class EmployeManager {
    private List<Employe> employes = new ArrayList<>();

    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    public List<Employe> getTousLesEmployes() {
        return new ArrayList<>(employes);
    }
}

