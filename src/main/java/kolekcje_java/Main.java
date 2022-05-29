package kolekcje_java;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // typ generyczny to typ, w którym mówimy jakiego rodzaju obiekty będzie przechowywać

      //  Lista<String> lista;
        // mapa ma klucze
        // mapa Nazwa Kraju -> Nazwa Stolicy
        Map<String, String> mapa = new HashMap<>();
        // umieszczenie w mapie elementów
        mapa.put("Polska", "Warszawa");
        mapa.put("Niemcy", "Berlin");
        mapa.put("Czechy", "Praga");
        // pobieranie wartości z mapy
        String stolicaPolski = mapa.get("Polska");
    }

}
