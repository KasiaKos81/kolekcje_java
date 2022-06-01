package kolekcje_java.zadanieZeStanemMagazynowym;

import java.util.*;

public class MagazynMain2 {

    public static void main(String[] args) {

        Map<String, StanMagazynowyProduktu> mapaStanu = new HashMap<>();

        Magazyn magazyn = new Magazyn();

        magazyn.dodajProdukt("perfumy", Jednostka.LITR);
        magazyn.dodajProdukt("krem", Jednostka.GRAM);
        magazyn.dodajProdukt("lakierCzerwony", Jednostka.SZTUKA);

        magazyn.wypiszListeProduktow();
        magazyn.usunProdukt("krem");
        Optional <StanMagazynowyProduktu> wynik = magazyn.zwrocProdukt("lakierCzerwony");
        System.out.println(wynik);
        magazyn.zwiekszStanMagazynowy("lakierCzerwony", 20.0);
        magazyn.zwiekszStanMagazynowy("lakierCzerwony", 20.0);
        magazyn.zmniejszStanMagazynowy("lakierCzerwony", 2.0);

        Optional<StanMagazynowyProduktu> optionalStanMagazynowyProduktu = magazyn.zwrocProdukt("lakierCzerwony");
        if (optionalStanMagazynowyProduktu.isPresent()) {
            StanMagazynowyProduktu stanMagazynowyProduktu = optionalStanMagazynowyProduktu.get();

            System.out.println("Stan magazynowy produktu lakier to: " + stanMagazynowyProduktu.getIlosc());
        } else {
            System.out.println("Nie znaleziono produktu");
        }

        List<StanMagazynowyProduktu> listaZakupowa = magazyn.zwrocListe(30);
        System.out.println("Lista zakupowa:");
        for (StanMagazynowyProduktu stanMagazynowyProduktu : listaZakupowa) {
            System.out.println(stanMagazynowyProduktu);
        }
        System.out.println("Ilosc produktow na liscie zakupowej to: " + listaZakupowa.size());
    }
}

