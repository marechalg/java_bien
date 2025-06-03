public class Admin {
    private ArrayList<Professeur> professeurs;

    public Admin() {
        this.professeurs = new ArrayList<>();
    }

    public ajouterProfesseur(Professeur professeur) throws Exception {
        if (professeur != null) {
            if (!this.professeurs.contains(professeur)) {
                this.professeurs.add(professeur);
            } else throw new Exception("Le professeur existe déjà.");
        } else throw new Exception("Le professeur est invalide.");
    }

    public retirerProf(Professeur professeur) throws Exception {
        if (this.professeur.contains(professeur)) {
            
        }
    }
}