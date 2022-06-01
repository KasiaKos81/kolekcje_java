package kolekcje_java.zadanieZeStanemMagazynowym;

import kolekcje_java.dziennik.Student;

import java.util.*;

public class Magazyn {

    private Map<String, StanMagazynowyProduktu> mapaStanu = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

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
    public void zwiekszStanMagazynowy(String nazwa, double ilosc){
        if(!mapaStanu.containsKey(nazwa)){
            System.out.println("produkt nie istnieje");
            return;
        }
        StanMagazynowyProduktu stanMagazynowyProduktu = mapaStanu.get(nazwa);
        stanMagazynowyProduktu.setIlosc((stanMagazynowyProduktu.getIlosc()) + ilosc);
    }
    public void zmniejszStanMagazynowy(String nazwa, double ilosc){
        if(!mapaStanu.containsKey(nazwa)){
            System.out.println("produkt nie istnieje");
            return;
        }
        double roznicaStanuIlosci = mapaStanu.get(nazwa).getIlosc() - ilosc;
        if (roznicaStanuIlosci < 0){
            System.out.println("za mało produktu");
            return;
        }
        StanMagazynowyProduktu stanMagazynowyProduktu = mapaStanu.get(nazwa);
        stanMagazynowyProduktu.setIlosc((stanMagazynowyProduktu.getIlosc()) - ilosc);

    }

    public void wypiszListeProduktowPoZmianach(){
        System.out.println("Lista produktów :");
        for (StanMagazynowyProduktu produkty : mapaStanu.values()) {
            System.out.println(produkty);
        }
    }
    public List<StanMagazynowyProduktu> zwrocListe(double ilosc) {
        List<StanMagazynowyProduktu> zwracanaLista = new ArrayList<>();
        for (StanMagazynowyProduktu value : mapaStanu.values()) {
            if (value.getIlosc() < ilosc) {
                zwracanaLista.add(value);
            }
        }
        return zwracanaLista;

    }}




