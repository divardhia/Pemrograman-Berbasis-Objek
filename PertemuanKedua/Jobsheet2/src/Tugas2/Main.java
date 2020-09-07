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
public class Main {

    public static void main(String[] args) {
        Peminjaman p = new Peminjaman();
        
        p.id = "P002";
        p.namaMember = "Diva Ardhia";
        p.namaGame = "The Sims";
        p.harga = 5000;
        p.lamaSewa = 2;
        p.tampilData();
    }
}
