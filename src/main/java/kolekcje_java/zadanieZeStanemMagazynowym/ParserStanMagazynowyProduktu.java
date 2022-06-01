package kolekcje_java.zadanieZeStanemMagazynowym;

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
            System.out.println("podaj polecenie: dodaj, wypisz, zwroc, usun, zwieksz, zmniejsz lub podaj 'quit' by zakonczyc");
            polecenie = scanner.next();
            switch (polecenie){
                case "dodaj":
                    obslugaPoleceniaDodaj();
                    break;
                case "wypisz":
                    magazyn.wypiszListeProduktow();
                    break;
                case "zwroc":



            }
        }  while (!polecenie.equalsIgnoreCase("quit"));
    }
    public void obslugaPoleceniaDodaj(){
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
}}
