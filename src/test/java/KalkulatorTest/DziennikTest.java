package KalkulatorTest;

import kolekcje_java.dziennik.Dziennik;
import kolekcje_java.dziennik.Student;
import kolekcje_java.sklepInternetowy.Produkt;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class DziennikTest {

    @Test
    public void test_dodaniePawlaGawla(){
        Dziennik dziennik = new Dziennik();
        dziennik.dodajStudenta("123", "Pawel", "Gawel");
        Optional<Student> studentOptional = dziennik.zwrocStudenta("123");
        Assert.assertTrue(studentOptional.isPresent());
    }

    @Test
    public void test_dodanieGawlaPawla(){
        Dziennik dziennik = new Dziennik();
        dziennik.dodajStudenta("333", "Gawel", "Pawel");
        Optional<Student> studentOptional = dziennik.zwrocStudenta("333");
        Assert.assertTrue(studentOptional.isPresent());
    }
    @Test
    public void test_dodanieGawlaPawlaPawlaGawla() {
        Dziennik dziennik = new Dziennik();
        dziennik.dodajStudenta("333", "Gawel", "Pawel");
        Optional<Student> studentGawelOptional = dziennik.zwrocStudenta("333");
        Assert.assertTrue(studentGawelOptional.isPresent());
        dziennik.dodajStudenta("123", "Pawel", "Gawel");
        Optional<Student> studentPawelOptional = dziennik.zwrocStudenta("123");
        Assert.assertTrue(studentPawelOptional.isPresent());
    }
}
