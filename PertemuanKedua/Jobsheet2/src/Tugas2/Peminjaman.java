/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author diva ardhia
 */
public class Peminjaman {

    public String id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamaSewa;

    public int hitungHarga() {
        int hargaBayar = harga;
        hargaBayar *= lamaSewa;
        return hargaBayar;
    }

    public void tampilData() {
        System.out.println("Data Peminjaman Video Game");
        System.out.println("===========================");
        System.out.println("id : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game : " + namaGame);
        System.out.println("harga : Rp " + harga);
        System.out.println("Lama Sewa : " + lamaSewa + " hari");
        System.out.println("Harga Bayar : " + hitungHarga());
        System.out.println("===========================");
        System.out.println();
    }
}
