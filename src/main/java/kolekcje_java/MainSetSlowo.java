package kolekcje_java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainSetSlowo {

    // Stwórz Main'a (MainSetSlowa) użytkownik ma wpisać jedną linię tekstu ze scannera:
    //wczytaj linię tekstu
    //podziel linię na słowa
    //wypisz unikalne słowa wpisane przez użytkownika
    //wypisz unikalne litery wpisane przez użytkownika

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst");
        String tekstWpisany = scanner.nextLine();
        String tekstBezPrzecinkow = tekstWpisany.replaceAll(",", "");
        String tekstBezPrzecinkowIKropek = tekstBezPrzecinkow.replaceAll("[.]", "");
        String[] tablicaSlow = tekstBezPrzecinkowIKropek.split(" ");
        Set<String> zbiorSlow = new HashSet<>(Arrays.asList(tablicaSlow));

        System.out.println(zbiorSlow);





    }
}
