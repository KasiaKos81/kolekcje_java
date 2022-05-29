package kolekcje_java.equalshashcode;

public class Main {

    public static void main(String[] args) {

        // String str1 = "FB";
        // String str2 = "Ea";

        String a = "siblings";
        String b = "teheran";

        // te cosie u gory maja taki sam hashCode

        // jaki jest niepisany kontrakt pomiędzy equals i hashCode?
        // metoda equals może zwrócić false, jeśli treść obiektów jest różna
        // metoda equals zwróci true, jeśli obiekty mają identyczną treść/pola/wartość
        // jeśli hashCode jest taki sam, to obiekty nie muszą być sobie równe

        System.out.println(a.hashCode());

        // domyślnie


    }

}
