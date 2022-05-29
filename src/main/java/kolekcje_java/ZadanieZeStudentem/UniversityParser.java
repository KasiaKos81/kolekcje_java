package kolekcje_java.ZadanieZeStudentem;

import java.util.Optional;
import java.util.Scanner;

public class UniversityParser {

    private Scanner scanner;
    private University university;

    public UniversityParser(Scanner scanner, University university) {
        this.scanner = scanner;
        this.university = university;
    }

    public void obslugaKomend(){
        String komenda;
        do{
            System.out.println("Podaj komende:");
            komenda = scanner.next();

            if(komenda.equalsIgnoreCase("dodaj")){
                obslugaDodaj();

            } else if (komenda.equalsIgnoreCase("wypisz")) {
                obslugaWypisz();
            } else if (komenda.equalsIgnoreCase("zawiera")){
                obslugaZawiera();
            } else if (komenda.equalsIgnoreCase("znajdz")) {
                obslugaZnajdz();
            } else if (!komenda.equalsIgnoreCase("koniec")){
                System.out.println("wprowadzono niepoprawna komnde");
            }
        } while (!komenda.equalsIgnoreCase("koniec"));

    }
    // handleAddComand
    public void obslugaDodaj() {
        System.out.println("podaj nr indeksu");
        long numerIndeksu = scanner.nextLong();

        if (university.czyZawieraStudenta(numerIndeksu)) {
            System.err.println("Student o tym nr indeksu już istniej");
            return;
        }
        System.out.println("podaj imie");
        String imie = scanner.next();
        System.out.println("podaj nazwisko");
        String nazwisko = scanner.next();

        university.dodaj(numerIndeksu, imie, nazwisko);
    }
        public void obslugaWypisz(){
            university.wypiszWszystkichStudentow();
        }
        public void obslugaZawiera(){
            System.out.println("podaj nr sukanego indeksu");
            long numerIndeksu = scanner.nextLong();
            if(university.czyZawieraStudenta(numerIndeksu)){
                System.out.println("Tak, taki student istnieje");
            } else {
                System.err.println("nie ma takiego studenta");
            }
        }
        public void obslugaZnajdz(){
            System.out.println("podaj nr indeksu");
            long numerIndeksu = scanner.nextLong();

            Optional<Student> szukanyStudent = university.zwrocStudentaOptional(numerIndeksu);
            if (szukanyStudent.isPresent()) {
                Student student = szukanyStudent.get();
                System.out.println("dane studenta: " + student);
            } else {
                System.err.println("nie ma takiego studenta");
            }
        }


    }


