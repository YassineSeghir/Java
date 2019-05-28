package game;

// Create a class
public class Magicien extends Personnage {
    private  Sort sort;


    // Create a class constructor
    public Magicien(String nom, String image, int vie, int force) {
        super(nom,image,vie,force);
        this.sort = new Sort();
    }

    public Magicien(String image, int vie, int force) {
        super(image,vie,force);
        this.nom = "Wing";
        this.sort = new Sort();
    }

    public Magicien() {
        super();
        this.nom = "Wing";
        this.image = "image1";
        this.vie = 5;
        this.force = 12;
        this.sort = new Sort();

    }
    //Méthodes
    @Override
    public String toString() {
        return "Magicien{" +
                "nom='" + nom + '\'' +
                ", image='" + image + '\'' +
                ", vie=" + vie +
                ", force magic=" + force +
                "," + sort.toString() +
                '}';
    }

    //Getter/Setter

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
//    public  String getSort(){
//        return sort;
//    }
//    public void setSort(String newSort) {
//        this.sort = newSort;
//    }
//    public  String getPhiltre(){
//        return philtre;
//    }
//    public void setPhiltre(String newPhiltre) {
//        this.philtre = newPhiltre;
//    }
}
