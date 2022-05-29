package kolekcje_java.ZadanieZeStudentem;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainMapaStudent2 {

    public static void main(String[] args) {

        Map<Long, Student> mapa = new TreeMap<>();

        mapa.put(123456L, new Student(123456L, "Lorek", "Kot"));
        mapa.put(987654L, new Student(987654L, "Bella", "Kotka"));
        mapa.put(100200L, new Student(100200L, "Ziaja", "Koteczka"));
        mapa.put(100400L, new Student(100400L, "Bolek", "Kot"));

        System.out.println("rozmiar " + mapa.size());
        System.out.println("Student 100400 to " + mapa.get(100400L));

        Long numerIndeksu = 100200L;
        if (mapa.containsKey(numerIndeksu)) {
            // pobieranie wartości z mapy
            Student obiektStudent = mapa.get(numerIndeksu);
            System.out.println("jest student 100200L: " + obiektStudent.getNumerIndeksu());
        } else {
            System.err.println("goście nie ma");
        }
        System.out.println("mapa: " + mapa);

        // mapa iteracja
        // 1. klucze
        // 2. wartosci
        // pary Klucz-Wartosc - entry - wpis/element/rekord
 // klucze
        System.out.println("klucze: ");
        for (Long indeks : mapa.keySet()) {
            System.out.println(indeks + " ");
        }
        // wartosci
        for (Student value : mapa.values()) {
            System.out.println(value + "");
        }

        // pary
        for (Map.Entry<Long, Student> longStudentEntry : mapa.entrySet()) {
            System.out.println(longStudentEntry + " ");
        }
        // pary z wpisem
        for (Map.Entry<Long, Student> wpis : mapa.entrySet()) {
            System.out.println(wpis.getKey() + "->" + wpis.getValue());

        }


    }

    }

