public class Cours {
    private String type;
    private int duree;
    private String niveau;

    public Cours(String type, int duree, String niveau) {
        this.type = type;
        this.duree = duree;
        this.niveau = niveau;
    }

    public String getType() {
        return this.type;
    }
    
    @Override
    public String toString() {
        return "Cours[type=" + this.type + ", duree=" + this.duree + ", niveau=" + this.niveau + "]";
    }
}