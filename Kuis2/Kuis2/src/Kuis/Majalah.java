/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis;

/**
 *
 * @author HUAWEI
 */
public class Majalah extends MediaInformasi {

    public void setJmlHalaman(int jmlHalaman) {
        System.out.println("Majalah ini memiliki : " + jmlHalaman);
        System.out.println("Jika dihitung dengan covernya, halaman dari majalah tersebut: " + (jmlHalaman + 2));
        System.out.println();
    }

    public void reputasi() {
        System.out.println("Majalah ini Bereputasi!");
        System.out.println();
    }
}
