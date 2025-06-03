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

    
}