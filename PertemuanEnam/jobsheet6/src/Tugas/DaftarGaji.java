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
public class DaftarGaji {

    public Pegawai[] listPegawai;

    public void initPegawai() {
        for (int i = 0; i < listPegawai.length; i++) {
            this.listPegawai[i] = new Pegawai();
        }
    }

    public DaftarGaji(int jumlah) {
        this.listPegawai = new Pegawai[jumlah];
        initPegawai();
    }

    public void addPegawai(Pegawai p) {
        this.listPegawai[Integer.parseInt(p.nip) - 1] = p;
    }

    public void printSemuaGaji() {
        int nomor = 1;
        System.out.println("Daftar Gaji Pegawai");
        for (Pegawai pegawai : listPegawai) {
            System.out.println("===========================");
            System.out.println("Pegawai " + nomor);
            System.out.println("Nama : " + pegawai.getNama());
            System.out.println("Gaji : " + pegawai.getGaji());
            nomor++;
        }
    }
}
