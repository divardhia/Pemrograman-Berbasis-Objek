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
public class Buku extends MediaInformasi {

    public void setJmlHalaman(int jmlHalaman) {
        System.out.println("Buku ini memiliki : " + jmlHalaman);
        System.out.println("Jika dihitung dengan covernya, halaman dari majalah tersebut: " + (jmlHalaman + 4) + ", lebih tebal daripada majalah karena terdapat cover dalam dan cover luar");
    }

    public void reputasi() {
        System.out.println("Buku ini Bereputasi!");
        System.out.println();
    }
}
