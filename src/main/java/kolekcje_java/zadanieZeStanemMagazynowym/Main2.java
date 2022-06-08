package kolekcje_java.zadanieZeStanemMagazynowym;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Magazyn magazyn = new Magazyn();

        ParserStanMagazynowyProduktu parserStanMagazynowyProduktu = new ParserStanMagazynowyProduktu(magazyn, scanner);

        parserStanMagazynowyProduktu.ogarnij();
    }
}
