import java.util.ArrayList;

public class Professeur {
    private static int idInc = 0;

    private final int id;
    private final String nom;
    private final String prenom;
    private String specialite;
    private ArrayList<Seance> seances;

    public Professeur(String nom, String prenom, String specialite) {
        this.id = ++Professeur.idInc;
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;

        this.seances = new ArrayList<>();
    }

    public String getSpecialite() {
        return this.specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void ajouterSeance(Seance seance) throws Exception {
        if (seance.getCours().getType().equals(this.specialite)) {
            boolean ok = true;
            for (Professeur professeur : Admin.professeurs) {
                for (Seance snc : professeur.seances) {
                    if (snc.equals(seance)) {
                        ok = false;
                        break;
                    }
                }
                if (!ok) break;
            }
            if (ok) {
                this.seances.add(seance);
            } else throw new Exception("Cette salle n'est pas disponible à ce créneau.");
        } else throw new Exception("Le professeur n'est pas adapté au cours.");
    }

    public void modifierSeance(Seance seance, Cours cours, String jour, String heure, String lieu, ArrayList<Professeur> professeurs) throws Exception {
        seance.setCours(cours);
        seance.setJour(jour);
        seance.setHeure(heure);
        seance.setLieu(lieu);
        seance.setProfesseurs(professeurs);
    }

    public void supprimerSeance(Seance seance) {
        this.seances.remove(seance);
    }

    @Override
    public boolean equals(Object object) {
        boolean result = false;
        if (object instanceof Professeur professeur) {
            if (professeur.id == this.id) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Professeur[prenom=" + this.prenom + ", nom=" + this.nom + ", specialite=" + this.specialite +  ", seances=" + this.seances + "]";
    }
}