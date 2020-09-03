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
public class Mobil {

    private String merek, warna;
    private int kecepatan;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void tambahKecepatan(int increment) {
        kecepatan = kecepatan + increment;
    }

    public void rem(int decrement) {
        kecepatan = kecepatan - decrement;
    }

    public void cetakStatus() {
        System.out.println("Merek : " + merek);
        System.out.println("Warna : " + warna);
        System.out.println("Kecepatan : " + kecepatan);
    }
}
