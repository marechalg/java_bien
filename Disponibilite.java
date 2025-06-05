import java.util.Date;

public class Disponibilite {
    private Date heureDebut;
    private Date heureFin;
    private Date jour;
    
    public Date getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(Date heureDebut) {
        this.heureDebut = heureDebut;
    }

    public Date getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(Date heureFin) {
        this.heureFin = heureFin;
    }

    public Date getJour() {
        return jour;
    }
    
    public void setJour(Date jour) {
        this.jour = jour;
    }

    public Disponibilite(Date heureDebut, Date heureFin, Date jour) {
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.jour = jour;
    }

    @Override
    public String toString() {
        return "Disponibilite [heureDebut=" + heureDebut + ", heureFin=" + heureFin + ", jour=" + jour + "]";
    }

    public Date modifHDebut(Date d_debut){
        return this.heureDebut = d_debut;
    }

    public Date modifHFin(Date d_fin){
        return this.heureFin = d_fin;
    }

    public Date modifJour(Date j){
        return this.jour = j;
    }
    
}