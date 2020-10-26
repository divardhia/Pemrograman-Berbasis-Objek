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
public class Dosen extends Manusia {

    public void makan() {
        super.makan();
        System.out.println("Dosen makan rujak di runang dosen");
    }

    public void lembur(boolean lembur) {
        System.out.println("Dosen Lembur : " + lembur);
    }
}
