/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KipasAngin;

/**
 *
 * @author diva ardhia
 */
public class KipasAngin {

    private String merek, warna, size;
    private int tombol, baling2;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void setSize(String newValue) {
        size = newValue;
    }

    public void tambahKecepatan(int increment) {
        tombol = tombol + increment;
    }

    public void kurangKecepatan(int decrement) {
        tombol = tombol - decrement;
    }

    public void setBaling2(int newValue) {
        baling2 = newValue;
    }

    public void cetakStatus() {
        System.out.println("Merek : " + merek);
        System.out.println("Ukuran : " + size);
        System.out.println("Warna : " + warna);
        System.out.println("Baling - baling : " + tombol);
        System.out.println("kecepatan : " + tombol);
    }
}
