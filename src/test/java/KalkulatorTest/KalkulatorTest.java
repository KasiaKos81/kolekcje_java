package KalkulatorTest;

import kolekcje_java.kalkulatorTest.Kalkulator;
import org.junit.Assert;
import org.junit.Test;

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
    @Test
    public void test_dodaj_2_2() {
        // preparation
        Kalkulator obiektTestowy = new Kalkulator();
        int expectedResult = 7;

        // act // działanie
        int result = obiektTestowy.dodaj(2147483647, 2);

        // weryfikacja
        Assert.assertEquals(-2147483647, result);
    }

    @Test
    public void test_dodaj_2_2_2() {
        // preparation
        Kalkulator obiektTestowy = new Kalkulator();
        int expectedResult = 7;

        // act // działanie
        int result = obiektTestowy.dodaj(5, 2);

        // weryfikacja
        Assert.assertEquals(expectedResult, result);
    }

}

