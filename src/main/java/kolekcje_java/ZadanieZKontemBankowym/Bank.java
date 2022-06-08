package kolekcje_java.ZadanieZKontemBankowym;

import kolekcje_java.zadanieZeStanemMagazynowym.StanMagazynowyProduktu;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Bank {

    private Map<String, KontoBankowe> mapaKont = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    public void dodajKontoBankowe(String numerKonta) {
        if (mapaKont.containsKey(numerKonta)) {
            System.err.println("Konto o podanym numerze już istanieje");
        } else {
            mapaKont.put(numerKonta, new KontoBankowe(numerKonta));
        }
    }
    public Optional<KontoBankowe> zwrocKontoBankowe(String numerKonta) {
        if (mapaKont.containsKey(numerKonta)) {
            System.out.println("Istnieje konto o numerze: " + numerKonta);
            return Optional.of(mapaKont.get(numerKonta));
        } else {
            System.err.println("Nie ma konta Damyt!!!");
            return Optional.empty();
        }
    }

    public Double sprawdzStanKonta(String numerKonta) {
        if (!mapaKont.containsKey(numerKonta)) {
            System.out.println("Nie ma konta, Damyt!!!");
            return null;
        } else {
            KontoBankowe stanKontaBankowego = mapaKont.get(numerKonta);
            double stan = stanKontaBankowego.getStanKonta();
            System.out.println("Stan konta to: " + stan);
            return stan;
        }
    }

    public void zwiekszStanKonta(String numerKonta, double stanKonta) {
        if (!mapaKont.containsKey(numerKonta)) {
            System.out.println("Nie ma konta, Damyt!!!");
            return;
        }
        KontoBankowe stanKontaBankowego = mapaKont.get(numerKonta);
        stanKontaBankowego.setStanKonta((stanKontaBankowego.getStanKonta()) + stanKonta);
        System.out.println("Stan konta po zwiększeniu to: " + stanKonta);
    }

    public void zmniejszStanKonta(String numerKonta, double stanKonta) {
        if (!mapaKont.containsKey(numerKonta)) {
            System.out.println("Nie ma konta, Damyt!!!");
            return;
        }
        KontoBankowe stanKontaBankowego = mapaKont.get(numerKonta);
        stanKontaBankowego.setStanKonta((stanKontaBankowego.getStanKonta()) - stanKonta);
        System.out.println("Stan konta po zmniejszeniu to: " + stanKonta);
    }
}
