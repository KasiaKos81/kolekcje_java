package kolekcje_java.ZadanieZKontemBankowym;

import kolekcje_java.dziennik.Dziennik;
import kolekcje_java.dziennik.Student;

import java.util.Optional;

public class MainBank {

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.dodajKontoBankowe("1234567");

        Optional<KontoBankowe> optionalKontoBankowe = bank.zwrocKontoBankowe("1234567");
        if(optionalKontoBankowe.isPresent()){
            KontoBankowe kontoBankowe = optionalKontoBankowe.get();
            System.out.println("Istnieje konto bankowe o numerze : " + kontoBankowe.getNumerKonta());
        } else {
            System.err.println("Nie ma konta, Damyt!!!");
        }
        bank.sprawdzStanKonta("1234567");

        bank.zwiekszStanKonta("1234567", 100.0);
        bank.zmniejszStanKonta("1234567", 100.0);
    }

}
