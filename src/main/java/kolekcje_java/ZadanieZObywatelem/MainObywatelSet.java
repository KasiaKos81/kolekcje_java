package kolekcje_java.ZadanieZObywatelem;

import java.util.HashSet;
import java.util.Set;

public class MainObywatelSet {

    public static void main(String[] args) {

        Set<Obywatel> obywatelSet = new HashSet<>();

        obywatelSet.add(new Obywatel("Jan", "Kowalski", "1231234"));
        obywatelSet.add(new Obywatel("Marian", "Nowak", "3213214"));
        obywatelSet.add(new Obywatel("Mirek", "Kowalski", "1231254"));
        obywatelSet.add(new Obywatel("Marian", "Roztocki", "1231234"));

        System.out.println("ilość " + obywatelSet.size());
    }
}
