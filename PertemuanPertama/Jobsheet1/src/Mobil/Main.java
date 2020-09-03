/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobil;

/**
 *
 * @author diva ardhia
 */
public class Main {

    public static void main(String[] args) {

        Mobil m1 = new Mobil();
        Mobil m2 = new Mobil();

        m1.setMerek("Avanza");
        m1.setWarna("Kuning");
        m1.tambahKecepatan(10);
        m1.setWarna("biru");
        m1.cetakStatus();
        System.out.println();

        m2.setMerek("Honda");
        m2.setWarna("Putih");
        m2.tambahKecepatan(17);
        m2.rem(3);
        m2.cetakStatus();
    }
}
