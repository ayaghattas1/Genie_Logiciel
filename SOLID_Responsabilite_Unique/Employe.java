package SOLID_Responsabilite_Unique;

public class Employe {
    private String prenom;
    private String nom;
    private String email;
    private String motdepasse;

    public Employe(String prenom, String nom, String email, String motdepasse) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.motdepasse = motdepasse;
    }

    // Accesseurs et mutateurs pour les attributs de l'employé
    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMotdepasse() { return motdepasse; }
    public void setMotdepasse(String motdepasse) { this.motdepasse = motdepasse; }
}
