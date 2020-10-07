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
public class PersegiPanjang extends BangunDatar {

    public float panjang;
    public float lebar;

    public float luas() {
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang :" + luas);
        return luas;
    }

    @Override
    public float keliling() {
        float keliling = 2 * panjang + 2 * lebar;
        System.out.println("Keliling Persegi Panjang: " + keliling);
        return keliling;
    }
}
