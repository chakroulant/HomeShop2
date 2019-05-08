package com.ocr.chak.miam;

public class Main {

    public static void main(String[] args) {

        com.ocr.chak.miam.Four grandFour = new com.ocr.chak.miam.Four();
        grandFour.capacite = 55;
        grandFour.puissance = 260;

        com.ocr.chak.miam.Aliment cake = new com.ocr.chak.miam.Aliment();
        cake.nom = "cake à la banane";
        cake.estCuit = false;
        cake.manger();
        System.out.println("");
        grandFour.cuire(cake);
        System.out.println("");
        cake.manger();

    }
}