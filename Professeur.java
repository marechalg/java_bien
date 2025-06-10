package cod;

import java.util.ArrayList;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.StringProperty;

public class Professeur {
    private static IntegerProperty idInc = new SimpleIntegerProperty(0);

    private final IntegerProperty id;
    private final StringProperty nom;
    private final StringProperty prenom;
    private StringProperty specialite;
    private ArrayList<Seance> seances;

    public Professeur(StringProperty nom, StringProperty prenom, StringProperty specialite) {
    	Professeur.idInc.set(idInc.get() + 1);
        this.id = new SimpleIntegerProperty(idInc.get());
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;

        this.seances = new ArrayList<>();
    }

    public StringProperty getSpecialite() {
        return this.specialite;
    }

    public void setSpecialite(StringProperty specialite) {
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

    public void modifierSeance(Seance seance, Cours cours, StringProperty jour, StringProperty heure, StringProperty lieu, ArrayList<Professeur> professeurs) throws Exception {
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