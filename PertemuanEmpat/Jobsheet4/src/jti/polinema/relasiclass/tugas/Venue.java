/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.tugas;

/**
 *
 * @author HUAWEI
 */
public class Venue {

    private String kode;

    private Kursi[] arrayKursi;
    private Petugas loket;
    private Petugas keamanan;
    private Petugas asisten;

    public Venue(String kode, Petugas loket, Petugas keamanan, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
        this.keamanan = keamanan;
        this.loket = loket;
    }

    public Venue(String kode, Petugas loket, Petugas keamanan, Petugas asisten, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
        this.keamanan = keamanan;
        this.loket = loket;
        this.asisten = asisten;
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public void setkode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public void setPenonton(Penonton penonton, int nomor) {
        int index = nomor - 1;
        if (arrayKursi[index].getPenonton() != null) {
            System.out.println("Kursi telah terisi silahkan pilih kursi yang lain");
        } else {
            this.arrayKursi[nomor - 1].setPenonton(penonton);
        }

    }

    public void setLoket(Petugas loket) {
        this.loket = loket;
    }

    public Petugas getLoket() {
        return loket;
    }

    public void setKeamanan(Petugas keamanan) {
        this.keamanan = keamanan;
    }

    public Petugas getKeamanan() {
        return keamanan;
    }

    public void setAsisten(Petugas asisten) {
        this.asisten = asisten;
    }

    public Petugas getAsisten() {
        return asisten;
    }

    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        if (this.asisten != null) {
        }
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}
