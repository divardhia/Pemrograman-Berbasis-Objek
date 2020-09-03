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
public class Main {

    public static void main(String[] args) {

        //Buat dua buah objek kipas angin
        KipasAngin ka1 = new KipasAngin();
        KipasAngin ka2 = new KipasAngin();

        ka1.setMerek("Advance");
        ka1.setWarna("Biru");
        ka1.setSize("kecil");
        ka1.setBaling2(3);
        ka1.tambahKecepatan(2);
        ka1.cetakStatus();
        System.out.println();

        ka2.setMerek("Maspion");
        ka2.setWarna("Hitam");
        ka2.setSize("Besar");
        ka2.setBaling2(2);
        ka2.tambahKecepatan(3);
        ka2.kurangKecepatan(2);
        ka2.cetakStatus();
    }
}
