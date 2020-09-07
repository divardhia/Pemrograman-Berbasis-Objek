/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author diva ardhia
 */
public class Barang {

    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        int hargaJual = hargaDasar;
        diskon /= 100;
        hargaJual *= diskon;
        return hargaJual;
    }

    public void tampilData() {
        System.out.println("Data Barang");
        System.out.println("===========================");
        System.out.println("Kode : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : Rp " + hargaDasar);
        System.out.println("diskon : " + diskon + " %");
        System.out.println("Harga Jual : Rp " + hitungHargaJual());
        System.out.println("===========================");
        System.out.println();
    }

}
