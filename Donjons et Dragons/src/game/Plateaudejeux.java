package game;

import java.util.ArrayList;

public class Plateaudejeux {
    //attributs
    Cellule[] cellules = new Cellule[64];


    //constructeur

    public Plateaudejeux() {

        for (Cellule cellule : cellules){
            cellule.setEvenement("hello");
        }
    }
    //méthodes

}




