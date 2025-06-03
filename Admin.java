public class Admin {
    private ArrayList<Professeur> professeurs;

    public Admin() {
        this.professeurs = new ArrayList<>();
    }

    public ajouterProfesseur(Professeur professur) throws Exception {
        if (professeur != null) {
            if (!this.professurs.contains(professeur)) {
                this.professeurs.add(professur);
            } else throw new Exception("Le professur existe déjà.");
        } else throw new Exception("Le professur est invalide.");
    }

    public retirerProf(Professur professeur) throws Exception {
        if (this.professeur.contains(professur)) {
            
        }
    }
}