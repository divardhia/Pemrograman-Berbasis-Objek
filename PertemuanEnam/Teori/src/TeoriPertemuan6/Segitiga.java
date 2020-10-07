/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriPertemuan6;

/**
 *
 * @author HUAWEI
 */
public class Segitiga extends BangunDatar {

    public float alas;
    public float tinggi;

    public float luas() {
        float luas = (alas * tinggi)/2;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }

    public float keliling() {
        float keliling = (alas * 3);
        System.out.println("Keliling Segitiga: " + keliling);
        return keliling;
    }
}
