package Hafta1.Hw1;

public abstract class Doping {
    protected double fiyat;
    protected double[] vergi;

    public double[] getVergi() {
        return vergi;
    }

    public void setVergi(double[] taxes) {
        this.vergi = taxes;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double price) {
        this.fiyat = fiyat;
    }

    public abstract double calculate();
}
