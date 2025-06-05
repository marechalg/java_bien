import java.util.ArrayList;

public class Admin {
    private ArrayList<Professeur> professeurs;
    

    public Admin() {
        this.professeurs = new ArrayList<>();
    }

    public void ajouterProfesseur(Professeur professeur) throws Exception {
        if (professeur != null) {
            if (!this.professeurs.contains(professeur)) {
                this.professeurs.add(professeur);
            } else throw new Exception("Le professeur existe déjà.");
        } else throw new Exception("Le professeur est invalide.");
    }

    public void retirerProf(Professeur professeur) throws Exception {
        if (this.professeurs.contains(professeur)) {
            if (professeur != null){
                this.professeurs.remove(professeur);
            } else throw new Exception("Le professeur est invalide.");
        }else throw new Exception("Le professeur existe déjà.");
    }

    public ArrayList<Professeur> getProfesseurs() {
        return professeurs;
    }

    public void setProfesseurs(ArrayList<Professeur> professeurs) {
        this.professeurs = professeurs;
    }

    @Override
    public String toString() {
        return "Admin [professeurs=" + professeurs + "]";
    }
}