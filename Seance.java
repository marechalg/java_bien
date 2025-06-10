package cod;

import java.util.ArrayList;

import javafx.beans.property.StringProperty;

public class Seance {
    private static final String[] JOURS = {"lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"};
    private static final String HEURE = "([01]\\\\d|2[0-3]):([0-5]\\\\d)";

    private StringProperty jour;
    private StringProperty heure;
    private StringProperty lieu;
    private Cours cours;
    private ArrayList<Professeur> professeurs;

    public Seance(StringProperty jour, StringProperty heure, StringProperty lieu, Cours cours) throws Exception {
        if (this.isJour(jour.get())) {
            this.jour = jour;
        } else throw new Exception("Le jour est invalide.");

        if (this.isHeure(heure)) {
            this.heure = heure;
        } else throw new Exception("L'heure est invalide.");

        this.lieu = lieu;
        this.cours = cours;

        this.professeurs = new ArrayList<>();
    }

    public Cours getCours() {
        return this.cours;
    }

    public void setJour(StringProperty jour) throws Exception {
        if (this.isJour(jour.get().trim().toLowerCase())) {
            this.jour = jour;
        } else throw new Exception("Le jour est invalide.");
    }

    public void setHeure(StringProperty heure) throws Exception {
        if (this.isHeure(heure)) {
            this.heure = heure;
        }  else throw new Exception("L'heure est invalide.");
    }

    public void setLieu(StringProperty lieu) {
        this.lieu = lieu;
    }

    public void setProfesseurs(ArrayList<Professeur> professeurs) {
        this.professeurs = professeurs;
    }

    public void setCours(Cours cours) throws Exception {
        boolean ok = false;
        for (Professeur professeur : this.professeurs) {
            if (cours.getType().equals(professeur.getSpecialite())) {
                ok = true;
                break;
            }
        }
        if (ok) {
            this.cours = cours;
        } else throw new Exception("Le professur n'est pas adapté au cours.");
    }

    public boolean isJour(String jour) {
        boolean result = false;
        for (String JOUR : JOURS) {
            if  (jour.equals(JOUR)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean isHeure(StringProperty heure) {
        return heure.get().matches(HEURE);
    }

    public void ajouterProfesseur(Professeur professeur) {
        this.professeurs.add(professeur);
    }

    public void supprimerProfesseur(Professeur professeur) {
        this.professeurs.remove(professeur);
    }

    @Override
    public boolean equals(Object object) {
        boolean result = false;
        if (object instanceof Seance seance) {
            if (seance.jour.equals(this.jour) && seance.heure.equals(this.heure) && seance.lieu.equals(this.lieu)) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Seance[jour=" + this.jour + ", heure=" + this.heure + ", lieu=" + this.lieu + "]";
    }
}
