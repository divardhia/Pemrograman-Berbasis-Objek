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
public class MainOverriding {

    public static void main(String[] args) {
        Manusia mm = new Mahasiswa();
        Manusia md = new Dosen();
        Dosen d = new Dosen();
        Mahasiswa m = new Mahasiswa();
        
        mm.bernafas();
        mm.makan();
        m.tidur(true);
        System.out.println();
        
        md.bernafas();
        md.makan();
        d.lembur(true);
    }

    public void dosenMakan(Dosen d) {
        d.bernafas();
        d.makan();
        d.lembur(true);
    }
}
