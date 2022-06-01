package kolekcje_java.sklepInternetowy;

import lombok.Data;

@Data
public class Produkt {

    // static oznacza globalne a nie per obiekt
    // static jedna zmienna na cały program a nie pre obiekt

    private static int LICZNIK_PRODUKTOW = 1;

    private String nazwa;
    private String identyfikator; // random
    private double cena;
    private KategoriaProduktu kategoria;
    private StanOferty stanOferty;

    public Produkt(String nazwa, double cena, KategoriaProduktu kategoria) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        this.stanOferty = StanOferty.NA_SPRZEDAZ;

        this.identyfikator = "" + (LICZNIK_PRODUKTOW++); // incremental static id
       // System.out.println(this.identyfikator);

    }
}
