package kolekcje_java.kalkulatorTest;

public class Kalkulator {
    private int ostatniWynik =0;

    public int dodaj(int a, int b){
        ostatniWynik = a+b;
        return ostatniWynik;
    }
    public int getOstatniWynik(){
        return ostatniWynik;
    }


}
