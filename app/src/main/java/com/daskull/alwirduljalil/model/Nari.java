package com.daskull.auradulmaraqiyah.model;

public class Nari {
    private String ayat;
    private String artinya;

    public Nari() {
    }

    public Nari(String ayat, String artinya) {
        this.ayat = ayat;
        this.artinya = artinya;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }

    public String getArtinya() {
        return artinya;
    }

    public void setArtinya(String artinya) {
        this.artinya = artinya;
    }

}
