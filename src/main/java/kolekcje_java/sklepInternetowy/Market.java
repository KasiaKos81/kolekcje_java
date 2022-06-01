package kolekcje_java.sklepInternetowy;

import java.util.*;

public class Market {

    private Map<String, Produkt> produktMap = new HashMap<>();

public void dodajProdukt(String nazwa, double cena, KategoriaProduktu kategoria){
    if (!produktMap.containsKey(nazwa)){
        produktMap.put(nazwa, new Produkt(nazwa, cena, kategoria));
    }
}
public boolean sprawdzCzyJestProdukt(String nazwa){
    return produktMap.containsKey(nazwa);
}
public List<Produkt> zwrocWszystkieProdukty(){
    List<Produkt> lista = new LinkedList<>(produktMap.values());
    return lista;
}
public List<Produkt> zwrocWszystkieProduktyDostepne(){
    List<Produkt> lista = new ArrayList<>();
    for (Produkt produkt : produktMap.values()) {
        if (produkt.getStanOferty() == StanOferty.NA_SPRZEDAZ){
            lista.add(produkt);
        }
    }return lista;

}
public void kupProdukt(String nazwa){
    produktMap.get(nazwa).setStanOferty(StanOferty.SPRZEDANY);
}
public List <Produkt> zwrocWszystkieProduktyNiedostepne(){
    List<Produkt> lista = new ArrayList<>();
    for (Produkt produkt : produktMap.values()) {
        if (produkt.getStanOferty() == StanOferty.SPRZEDANY){
            lista.add(produkt);
        }
    }return lista;
}

}
