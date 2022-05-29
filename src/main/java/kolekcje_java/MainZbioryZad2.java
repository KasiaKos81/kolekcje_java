package kolekcje_java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainZbioryZad2 {

    public static void main(String[] args) {

        Set<Integer> liczby = new TreeSet<>(Arrays.asList(10, 12, 10, 3, 4, 12, 12, 300, 12, 40, 55));

        System.out.println("rozmiar " + liczby.size());

        for (Integer integerLiczby : liczby) {
            System.out.println(integerLiczby);
        }

        System.out.println("------------------------------");
        liczby.remove(10);
        liczby.remove(12);

        System.out.println("-------------------------------");

        System.out.println("rozmiar " + liczby.size());

        for (Integer integerLiczby : liczby) {
            System.out.println(integerLiczby);
        }

    }

    }

