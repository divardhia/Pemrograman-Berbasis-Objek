/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriPertemuan6;

import java.util.Scanner;

/**
 *
 * @author HUAWEI
 */
public class Main {

    public static void main(String[] args) {
        int pil;
        Lingkaran L = new Lingkaran();
        Segitiga S = new Segitiga();
        PersegiPanjang P = new PersegiPanjang();
        Scanner inp = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Lingkaran");
        System.out.println("2. Segitiga");
        System.out.println("3. Persegi Panjang");
        System.out.print("Pilihan : ");
        pil = inp.nextInt();
        switch (pil) {
            case 1:
                L.r = 10;
                L.keliling();
                L.luas();
                break;
            case 2:
                S.alas = 10;
                S.tinggi = 7;
                S.luas();
                S.keliling();
                break;
            case 3:
                P.panjang = 8;
                P.lebar = 7;
                P.keliling();
                P.luas();
                break;

        }
    }
}
