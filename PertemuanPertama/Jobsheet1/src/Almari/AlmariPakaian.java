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
public class AlmariPakaian extends AlmariBuku {

    private int pintu, besiPengait;

    public void setPintu(int newValue) {
        pintu = newValue;
    }

    public void setbesiPengait(int newValue) {
        besiPengait = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Jumlah Pintu : " + pintu);
        System.out.println("Pengait Besi : " + besiPengait);
    }
}
