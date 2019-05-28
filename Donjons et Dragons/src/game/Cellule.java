package game;


public class Cellule extends Evenement {
    //attributs
    private String evenement;
   Parchemin[] parchemins = new Parchemin[4];
    Monstre[] monstres = new Monstre[4];

    //constructeur

    public Cellule(String evenement) {
        this.evenement = evenement  ;
        this.parchemins[0]=new Parchemin("Parchemin rouge","vie");
        this.parchemins[1]=new Parchemin("Parchemin bleu" ,"force");
        this.parchemins[2]=new Parchemin("Parchemin vert","vie");
        this.parchemins[3]=new Parchemin("Parchemin jaune","force");

        this.monstres[0]= new Monstre("Goblin",4 , 2);
        this.monstres[1]= new Monstre("Orc",6 , 4);
        this.monstres[2]= new Monstre("Ogre", 8 , 6);
        this.monstres[3]= new Monstre("Dragon", 12 , 10);

    }

    //méthodes

    public void setEvenement(String evenement) {
        this.evenement = evenement;
    }

    public int getRandom(int min, int max){

        return ((int)(Math.random() * (max - min)) + min);

    }
}


