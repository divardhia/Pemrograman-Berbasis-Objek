/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author diva ardhia
 */
public class Lingkaran {

    public double phi = 3.14;
    public double r;

    public double hitungLuas() {
        double luas = r * r * phi;
        return luas;
    }

    public double hitungKeliling() {
        double keliling = (r * 2) * phi;
        return keliling;
    }

    public void tampil() {
        System.out.println("Operasi Hitung Lingkaran");
        System.out.println("===========================");
        System.out.println("jari-jari lingkaran = " + r);
        System.out.println("Keliling Lingkaran = " + hitungKeliling());
        System.out.println("Luas Lingkaran = " + hitungLuas());
        System.out.println("===========================");
        System.out.println();
    }
}
