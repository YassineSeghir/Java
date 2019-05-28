package game;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public  void afficherMenus (){
        ArrayList<Personnage> personnages = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int cperso = 0;
        String choix3;

        while (cperso == 0) {

            Personnage perso = create();

            System.out.println("Voullez-vous creer un autre personnage : 0 pour Oui / 1 pour Non");
            choix3 = sc.nextLine();

            if (choix3.equals("0")) {
                System.out.println("Alors on continue");
            } else if (choix3.equals("1")) {
                System.out.println("Ok on passe a la suite");
                cperso = 1;
            } else {
                System.out.println("Hum hesitant");
            }
            personnages.add(perso);
        }

        for (int i = 0; i != personnages.size(); ++i) {
            try {
                System.out.println(i + 1 + " " + personnages.get(i));
            } catch (IndexOutOfBoundsException e){
                System.out.println("Pas de Personnage dans le tableau" +e.getMessage());
            }finally{
                System.out.println("Ok on passe a la suite");
            }
        }
        //        int count = 1;
//        for (Personnage personnage : personnages) {
//            System.out.println(count +""+ personnage);
//            count++;
//        }
//        personnages.forEach(person -> {
//            System.out.println(person.nom);
//        });
        modifierFiche(personnages);
        System.out.println(personnages);
    }




        public  void modifierFiche( ArrayList<Personnage> personnages) {
            int choix;
            int choix1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Voullez-vous modifier une fiche personnage : 0 pour Oui / 1 pour Non ");
            choix = sc.nextInt();
            sc.nextLine();

            if (choix == 0) {
                System.out.println("Veuillez choisir une fiche personnage a modifier ");
                int fiche1 = sc.nextInt();
                sc.nextLine();
                Personnage personnageToChange = personnages.get(fiche1-1);
                System.out.println("Veuillez choisir un nouveau nom ");
                String nom = sc.nextLine();
                personnageToChange.setNom(nom);
                System.out.println("Veuillez choisir une nouvelle image ");
                String image = sc.nextLine();
                personnageToChange.setImage(image);
                System.out.println("Veuillez choisir votre nouvelle stats vie guerrier entre 5-10 magicien entre 3-6 ");
                int vie = sc.nextInt();
                sc.nextLine();
                personnageToChange.setVie(vie);
                System.out.println("Veuillez choisir votre nouvelle stats vie guerrier entre 5-10 magicien entre 8-15 ");
                int force = sc.nextInt();
                sc.nextLine();
                personnageToChange.setForce(force);
                System.out.println("Personnage modifier");
            } else {
                System.out.println("Ok on passe a la suite");
            }

            System.out.println("Voullez-vous supprimer une fiche personnage : 0 pour Oui / 1 pour Non ");
            choix1 = sc.nextInt();
            sc.nextLine();

            if (choix1 == 0) {
                System.out.println("Veuillez choisir une fiche personnage a supprimer ");
                int fiche2 = sc.nextInt();
                sc.nextLine();
                personnages.remove(fiche2-1);
                System.out.println("Personnage supprimer  ");
            }else {
                System.out.println("Ok on passe a la suite");
            }
        }


    public Personnage create() {
        Scanner sc = new Scanner(System.in);
        boolean verif = false;
        Personnage perso = null;

        int choix = 0;
        System.out.println("Bienvenue Aventurier");
        while (!verif) {
            System.out.println("Veuillez choisir un personnage : 0 pour Guerrier / 1 pour Magicien");
            choix = sc.nextInt();
            sc.nextLine();

            if (choix == 0) {
                verif = true;
                System.out.println("Vous avez choisi : Guerrier");
            } else if (choix == 1) {
                verif = true;
                System.out.println("Vous avez choisi : Magicien");
            } else {
                System.out.println("Vous n'avez pas choisi de personnage");
            }
        }

        boolean verif2 = false;
        while (!verif2) {
            System.out.println("Veuillez choisir une fiche personnage : 0  / 1 / 2");
            int choix1 = sc.nextInt();
            sc.nextLine();
            if (choix == 0 && choix1 == 0) {
                verif2 = true;
                System.out.println("Veuillez choisir un nom : ");
                String nom = sc.nextLine();
                System.out.println("Vous avez choisi un nom : " + nom);
                System.out.println("Veuillez choisir une image : ");
                String image = sc.nextLine();
                System.out.println("Vous avez choisi une image : " + image);
                System.out.println("Veuillez choisir une vie comprise entre 5-10 ");
                int vie = sc.nextInt();
                sc.nextLine();
                System.out.println("Vous avez choisi une vie de " + vie);
                System.out.println("Veuillez choisir une force comprise entre 5-10 ");
                int force = sc.nextInt();
                sc.nextLine();
                System.out.println("Vous avez choisi une force  de " + force);
                perso = new Guerrier(nom, image, vie, force);
                System.out.println(perso);
            } else if (choix == 0 && choix1 == 1) {
                verif2 = true;
                System.out.println("Veuillez choisir une image : ");
                String image = sc.nextLine();
                System.out.println("Vous avez choisi une image : " + image);
                System.out.println("Veuillez choisir une vie comprise entre 5-10 ");
                int vie = sc.nextInt();
                sc.nextLine();
                System.out.println("Vous avez choisi une vie de " + vie);
                System.out.println("Veuillez choisir une force comprise entre 5-10 ");
                int force = sc.nextInt();
                sc.nextLine();
                System.out.println("Vous avez choisi une force  de " + force);
                perso = new Guerrier(image, vie, force);
                System.out.println(perso);
            } else if (choix == 0 && choix1 == 2) {
                verif2 = true;
                perso = new Guerrier();
                System.out.println(perso);
            } else if (choix == 1 && choix1 == 0) {
                verif2 = true;
                System.out.println("Veuillez choisir un nom : ");
                String nom = sc.nextLine();
                System.out.println("Vous avez choisi un nom : " + nom);
                System.out.println("Veuillez choisir une image : ");
                String image = sc.nextLine();
                System.out.println("Vous avez choisi une image : " + image);
                System.out.println("Veuillez choisir une vie comprise entre 5-10 ");
                int vie = sc.nextInt();
                sc.nextLine();
                System.out.println("Vous avez choisi une vie de " + vie);
                System.out.println("Veuillez choisir une force comprise entre 5-10 ");
                int force = sc.nextInt();
                sc.nextLine();
                System.out.println("Vous avez choisi une force magic de " + force);
                perso = new Magicien(nom, image, vie, force);
                System.out.println(perso);
            } else if (choix == 1 && choix1 == 1) {
                verif2 = true;
                System.out.println("Veuillez choisir une image : ");
                String image = sc.nextLine();
                System.out.println("Vous avez choisi une image : " + image);
                System.out.println("Veuillez choisir une vie comprise entre 3-6 ");
                int vie = sc.nextInt();
                sc.nextLine();
                System.out.println("Vous avez choisi une vie de " + vie);
                System.out.println("Veuillez choisir une force comprise entre 8-15 ");
                int force = sc.nextInt();
                sc.nextLine();
                System.out.println("Vous avez choisi une force magic de " + force);
                perso = new Magicien(image, vie, force);
                System.out.println(perso);
            } else if (choix == 1 && choix1 == 2) {
                verif2 = true;
                perso = new Magicien();
                System.out.println(perso);
            } else {
                System.out.println("Vous n'avez pas choisi de fiche personnage");
            }

        }
        return perso;
    }
}