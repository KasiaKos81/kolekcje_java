package kolekcje_java.ZadanieZeStudentem;

import javax.swing.text.html.parser.Parser;
import java.util.Optional;
import java.util.Scanner;

public class MainParserObjectUniversity {

    public static void main(String[] args) {
        University university = new University();

        Scanner scanner = new Scanner(System.in);

        UniversityParser parser = new UniversityParser(scanner, university);
        parser.obslugaKomend();


    }
}
