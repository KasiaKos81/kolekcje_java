package kolekcje_java.zadanieZeStanemMagazynowym;

import kolekcje_java.dziennik.Student;

import java.util.Optional;
import java.util.Scanner;

public class ParserStanMagazynowyProduktu {

    private final Magazyn magazyn;
    private final Scanner scanner;

    public ParserStanMagazynowyProduktu(Magazyn magazyn, Scanner scanner) {
        this.magazyn = magazyn;
        this.scanner = scanner;
    }
    public void ogarnij(){
        String polecenie;

        do {
            System.out.println("podaj polecenie: dodaj, wypisz, zwrocProdukt, usun, zwieksz, zmniejsz lub podaj 'quit' by zakonczyc");
            polecenie = scanner.next();
            switch (polecenie){
                case "dodaj":
                    obslugaPoleceniaDodaj();
                    break;
                case "wypisz":
                    magazyn.wypiszListeProduktow();
                    break;
                case "zwrocProdukt":
                    obslugaPoleceniaZwrocProdukt();
                    break;
                case "usun":
                    obslugaPoleceniaUsun();
                    break;
                case "zwieksz":
                    obslugaPoleceniaZwieksz();
                    break;

            }
        }  while (!polecenie.equalsIgnoreCase("quit"));
    }
    public void obslugaPoleceniaDodaj() {
        System.out.println("podaj nazwę");
        String nazwa = scanner.next();

        System.out.println("podaj jednostkę");
        try {
            System.out.println("podaj jednostkę produktu GRAM/LITR/SZTUKA");
            Jednostka jednostka = Jednostka.valueOf(scanner.next().toUpperCase());
            magazyn.dodajProdukt(nazwa, jednostka);
        } catch (IllegalArgumentException iae) {
            System.out.println("Nie ma takiej jednostki");
        }
    }
    public void obslugaPoleceniaZwrocProdukt(){
        System.out.println("Podaj nazwę produktu");
        String nazwa = scanner.next();
        Optional<StanMagazynowyProduktu> zwroconyProdukt = magazyn.zwrocProdukt(nazwa);
        if(zwroconyProdukt.isPresent()){
            StanMagazynowyProduktu stanMagazynowyProduktu = zwroconyProdukt.get();
            System.out.println("Jest taki produkt jak: " + stanMagazynowyProduktu);
        }else{
            System.out.println("Nie ma, bo nie");
        }
    }
    public void obslugaPoleceniaUsun(){
        System.out.println("Podaj nazwę produktu");
        String nazwa = scanner.next();
        magazyn.usunProdukt(nazwa);
    }
    public void obslugaPoleceniaZwieksz(){
        System.out.println("Podaj nazwę produktu");
        String nazwa = scanner.next();
        System.out.println("Podaj Ilość");
        double ilosc = scanner.nextDouble();
        magazyn.zwiekszStanMagazynowy(nazwa, ilosc);
    }
    }


