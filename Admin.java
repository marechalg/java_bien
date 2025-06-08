import java.util.ArrayList;

public class Admin {
    static ArrayList<Professeur> professeurs = new ArrayList<>();

    static ArrayList<Professeur> getProfesseurs() {
        return Admin.professeurs;
    }

    static void ajouterProfesseur(Professeur professeur) throws Exception {
        if (professeur != null) {
            if (!Admin.professeurs.contains(professeur)) {
                Admin.professeurs.add(professeur);
            } else throw new Exception("Le professeur existe déjà.");
        } else throw new Exception("Le professeur est invalide.");
    }

    static void modifierProf(Professeur professeur, int index) throws Exception {
        if (index >= 0){
            if (Admin.professeurs.contains(professeur)){
                Admin.professeurs.set(index, professeur);
            } else throw new Exception("Le professeur n'existe pas");
        } else throw new Exception("Erreur l'index ne peut pas être inférieur à 0.");
    }

    static void retirerProf(Professeur professeur) throws Exception {
        if (Admin.professeurs.contains(professeur)) {
            Admin.professeurs.remove(professeur);
            professeur = null;
            System.gc();
        } else throw new Exception("Le professeur n'existe pas.");
    }
}