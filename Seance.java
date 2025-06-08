import java.util.ArrayList;

public class Seance {
    private static final String[] JOURS = {"lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"};
    private static final String HEURE = "([01]\\\\d|2[0-3]):([0-5]\\\\d)";

    private String jour;
    private String heure;
    private String lieu;

    public Seance(String jour, String heure, String lieu) throws Exception {
        if (this.isJour(jour)) {
            this.jour = jour;
        } else throw new Exception("Le jour est invalide.");

        if (this.isHeure(heure)) {
            this.heure = heure;
        } else throw new Exception("L'heure est invalide.");

        this.lieu = lieu;
    }

    public void setJour(String jour) throws Exception {
        if (this.isJour(jour)) {
            this.jour = jour;
        } else throw new Exception("Le jour est invalide.");
    }
    public void setHeure(String heure) throws Exception {
        if (this.isHeure(heure)) {
            this.heure = heure;
        }  else throw new Exception("L'heure est invalide.");
    }
    public void setLieu(String lieu) {
        this.lieu = lieu;
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

    public boolean isHeure(String heure) {
        return heure.matches(HEURE);
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
