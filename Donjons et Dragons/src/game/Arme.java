package game;

import java.lang.reflect.Array;

// Create a class
public class  Arme {
    private String [] armes = {"Hache", "Epee", "Lance"};
    private String arme;
    private String bouclier;
    private int armeLevel;

    // Create a class constructor
    public Arme() {
        this.arme = armes[this.getRandom(0,2)];
        this.armeLevel = 7;
        this.bouclier = "bouclier";
    }

    //Getter/Setter
    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    public int getArmeLevel() {
        return armeLevel;
    }

    public void setArmeLevel(int armeLevel) {
        this.armeLevel = armeLevel;
    }

    public String getBouclier() {
        return bouclier;
    }

    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
    }

    //Méthodes
    @Override
    public String toString() {
        return "Arme{" +
                "arme='" + arme + '\'' +
                ", bouclier='" + bouclier + '\'' +
                ", armeLevel=" + armeLevel +
                '}';
    }

    public int getRandom(int min, int max){

        return ((int)(Math.random() * (max - min)) + min);

    }
}
