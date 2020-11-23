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
public class MediaInformasi implements Penerbit {

    public int jmlHalaman;
    private int tahunSekarang;

    public int getTahunSekarang(int tahun) {
        return tahunSekarang = tahun;
    }

    public void setJmlHalaman(int jmlHalaman) {
        this.jmlHalaman = jmlHalaman;
    }

    @Override
    public void reputasi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alamatPenerbit(String alamat) {
        System.out.println("Alamat Penerbit : " + alamat); //To change body of generated methods, choose Tools | Templates.
        System.out.println();
    }

    @Override
    public void tahunBerdiri(int tahun) {
        int total = tahunSekarang - tahun;
        System.out.println("Penerbit ini berdiri pada tahun: " + tahun + ", sehingga penerbit ini berusia: " + total + " tahun"); //To change body of generated methods, choose Tools | Templates.
        System.out.println();
    }
}
