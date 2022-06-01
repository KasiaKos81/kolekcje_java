package kolekcje_java.zadanieZeStanemMagazynowym;

import java.util.Objects;

public class StanMagazynowyProduktu {

    private String nazwa;
    private double ilosc;
    private Jednostka jednostka;

    public StanMagazynowyProduktu(String nazwa, double ilosc, Jednostka jednostka) {
        this.nazwa = nazwa;
        this.jednostka = jednostka;
      //  this.ilosc = 0.0;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getIlosc() {
        return ilosc;
    }

    public void setIlosc(double ilosc) {
        this.ilosc = ilosc;
    }

    public Jednostka getJednostka() {
        return jednostka;
    }

    public void setJednostka(Jednostka jednostka) {
        this.jednostka = jednostka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StanMagazynowyProduktu that = (StanMagazynowyProduktu) o;
        return Double.compare(that.ilosc, ilosc) == 0 && Objects.equals(nazwa, that.nazwa) && jednostka == that.jednostka;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, ilosc, jednostka);
    }

    @Override
    public String toString() {
        return "StanMagazynowyProduktu{" +
                "nazwa='" + nazwa + '\'' +
                ", ilosc=" + ilosc +
                ", jednostka=" + jednostka +
                '}';
    }
}
