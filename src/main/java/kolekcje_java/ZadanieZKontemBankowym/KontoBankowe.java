package kolekcje_java.ZadanieZKontemBankowym;

public class KontoBankowe {

    double stanKonta;
    String numerKonta;

    public KontoBankowe(String numerKonta) {
        this.numerKonta = numerKonta;
        this.stanKonta = 0.0;
    }

    public double getStanKonta() {
        return stanKonta;
    }

    public void setStanKonta(double stanKonta) {
        this.stanKonta = stanKonta;
    }

    public String getNumerKonta() {
        return numerKonta;
    }

    public void setNumerKonta(String numerKonta) {
        this.numerKonta = numerKonta;
    }

    @Override
    public String toString() {
        return "KontoBankowe{" +
                "stanKonta=" + stanKonta +
                ", numerKonta='" + numerKonta + '\'' +
                '}';
    }

}

