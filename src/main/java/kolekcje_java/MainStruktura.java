package kolekcje_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainStruktura {

    public static void main(String[] args) {

        // mapa: Nazwa kraju -> obiekt z informacjami o Państwie
        Map<String, Panstwo> mapa = new HashMap<>();

        // umieszczenie w mapie elementów
        // poniżej sa dwie opcje stworzenia tego obiektu Panstwo
        Panstwo polskaPanstwo = new Panstwo("Polska", "Warszawa", 3);
        mapa.put("Polska", polskaPanstwo);
        mapa.put("Niemcy", new Panstwo("Niemcy", "Berlin", 5));
        mapa.put("Czechy", new Panstwo("Czechy", "Praga", 1));

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj nazwę kraju");
        String nazwaKraju = scanner.next();

        if (mapa.containsKey(nazwaKraju)) {
            // pobieranie wartości z mapy
            Panstwo obiektPanstwo = mapa.get(nazwaKraju);
            System.out.println("ilosc obywateli: " + obiektPanstwo.getLiczbaLudnosci());
        } else {
            System.err.println("podany kraj nie istnieje");
        }
    }
}

