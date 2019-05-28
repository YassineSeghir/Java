package game;

public class Monstre extends Evenement {
    //attributs
    private String nom;
    private int vie;
    private int force;

    //constructeur
    public Monstre(String nom , int vie , int force) {
        this.nom = nom;
        this.vie = vie;
        this.force = force;
    }
    //méthodes

}
