import java.util.Map;

public class Professeur {
    private String nom;
    private String prenom;
    private String specialite;
    private Map<String, Integer> nbSeances;

    

    public Professeur(String nom, String prenom, String specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;

        this.nbSeances.put("passees", 0);
        this.nbSeances.put("futures", 0);
        this.nbSeances.put("total", this.nbSeances.get("passees") + this.nbSeances.get("futures"));
    }



    public String getNom() {
        return nom;
    }



    public void setNom(String nom) {
        this.nom = nom;
    }



    public String getPrenom() {
        return prenom;
    }



    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }



    public String getSpecialite() {
        return specialite;
    }



    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }



    public Map<String, Integer> getNbSeances() {
        return nbSeances;
    }



    public void setNbSeances(Map<String, Integer> nbSeances) {
        this.nbSeances = nbSeances;
    }

    
}