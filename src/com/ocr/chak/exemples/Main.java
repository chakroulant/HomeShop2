package com.ocr.chak.exemples;

public class Main {

    public static void main(String[] args) {

        Four grandFour = new Four();
        grandFour.getCapacite() = 55;
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