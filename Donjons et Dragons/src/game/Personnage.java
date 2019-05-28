package game;

// Create a class
public abstract class Personnage {
    protected String nom;
    protected String image;
    protected int vie;
    protected int force;

    // Create a class constructor

    /**
     * constructeur qui permet de creer une personnage avec ces param
     * @param nom valeur de nom en String
     * @param image valeur de image en String
     * @param vie valeur de vie en int
     * @param force valeur de force en int
     */
    protected Personnage(String nom, String image, int vie, int force){
        this.nom = nom;
        this.image = image;
        this.vie = vie;
        this.force = force;
    }

    /**
     * constructeur qui permet de creer une personnage avec ces param
     * @param image valeur de image en String
     * @param vie valeur de vie en int
     * @param force valeur de force en int
     */
    protected Personnage(String image, int vie, int force){
        this.nom = nom;
        this.image = image;
        this.vie = vie;
        this.force = force;
    }

    /**
     * constructeur qui permet de creer une personnage sans param
     */
    protected Personnage(){
        this.nom = nom;
        this.image = image;
        this.vie = vie;
        this.force = force;
    }

        //Getter/Setter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }
}
