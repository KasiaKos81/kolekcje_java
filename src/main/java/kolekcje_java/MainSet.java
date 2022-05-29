package kolekcje_java;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {
        // List<T> T -> Type
        // Map <key,Value>
        // Set <X>
        // worek elementów
        // polimorfizm -> obiekt jest zadeklarowany pod kilkoma postaciami
        Set<String> zbior = new HashSet<>();
        zbior.add("Polska");
        zbior.add("Czechy");
        zbior.add("Ukraina");
        zbior.add("Niemcy");
        zbior.add("Francja");
        zbior.add("Czechy");
        zbior.add("Polska");
        zbior.add("Czechy");
        zbior.add("Ukraina");
        zbior.add("Polska");
        zbior.add("Czechy");

        // usuwa zduplikowane elementy
        // wyrzuca w losowej kolejnosci
        System.out.println(zbior);

        // dla zbioru nie ma petli for normalnej tylko jest for each

    }
}
