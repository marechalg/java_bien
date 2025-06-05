import java.util.ArrayList;

public class Admin {
    private static ArrayList<Professeur> professeurs;
    

    public Admin() {
        Admin.professeurs = new ArrayList<>();
    }

    public void ajouterProfesseur(Professeur professeur) throws Exception {
        if (professeur != null) {
            if (!Admin.professeurs.contains(professeur)) {
                Admin.professeurs.add(professeur);
            } else throw new Exception("Le professeur existe déjà.");
        } else throw new Exception("Le professeur est invalide.");
    }

    public void retirerProf(Professeur professeur) throws Exception {
        if (Admin.professeurs.contains(professeur)) {
            if (professeur != null){
                Admin.professeurs.remove(professeur);
            } else throw new Exception("Le professeur est invalide.");
        } else throw new Exception("Le professeur existe déjà.");
    }

    public void modifierProf(Professeur professeur, int index) throws Exception{
        if (index >= 0){
            if (Admin.professeurs.contains(professeur)){
                Admin.professeurs.set(index, professeur);
            } else throw new Exception("Le professeur n'existe pas");
        } else throw new Exception("Erreur l'index ne peut pas être inférieur à 0.");
        
    }

    static ArrayList<Professeur> getProfesseurs() {
        return Admin.professeurs;
    }

    public void setProfesseurs(ArrayList<Professeur> professeurs) {
        Admin.professeurs = professeurs;
    }

    @Override
    public String toString() {
        return "Admin[professeurs=" + professeurs + "]";
    }
}