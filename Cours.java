import java.util.Date;

public class Cours {
    private String type;
    private int duree;
    private String lieu;
    private String niveau;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public Cours(String type, Date dateDebut, String duree, String lieu, String niveau) {
        this.type = type;
        this.dateDebut = dateDebut;
        this.duree = duree;
        this.lieu = lieu;
        this.niveau = niveau;
    }
    
    @Override
    public String toString() {
        return "Cours [type=" + type + ", dateDebut=" + dateDebut + ", duree=" + duree + ", lieu=" + lieu + ", niveau=" + niveau + "]";
    }
    
}