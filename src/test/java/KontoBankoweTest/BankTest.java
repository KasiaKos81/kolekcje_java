package KontoBankoweTest;

import kolekcje_java.ZadanieZKontemBankowym.Bank;
import kolekcje_java.ZadanieZKontemBankowym.KontoBankowe;
import kolekcje_java.dziennik.Dziennik;
import kolekcje_java.dziennik.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class BankTest {

    @Test

    public void test_dodanieNowegoKonta(){
        Bank bank = new Bank();
        bank.dodajKontoBankowe("1234567");
        Optional<KontoBankowe> kontoBankoweOptional = bank.zwrocKontoBankowe("1234567");
        Assert.assertTrue(kontoBankoweOptional.isPresent());
    }

    @Test
    public void test_sprawdzenieStanuKonta(){
        Bank bank = new Bank();

    }
}
