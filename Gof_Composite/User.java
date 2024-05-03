public class User implements Composant {
    protected String prenom;
    protected String nom;
    protected String email;
    protected String motdepasse;
    protected String URLimg;
    protected String statut;


    public User(String prenom, String nom, String email, String motdepasse, String URLimg, String statut) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.motdepasse = motdepasse;
        this.URLimg = URLimg;
        this.statut = statut;
    }


    @Override
    public void afficherDetails() {
        System.out.println(nom + " (" + statut + ")");
    }


    @Override
    public void ajouterComposant(Composant composant) throws Exception {
        throw new UnsupportedOperationException("Impossible d'ajouter un composant à un utilisateur simple");
    }


    @Override
    public void supprimerComposant(Composant composant) throws Exception {
        throw new UnsupportedOperationException("Impossible de supprimer un composant d'un utilisateur simple");
    }


    @Override
    public Composant getChild(int i) {
        throw new UnsupportedOperationException("Pas d'enfants disponibles pour cet utilisateur");
    }
}
