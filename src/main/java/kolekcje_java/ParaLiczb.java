package kolekcje_java;

import java.util.Objects;

public class ParaLiczb {

    int a;
    int b;



    public ParaLiczb(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        // jeśli to jest ten sam adres w pamieci to true
        if (this == o) return true;
        // jesli typy obiektów są różne to zwróci false
        if (o == null || getClass() != o.getClass()) return false;
        // porówaj pola tego obiektu
        ParaLiczb paraLiczb = (ParaLiczb) o;
        return a == paraLiczb.a && b == paraLiczb.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "ParaLiczb{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
