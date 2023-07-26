package cohort2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        /** System.out.println("Bienvenu a IMMOCAM. Bien vouloir faire son choix ");
         System.out.println("1- Chambre");
         System.out.println("2- Studio");
         System.out.println("3- Appartement 2 chambres");
         System.out.println("4- Appartement 3 chambres");
         System.out.println("5- Villa ");
         System.out.println("6- Duplexes");**/

        String[] menu = {"Accueil","Nos Produits","Nous contacter","A propos"};
        String[] nosProduits = {"Chambre", "Studios","Appartements","Villa","Duplexes"};
        System.out.println("\t ==================================================================");
        System.out.println("\t :::::::::::: Application de Gestion d'agence Immobiliere :::::::::");
        System.out.println("\t ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("\t :::::::::::::::::::::::::::    MENU   ::::::::::::::::::::::::::::");
        System.out.println("\t ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("\t ==================================================================");
        System.out.println("\n\t 1️⃣ - Accueil");
        System.out.println("\t 2️⃣ - Nos Produits");
        System.out.println("\t 3️⃣ - Nous contacter");
        System.out.println("\t 4️⃣ - A propos");
        System.out.print("\n\t \uD83D\uDE00 Votre choix : ");
        System.out.print("\n\n");


        System.out.print("Veillez entrer votre choix : ");

        int choix = sc.nextInt();
        if (choix==1)
            System.out.println("\n\t Vous avez choisi de consulter le Menu: Acceuil :" );
        else if (choix==2){
            System.out.println("\n\t Bien vouloir faire le choix parmis les propositions suivantes:" );
            System.out.println("1- Chambre");
            System.out.println("2- Studio");
            System.out.println("3- Appartement 2 chambres");
            System.out.println("4- Appartement 3 chambres");
            System.out.println("5- Villa ");

            int choix2 = sc.nextInt();
            if (choix2 == 1)
                System.out.println("\n\t Des Chambres Spacieuses vous attendent" );
            else if (choix2==2)
                System.out.println("\n\t Des beaux studios disponibles :" );
            else if (choix2==3)
                System.out.println("\n\t appartements disponibles :" );
            else if (choix2==4)
                System.out.println("\n\t Appartements 3 chambres disponibles :" );
            else if (choix2==5)
                System.out.println("\n\t Villas luxieuses disponibles :" );
        }
        else if (choix == 3)
            System.out.println("\n\t Vous avez choisi de consulter le Menu: Nous contacter :" );
        else if (choix==4)
            System.out.println("\n\t Vous avez choisi de consulter le Menu: A propos :" );




    }
}
