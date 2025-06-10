public class Cours {
    private StringProperty type;
    private IntegerProperty duree;
    private StringProperty niveau;

    public Cours(StringProperty type, IntegerProperty duree, StringProperty niveau) {
        this.type = type;
        this.duree = duree;
        this.niveau = niveau;
    }

    public StringProperty getType() {
        return this.type;
    }
    
    @Override
    public StringProperty toString() {
        return "Cours[type=" + this.type + ", duree=" + this.duree + ", niveau=" + this.niveau + "]";
    }
}