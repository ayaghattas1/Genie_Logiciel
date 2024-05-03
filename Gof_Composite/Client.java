public class Client extends User {
    public Client(String prenom, String nom, String email, String motdepasse, String URLimg, String statut) {
        super(prenom, nom, email, motdepasse, URLimg, statut);
    }
    @Override
    public void ajouterComposant(Composant composant) throws Exception {
        throw new UnsupportedOperationException("Un client ne peut pas contenir d'autres composants.");
    }

    @Override
    public void supprimerComposant(Composant composant) throws Exception {
        throw new UnsupportedOperationException("Un client ne peut pas contenir d'autres composants.");
    }

    @Override
    public Composant getChild(int i) {
        throw new UnsupportedOperationException("Un client ne contient pas de sous-composants.");
    }

    @Override
    public void afficherDetails() {
        System.out.println("Client: " + nom + " (" + statut + ")");
    }
}
