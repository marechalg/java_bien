import java.util.Map;
import java.util.Date;

public class Professeur {
    private String nom;
    private String prenom;
    private String specialite;
    private Map<String, Integer> nbSeances;
    private Map<Date, Cours> seances;
    

    public Professeur(String nom, String prenom, String specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;

        this.nbSeances.put("passees", 0);
        this.nbSeances.put("futures", 0);
        this.nbSeances.put("total", this.nbSeances.get("passees") + this.nbSeances.get("futures"));
    }

    public void ajouterSeance(Date date, Cours cours) throws Exception {
        Date now = new Date();
        if (date.compareTo(now) >= 0) {
            if (cours != null) {
                if (!this.seances.containsKey(date)) {
                    this.seances.put(date, cours);
                }
            }
        }
    }
}