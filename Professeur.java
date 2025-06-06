import java.util.HashMap;
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

        this.nbSeances = new HashMap<>();
        this.seances = new HashMap<>();

        this.nbSeances.put("passees", 0);
        this.nbSeances.put("futures", 0);
        this.nbSeances.put("total", this.nbSeances.get("passees") + this.nbSeances.get("futures"));
    }
    // verif compatibilité
    public void ajouterSeance(Date date, Cours cours) throws Exception {
        Date now = new Date();
        if (date.compareTo(now) >= 0) {
            boolean ok = true;
            for (Professeur professeur : Admin.getProfesseurs()) {
                if (professeur.seances.containsKey(date)) {
                    ok = false;
                }
            }
            if (ok) {
                this.seances.put(date, cours);
                this.majNbSeances();
            } else throw new Exception("Un cours est déjà placé à cette date.");
        } else throw new Exception("La date n'est pas valide");
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void modifierSeance(Date date, String type, int duree, String lieu, String niveau) {
        this.supprimerSeance(date);
        this.seances.put(date, new Cours(type, duree, lieu, niveau));
        this.majNbSeances();
    }

    public void supprimerSeance(Date date) {
        this.seances.remove(date);
        this.majNbSeances();
    }

    public void majNbSeances() {
        Date now = new Date();
        for (Date date : this.seances.keySet()) {
            if (date.compareTo(now) < 0) {
                this.nbSeances.put("passees", this.nbSeances.get("passees") + 1);
            } else {
                this.nbSeances.put("futures", this.nbSeances.get("futures") + 1);
            }
            this.nbSeances.put("total", this.nbSeances.get("passees") + this.nbSeances.get("futures"));
        }
    }

    public String toString() {
        return "Professeur[prenom=" + this.prenom + ", nom=" + this.nom + ", specialite=" + this.specialite + ", nbSeances=" + this.nbSeances + ", seances=" + this.seances + "]";
    }

    public static void main(String[] args) throws Exception {
        Admin admin = new Admin();
        Professeur prof = new Professeur("vl", "jc", "salsa hawaienne");
        Cours cours = new Cours("salsa hawaienne", 120, "LaSalle", "intermédiaire");
        Admin.ajouterProfesseur(prof);
        prof.ajouterSeance(new Date(), cours);
        System.out.println(prof);
        prof.modifierSeance(new Date(), "caca", 90, "lasalle (de bain)", "expert");
        System.out.println(prof);
    }
}