public interface Composant {
    void afficherDetails();
    void ajouterComposant(Composant composant) throws Exception;
    void supprimerComposant(Composant composant) throws Exception;
    Composant getChild(int i);
}
