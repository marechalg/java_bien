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

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
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

    public Cours(String type, int duree, String lieu, String niveau) {
        this.type = type;
        this.duree = duree;
        this.lieu = lieu;
        this.niveau = niveau;
    }
    
    @Override
    public String toString() {
        return "Cours [type=" + type + ", duree=" + duree + ", lieu=" + lieu + ", niveau=" + niveau + "]";
    }
    
}