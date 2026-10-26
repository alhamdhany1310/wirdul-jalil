package com.daskull.auradulmaraqiyah.model;

public class Muh {
    private String ayat;
    private String artinya;

    public Muh() {
    }

    public Muh(String ayat, String artinya) {
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
