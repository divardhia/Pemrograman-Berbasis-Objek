/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almari;

/**
 *
 * @author diva ardhia
 */
public class AlmariBuku {

    private String warna;
    private int panjang, lebar;

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void setPanjang(int newValue) {
        panjang = newValue;
    }

    public void setLebar(int newValue) {
        lebar = newValue;
    }

    public void cetakStatus() {
        System.out.println("Warna : " + warna);
        System.out.println("Size : " + (panjang * lebar) + " cm");
    }
}
