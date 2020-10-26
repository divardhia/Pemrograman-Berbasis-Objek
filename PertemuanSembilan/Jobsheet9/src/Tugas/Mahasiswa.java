/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author HUAWEI
 */
public class Mahasiswa extends Manusia {

    public void makan() {
        super.makan();
        System.out.println("Mahasiswa makan indomie diakhir bulan");
    }

    public void tidur(boolean tidur) {
        System.out.println("Mahasiswa Tidur = " + tidur);
    }
}
