package kolekcje_java.ZadanieZeStudentem;

import java.util.Optional;
import java.util.Scanner;

public class MainParserUniversity {

    public static void main(String[] args) {
        University university = new University();

        Scanner scanner = new Scanner(System.in);
        String komenda;

        do{
            System.out.println("Podaj komende:");
            komenda = scanner.next();

            if(komenda.equals("dodaj")){
                System.out.println("podaj nr indeksu");
                long numerIndeksu = scanner.nextLong();

                if(university.czyZawieraStudenta(numerIndeksu)){
                    System.err.println("Student o tym nr indeksu już istniej");
                    continue;
                }
                System.out.println("podaj imie");
                String imie = scanner.next();
                System.out.println("podaj nazwisko");
                String nazwisko = scanner.next();

                university.dodaj(numerIndeksu, imie, nazwisko);
            } else if (komenda.equalsIgnoreCase("wypisz")) {
                university.wypiszWszystkichStudentow();
            } else if (komenda.equalsIgnoreCase("zawiera")){
                System.out.println("podaj nr sukanego indeksu");
                long numerIndeksu = scanner.nextLong();
                if(university.czyZawieraStudenta(numerIndeksu)){
                    System.out.println("Tak, taki student istnieje");
                } else {
                    System.err.println("nie ma takiego studenta");
                }
            } else if (komenda.equalsIgnoreCase("znajdz")) {
                System.out.println("podaj nr indeksu");
                long numerIndeksu = scanner.nextLong();

                Optional<Student> szukanyStudent = university.zwrocStudentaOptional(numerIndeksu);
                if (szukanyStudent.isPresent()) {
                    Student student = szukanyStudent.get();
                    System.out.println("dane studenta: " + student);
                } else {
                    System.err.println("nie ma takiego studenta");
                }
            } else if (!komenda.equalsIgnoreCase("koniec")){
                System.out.println("wprowadzono niepoprawna komnde");
            }
        } while (!komenda.equalsIgnoreCase("koniec"));
    }
}
