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
public class Main {

    public static void main(String[] args) {
        Barang b1 = new Barang();
        Barang b2 = new Barang();

        b1.kode = "A001";
        b1.namaBarang = "Party Dress Anak Perempuan";
        b1.hargaDasar = 170000;
        b1.diskon = 50;
        b1.tampilData();

        b2.kode = "A102";
        b2.namaBarang = "Oppo A37";
        b2.hargaDasar = 1800000;
        b2.diskon = 25;
        b2.tampilData();
    }
}
