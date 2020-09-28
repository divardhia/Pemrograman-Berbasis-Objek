/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diva.ardhia.kuis.satu;

/**
 *
 * @author HUAWEI
 */
public class Manusia {

    private int umur;
    private String nama;
    private boolean dewasa;

    public Manusia() {

    }

    public Manusia(int umur, String nama, boolean dewasa) {
        this.umur = umur;
        this.nama = nama;
        this.dewasa = dewasa;
    }

    public void setUmur(int newValue) {
        umur = newValue;
    }

    public int getUmur() {
        return umur;
    }

    public void setNama(String newValue) {
        nama = newValue;
    }

    public String getNama() {
        return nama;
    }

    public void setDewasa(boolean newValue) {
        dewasa = newValue;
    }

    public boolean getDewasa() {
        return dewasa;
    }

    public void info() {
        System.out.println("nama: " + nama);
        System.out.println("umur: " + umur + " tahun");
        System.out.println("dewasa: " + dewasa);
    }
}
