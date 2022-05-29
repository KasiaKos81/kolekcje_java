package kolekcje_java.dziennik;

// Zadanie Dziennik Elektroniczny
//Stwórz aplikację, a w niej klasę Dziennik i student . Stwórz również klasę Student. Klasa
//Student powinna:
//- posiadać listę ocen studenta (List<Double>)
//- posiadać (pole) numer indeksu studenta (String)
//- posiadać (pole) imię studenta
//- posiadać (pole) nazwisko studenta
//Klasa Dziennik powinna:
//- posiadać (jako pole) mapę Studentów.
//- posiadać metodę 'dodajStudenta(Student):void' do dodawania nowego studenta do
//dziennika
//- posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
//- posiadać metodę 'usuńStudenta(String):void' do usuwania studenta po jego numerze
//indexu
//- posiadać metodę 'zwróćStudenta(String):Optional Student' która jako parametr przyjmuje numer
//indexu studenta, a w wyniku zwraca konkretnego studenta.
//- posiadać metodę 'podajŚredniąStudenta(String): Optional <double>' która przyjmuje indeks studenta
//i zwraca średnią ocen studenta.
//- posiadać metodę 'podajStudentówZagrożonych():List<Student>'
//- posiadać metodę 'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę
//studentów po numerach indeksów, a następnie zwraca posortowaną listę.

import java.util.List;
import java.util.Optional;

public class MainDziennik {

    public static void main(String[] args) {

        Dziennik dziennik = new Dziennik();

        dziennik.dodajStudenta("123", "Koala", "Mis");
        dziennik.wypiszListeStudentow();
        dziennik.usunStudenta("123");
        dziennik.usunStudenta("555555555");

        Optional<Student> optionalStudent = dziennik.zwrocStudenta("88888");
        if(optionalStudent.isPresent()){
            Student student = optionalStudent.get();
            System.out.println("Imie i nazwisko: " + student.getImie() + " " + student.getNazwisko());
        } else {
            System.err.println("Funkcja nie zwróciła studenta");
        }
        Optional<Double> optionalSrednia = dziennik.podajSredniaStudenta("88888");
        if(optionalSrednia.isPresent()){
            Double sredniaStudenta = optionalSrednia.get();
            System.out.println("zwrocona srednia to: " + sredniaStudenta);
        } else {
            System.err.println("funkcja nie zwrocila sredniej");
        }
        dziennik.dodajStudenta("999", "Lorek", "Kot");
        dziennik.dodajOcene("999", 5.0);
        dziennik.dodajOcene("999", 5.0);
        dziennik.dodajOcene("999", 5.0);

        Optional<Double> optionalSredniaStudenta = dziennik.podajSredniaStudenta("999");
        if(optionalSredniaStudenta.isPresent()){
            Double sredniaStudenta = optionalSredniaStudenta.get();
            System.out.println("zwrocona srednia to: " + sredniaStudenta);
        } else {
            System.err.println("funkcja nie zwrocila sredniej");
        }
        // lista zagrożonych
        List<Student> listaZagrozonychStudentow = dziennik.podajStudentowZagrozonych();
        System.out.println("Lista zagrozonych: " + listaZagrozonychStudentow);
    }


}
