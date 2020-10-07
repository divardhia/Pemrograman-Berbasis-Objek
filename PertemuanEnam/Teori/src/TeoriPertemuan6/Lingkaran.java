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
public class Lingkaran extends BangunDatar {

    public float r;

    public float luas() {
        float luas = (float) (3.14 * r * r);
        System.out.println("Luas Lingkaran : " + luas);
        return luas;
    }

    public float keliling() {
        float keliling = (float) (2 * 3.14 * r);
        System.out.println("Keliling Lingkaran : " + keliling);
        return keliling;
    }
}
