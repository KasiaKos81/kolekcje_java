package kolekcje_java;

// Utwórz klasę ParaLiczb, klasa powinna posiadać pole
//int a;
//int b;
//konstruktor pełny
//gettery i settery
//toString
//Stwórz Main a w nim kilka instancji klasy ParaLiczb: {(1,2), (2,1), (1,1), (1,2)}.
//Wyświetl wszystkie elementy zbioru na ekran. Czy program działa zgodnie z oczekiwaniem?

import java.util.HashSet;
import java.util.Set;

public class MainParaLiczb {

    public static void main(String[] args) {

        ParaLiczb p1 = new ParaLiczb(1,2);
        ParaLiczb p2 = new ParaLiczb(2,1);
        ParaLiczb p3 = new ParaLiczb(1,1);
        ParaLiczb p4 = new ParaLiczb(1,2);

        Set<ParaLiczb> zbiorParaLiczb = new HashSet<>();

        zbiorParaLiczb.add(p1);
        zbiorParaLiczb.add(p2);
        zbiorParaLiczb.add(p3);
        zbiorParaLiczb.add(p4);

        System.out.println("ilość " + zbiorParaLiczb.size());

        // po dodaniu w klasie metody override equals to z size znikaja duplikaty
        // bo java domyślnie używa dla porównania znaków == i musimy to zmienić na equals, żeby
        // porównać treść obiektów w środku




    }
}
