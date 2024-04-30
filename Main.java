package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Entrez une année : ");
        Bissextile bissextile = new Bissextile();
        int annee = new Scanner(System.in).nextInt();
        boolean estBissextile = bissextile.estBissextile(annee);
        if(estBissextile){
            System.out.println(annee + " est une année bissextile");
        } else {
            System.out.println(annee + " n'est pas une année bissextile");
        }

    }
}
