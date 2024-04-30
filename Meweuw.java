package org.example;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static List<Double> quitance = new ArrayList<Double>();

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Je suis Meweuw, la version java de Barboxx !\nQue voulez-vous boire ?:");
        commande();
    }

    static void commande() throws InterruptedException {
        String boissons = new Scanner(System.in).next().toString();
        if (boissons.equals("café")){
            System.out.println("Quelle sorte de café voulez-vous ?:");
            String café = new Scanner(System.in).next().toString();
            if (café.equals("cappucino")){
                System.out.println("Combien en voulez-vous ?:");
                int cappucino = new Scanner(System.in).nextInt();
                ajoute(2.5 * cappucino);
                System.out.println("Attendez quelques instants, je prépare votre commande...");
                TimeUnit.SECONDS.sleep(10);
                System.out.println("Voici votre commande !");
                calculerPrix();
            }
            if (café.equals("expresso")) {
                System.out.println("Combien en voulez-vous ?:");
                int expresso = new Scanner(System.in).nextInt();
                ajoute(2.5 * expresso);
                System.out.println("Attendez quelques instants, je prépare votre commande...");
                TimeUnit.SECONDS.sleep(10);
                System.out.println("Voici votre commande !");
                System.out.println("Voulez-vous autre chose ?:");
                String boisson = new Scanner(System.in).next().toString();
            }
            else {
                System.out.println("Je suis désolé, Nous n'avons pas cela");
            }
        }
        if (boissons.equals("thé")){
            System.out.println("Quelle sorte de thé voulez-vous ?:");
            String thé = new Scanner(System.in).next().toString();
            if (thé.equals("vert")) {
                System.out.println("Combien en voulez-vous ?:");
                int thé_vert = new Scanner(System.in).nextInt();
                System.out.println("Attendez quelques instants, je prépare votre commande...");
                TimeUnit.SECONDS.sleep(10);
                System.out.println("Voici votre commande !");
                System.out.println("Voulez-vous autre chose ?:");
                String boisson = new Scanner(System.in).next().toString();
            }
            if (thé.equals("thé noir")){
                System.out.println("Combien en voulez-vous ?:");
                int thé_noir = new Scanner(System.in).nextInt();
                System.out.println("Attendez quelques instants, je prépare votre commande...");
                TimeUnit.SECONDS.sleep(10);
                System.out.println("Voici votre commande !");
                calculerPrix();
            }
            else {
                System.out.println("Je suis désolé, Nous n'avons pas cela");
            }
        }
        else {
            System.out.println("Je suis désolé, Nous n'avons pas cela");
        }
        calculerPrix();
    }

    static void ajoute(Double prix) {
        quitance.add(prix);
    }

    void afficheQuitance() {
        System.out.println(quitance);
    }
    static void calculerPrix() throws InterruptedException {
        System.out.println("Voulez-vous autre chose ?:");
        if (new Scanner(System.in).next().toString().equals("oui")){
            System.out.println("Que voulez-vous boire ?:");
            commande();
        }
        else {
            System.out.println("Merci de votre visite ! Cela fera "+quitance+" francs");
            System.exit(0);
        }
    }
}
