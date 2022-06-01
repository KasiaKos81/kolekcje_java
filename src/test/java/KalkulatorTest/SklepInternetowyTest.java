package KalkulatorTest;

import kolekcje_java.sklepInternetowy.KategoriaProduktu;
import kolekcje_java.sklepInternetowy.Market;
import kolekcje_java.sklepInternetowy.Produkt;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SklepInternetowyTest {

    // Mock - obiekt klasy który zachowuje się dokładnie tak jak mu powiemy
    // Mockito - framework
    // magazyn.JakktosWywolaFunkcje(x).Zwroc(y)
    //
    // możliwe jest dodawanie produktów do sklepu
    // możliwe jest dodawanie prouktów do sklepu jeżeli nazwa sie nie powtarza

    @Test
    public void test_dodajProdukt(){
        Market market = new Market();
        market.dodajProdukt("test", 10.0, KategoriaProduktu.MEBLE);

        boolean czyJest = market.sprawdzCzyJestProdukt("test");
        Assert.assertTrue("Market powinien dodać produkt 'test'", czyJest);
    }

    @Test
    public void test_dodajDwaTakieSameProduktyNiePowinnoDzialac(){
        Market market = new Market();
        market.dodajProdukt("test", 10.0, KategoriaProduktu.MEBLE);
        market.dodajProdukt("test", 15.0,KategoriaProduktu.SAMOCHODY);

        List<Produkt> listaProduktow = market.zwrocWszystkieProdukty();

       // boolean czyJest = market.sprawdzCzyJestProdukt("test");
        Assert.assertEquals("Market powinien dodać produkt",1, listaProduktow.size());
    }

    // możliwe jest zwrócenie listy dostępnych produktów
    // możliwe jest zwrocenie listy sprzedanych produktów

    @Test
    public void test_mozliweJestZwrocenieWszystkichSprzedanychProduktow(){
        Market market = new Market();
        market.dodajProdukt("test1", 10.0, KategoriaProduktu.MEBLE);
        market.dodajProdukt("test2", 11.0, KategoriaProduktu.MEBLE);
        market.dodajProdukt("test3", 10.0, KategoriaProduktu.MEBLE);
        market.dodajProdukt("test4", 10.0, KategoriaProduktu.MEBLE);

        List<Produkt> listaProduktowWszystkich = market.zwrocWszystkieProdukty();
        Assert.assertEquals("Market powinien mieć 4 produkty", 4, listaProduktowWszystkich.size());

        List<Produkt> listaProduktowSprzedanych = market.zwrocWszystkieProduktyNiedostepne();
        Assert.assertEquals("Market nie powinien mieć produktów sprzedanych", 0, listaProduktowSprzedanych.size());

        market.kupProdukt("test1");
        market.kupProdukt("test2");

        listaProduktowWszystkich = market.zwrocWszystkieProdukty();
        Assert.assertEquals("Market powinien mieć 4 produkty", 4, listaProduktowWszystkich.size());

        listaProduktowSprzedanych = market.zwrocWszystkieProduktyNiedostepne();
        Assert.assertEquals("Market powinien mieć 2 sprzedane produkty", 2, listaProduktowSprzedanych.size());
    }

    // możliwoe jest kupienie produktu
    // po wykupieniu produktu nie powinien byc zwracany na liscie dostepnych produktow
}

