package kolekcje_java.dziennik;

import java.util.*;

public class Dziennik {

    private Map<String, Student> mapaStudentow = new HashMap<>();

    public void dodajStudenta(String numerIndeksu, String imie, String nazwisko){
        if(mapaStudentow.containsKey(numerIndeksu)){
            System.err.println("Student o podanym numerze indeksu już istanieje");
        } else {
            mapaStudentow.put(numerIndeksu, new Student(numerIndeksu, imie, nazwisko));
        }
    }
    public void wypiszListeStudentow(){
        System.out.println("Lista studentów:");
        for (Student student : mapaStudentow.values()) {
            System.out.println(student);
        }
    }
    public void usunStudenta(String numerIndeksu){
        if(mapaStudentow.containsKey(numerIndeksu)){
            mapaStudentow.remove(numerIndeksu);
            System.out.println("Usunięto studenta z numerem indeksu: " + numerIndeksu);
        } else {
            System.err.println("Taki student nie istnieje");
        }
    }
    public Optional<Student> zwrocStudenta(String indeks){
        if(mapaStudentow.containsKey(indeks)){
            System.out.println("Jest student z nr indeksu: " + indeks);
            return Optional.of(mapaStudentow.get(indeks));
        } else {
            System.err.println("brak studenta z nr indeksu podanym");
            return Optional.empty();
        }
    }
    public Optional<Double> podajSredniaStudenta(String numerIndeksu){
        if(mapaStudentow.containsKey(numerIndeksu)){
            System.out.println("znalaziono studenta: " + numerIndeksu);

            Student student = mapaStudentow.get(numerIndeksu);
            List<Double> listaOcenStudenta = student.getListaOcen();
            if(listaOcenStudenta.isEmpty()){
                return Optional.empty();
            }
            double suma = 0.0;
            for (Double ocena : listaOcenStudenta) {
                suma += ocena;
            }
            double srednia = suma / listaOcenStudenta.size();
            return Optional.of(srednia);
        }
        // brak studenta
        return Optional.empty();
    }
    public void dodajOcene(String numerIndeksu, double ocena) {
        if(!mapaStudentow.containsKey(numerIndeksu)){
            System.err.println("nie ma takiego studenta! nie dodano oceny!");
        } else {
            Student student = mapaStudentow.get(numerIndeksu);
            student.getListaOcen().add(ocena);
            System.out.println("dodano ocene");
        }
    }
    public List<Student> podajStudentowZagrozonych(){
    List<Student> listaZagrozonychStudentow = new ArrayList<>();
        // klucz = indeks
        // wartość = student
        for (Student student : mapaStudentow.values()) {
            Optional<Double> optionalSrednia = podajSredniaStudenta(student.getIndeks());
            if(optionalSrednia.isPresent()){
                double srednia = optionalSrednia.get();
                if(srednia <= 2.0) {
                    listaZagrozonychStudentow.add(student);
                }
            }
        }
        return listaZagrozonychStudentow;
    }
}
