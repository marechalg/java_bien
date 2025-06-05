import java.util.Map;
import java.util.ArrayList;
import java.util.Date;

public class Professeur {
    private static Map<String, Integer> nbSeances;

    private String nom;
    private String prenom;
    private String specialite;
    private Map<Date, Cours> seances;
    private ArrayList<Disponibilite> nonDispos;

    public Professeur(String nom, String prenom, String specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;

        this.nbSeances.put("passees", 0);
        this.nbSeances.put("futures", 0);
        this.nbSeances.put("total", this.nbSeances.get("passees") + this.nbSeances.get("futures"));
    }

    public void ajouterSeance(Date date, Cours cours) {
        
    }
}