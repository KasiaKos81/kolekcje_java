package KalkulatorTest;

import kolekcje_java.kalkulatorTest.Kalkulator;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@Log

public class KalkulatorTest {

    //   public boolean czyDziala(int a, int b, int expectedResult) {
    // preparation
    //  Kalkulator obiektTestowany = new Kalkulator();

    // act / działanie
    // dla pewnych danych wejściowych
    // powinniśmy otrzymać pewne dane wyjściowe => wynik
    //int result = obiektTestowany.dodaj(a, b);

    // weryfikacja
    // return result == expectedResult;
//        if (result == expectedResult){
//            return true;
//        }else{
//            return false;
//        }
    //      }
    private static Kalkulator obiektTestowany;

    // BeforeAll
    @BeforeClass
    public static void beforeClass() throws Exception {
        log.info("beforeClass log");
        obiektTestowany = new Kalkulator();
    }
    @Test
    public void test_naPoczatkuKalkulatorwracaWynik0(){
        obiektTestowany = new Kalkulator();
        int wynik = obiektTestowany.getOstatniWynik();
        Assert.assertEquals("kalkulator powinien zwrócic wynik 0 jesli nie robiliśmy wcześniej zadań", 0, wynik);
    }
    @Test
    public void test_zwracaOstatniWynikPoWykonaniuDzialania(){
        int wynik = obiektTestowany.dodaj(1,1);
        Assert.assertEquals("kalkulator powinien zwrócic wynik działania 1+1", 2, wynik);
        int ostatniWynik = obiektTestowany.getOstatniWynik();
        Assert.assertEquals("kalkulator powinien zwrócić wynik ostatniego działania 1+1",wynik, ostatniWynik);
    }

    @Test
    public void test_dodaj_2_2() {
        log.info("test_dodaj_2_2 log");
        // act / działanie
        int result = obiektTestowany.dodaj(5, 2);

        // weryfikacja / assertion
        Assert.assertEquals(7, result);
    }

    @Test
    public void test_dodaj_maxInt_2() {
        log.info("test_dodaj_maxInt_2 log");
        // act / działanie
        int result = obiektTestowany.dodaj(2147483647, 2);

        // weryfikacja / assertion
        Assert.assertEquals(-2147483647, result);
    }

    // AfterAll
    @AfterClass
    public static void afterClass() throws Exception {
        log.info("afterClass log");
    }
}