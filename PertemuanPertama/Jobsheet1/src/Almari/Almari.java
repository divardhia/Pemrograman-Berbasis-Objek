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
public class Almari {
    
    public static void main(String[] args) {
        
        AlmariBuku b1 = new AlmariBuku();
        AlmariBuku b2 = new AlmariBuku();
        AlmariPakaian p = new AlmariPakaian();
        
        b1.setWarna("hitam dan putih");
        b1.setPanjang(200);
        b1.setLebar(40);
        System.out.println("Lemari buku 1");
        b1.cetakStatus();
        System.out.println();
        
        b2.setWarna("Coklat");
        b2.setPanjang(300);
        b2.setLebar(60);
        System.out.println("Lemari Buku 2");
        b2.cetakStatus();
        System.out.println();
        
        p.setWarna("Putih");
        p.setPanjang(100);
        p.setLebar(50);
        p.setPintu(4);
        p.setbesiPengait(2);
        System.out.println("Lemari Pakaian");
        p.cetakStatus();
    }
}
