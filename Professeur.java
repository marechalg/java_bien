import java.util.Map;

public class Professeur {
    private String nom;
    private String prenom;
    private String specialite;
    private Map<String, Integer> nbSeances;

    public Professur(String nom, String prenom, String specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;

        this.nbSeances["passees"] = 0;
        this.nbSeances["futures"] = 0;
        this.nbSeances["total"] = this.nbSeances["futur"] + this.nbSeances["passees"];
    }

    
}