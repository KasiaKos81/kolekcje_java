package kolekcje_java.zadanieZeStanemMagazynowym;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MagazynMain2 {

    public static void main(String[] args) {

        Map<String, StanMagazynowyProduktu> mapaStanu = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        Magazyn magazyn = new Magazyn();

        magazyn.dodajProdukt("perfumy", Jednostka.LITR);
        magazyn.dodajProdukt("krem", Jednostka.GRAM);
        magazyn.dodajProdukt("lakierCzerwony", Jednostka.SZTUKA);

        magazyn.wypiszListeProduktow();
        magazyn.usunProdukt("krem");
        magazyn.zwrocProdukt("lakierCzerwony");
        magazyn.zwiekszStanMagazynowy("lakierCzerwony", 2.0);






}}
