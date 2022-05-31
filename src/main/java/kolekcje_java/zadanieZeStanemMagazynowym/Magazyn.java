package kolekcje_java.zadanieZeStanemMagazynowym;

import kolekcje_java.dziennik.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Magazyn {

    private Map<String, StanMagazynowyProduktu> mapaStanu = new HashMap<>();

    public void dodajProdukt(String nazwa, Jednostka jednostka){
        if(mapaStanu.containsKey(nazwa)){
            System.err.println("Produkt o podanej nazwie już istnieje");
        } else {
            mapaStanu.put(nazwa, new StanMagazynowyProduktu(nazwa, 0.0, jednostka));
        }
    }
    public void wypiszListeProduktow(){
        System.out.println("Lista produktów :");
        for (StanMagazynowyProduktu produkty : mapaStanu.values()) {
            System.out.println(produkty);
        }
    }
    public void usunProdukt(String nazwa){
        if(mapaStanu.containsKey(nazwa)){
            mapaStanu.remove(nazwa);
            System.out.println("Usunięto produkt o nazwie: " + nazwa);
        } else {
            System.err.println("Taki produkt nie istnieje");
        }
    }
    public Optional<StanMagazynowyProduktu> zwrocProdukt(String nazwa){
        if(mapaStanu.containsKey(nazwa)){
            System.out.println("Jest taki produkt w magazynie: " + nazwa);
            return Optional.of(mapaStanu.get(nazwa));
        } else {
            System.err.println("brak takiego produktu w magazynie");
            return Optional.empty();
        }
    }
    public Optional<StanMagazynowyProduktu> zwiekszStanMagazynowy(String nazwa, double ilosc){
        if(mapaStanu.containsKey(nazwa)){
            StanMagazynowyProduktu stanMagazynowyProduktu = mapaStanu.get(nazwa);
            stanMagazynowyProduktu.setIlosc(stanMagazynowyProduktu.getIlosc() + ilosc);
            return Optional.of(mapaStanu.get(nazwa));
        } else {
            System.out.println("nie ma takiego produktu");
            return Optional.empty();
        }
    }



}
