package kolekcje_java.ZadanieZeStudentem;

public class MainUniversity {

    public static void main(String[] args) {

        University university = new University();

        university.dodaj(123456L, "Lorek", "Kot");
        university.dodaj(987654L, "Bella", "Kotka");
        university.dodaj(100200L,"Ziaja", "Koteczka");
        university.dodaj(100400L, "Bolek", "Kot");

        boolean czyZawiera = university.czyZawieraStudenta(100200L);
        if (czyZawiera) {
            System.out.println("zawiera studenta");
        } else {
            System.err.println("nie zawiera studenta");
        }
        System.out.println("student 100200: " + university.zwrocStudentaOptional(100200L));

        System.out.println("ilosc studentow " + university.podajIloscStudentow());

        university.wypiszWszystkichStudentow();

        university.wypiszWszystkieNumeryIndeksow();
    }

}
