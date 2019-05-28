package game;

// Create a class
public class Guerrier extends Personnage {

    private  Arme arme;


    // Create a class constructor
    public Guerrier(String nom, String image, int vie, int force) {
        super(nom,image,vie,force);
        this.arme= new Arme();

    }

    public Guerrier(String image, int vie, int force) {
        super(image, vie, force);
        this.nom = "Brackanrd";
        this.arme= new Arme();

    }

    public Guerrier() {
        super();
        this.nom = "Brackanrd";
        this.image = "image1";
        this.vie = 8;
        this.force = 8;
        this.arme= new Arme();

    }

    @Override
    public String toString() {
        return "Guerrier{" +
                "nom='" + nom + '\'' +
                ", image='" + image + '\'' +
                ", vie=" + vie +
                ", force=" + force +
                ", "+ arme.toString()+
                '}';
    }

//    Getter/Setter
//
//    public  String getNom(){
//        return nom;
//    }
//    public void setNom(String newNom) {
//        this.nom = newNom;
//    }
//    public  String getImage(){
//        return image;
//    }
//    public void setImage(String newImage) {
//        this.image = newImage;
//    }
//    public  int getVie(){
//        return vie;
//    }
//    public void setVie(int newVie) {
//        this.vie = newVie;
//    }
//    public  int getForce(){
//        return force;
//    }
//    public void setForce(int newForce) {
//        this.force = newForce;
//    }
//    public  String getArme(){
//        return arme;
//    }
//    public void setArme(String newArme) {
//        this.arme = newArme;
//    }
//    public  String getBouclier(){
//        return bouclier;
//    }
//    public void setBouclier(String newBouclier) {
//        this.bouclier = newBouclier;
//    }
}


