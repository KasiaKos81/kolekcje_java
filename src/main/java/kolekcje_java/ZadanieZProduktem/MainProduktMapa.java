package kolekcje_java.ZadanieZProduktem;

import kolekcje_java.ZadanieZeStudentem.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MainProduktMapa {

    public static void main(String[] args) {

        Map<String, Produkt> mapa = new HashMap<>();

        mapa.put("wodka", new Produkt("wodka", 50.0, 5, "40404040"));
        mapa.put("sokPomaranczowy", new Produkt("sokPomaranczowy", 5.0, 10, "789"));
        mapa.put("ogorekKiszony", new Produkt("ogorekKiszony", 9.0, 30, "123"));

        System.out.println("wszystkie produkty " + mapa);

        Scanner scanner = new Scanner(System.in);
        String komenda;
        do {
            System.out.println("Podaj komende: dodaj, usun, sprawdz, wpisz 'koniec' jesli chcesz wyjsc");
            komenda = scanner.next();

            if (komenda.equalsIgnoreCase("dodaj")) {
                System.out.println("Podaj nazwe:");
                String nazwa = scanner.next();

                if(mapa.containsKey(nazwa)){
                    System.err.println("produkt o podanej nazwie już istnieje");
                    continue; // rozpoczyna pętlę od nowa
                }
                System.out.println("Podaj cene");
                double cena = scanner.nextDouble();
                System.out.println("Podaj ilość");
                int ilosc = scanner.nextInt();
                System.out.println("podaj kod");
                String kod = scanner.next();

                Produkt p = new Produkt(nazwa, cena, ilosc, kod);
                // TODO: sprawdzic czy produkt nie istnieje i tylko wtedy dodac
                mapa.put(nazwa, p);

            }else if (komenda.equalsIgnoreCase("sprawdz")) {
                System.out.println("podaj nazwę produktu");
                String nazwa = scanner.next();

                if (mapa.containsKey(nazwa)) {
                    // pobieranie wartości z mapy
                    Produkt obiektProdukt = mapa.get(nazwa);
                    System.out.println("są produkty " + obiektProdukt.getNazwa() + " jest ich " + obiektProdukt.getIlosc());
                } else {
                    System.err.println("zayebali, nie ma");
                }
            } else if (komenda.equalsIgnoreCase("usun")) {
                System.out.println("podaj nazwę produktu do wywalenia");
                String nazwaProduktuDoWywalenia = scanner.next();
                if (mapa.containsKey(nazwaProduktuDoWywalenia)) {
                    Produkt obiektProdukt = mapa.remove(nazwaProduktuDoWywalenia);
                    System.out.println("wywalony produkt to " + obiektProdukt);
                } else {
                    System.err.println("juz wczesniej zayebali");
                }
            }
        }while (!komenda.equalsIgnoreCase("koniec"));
    }
}
