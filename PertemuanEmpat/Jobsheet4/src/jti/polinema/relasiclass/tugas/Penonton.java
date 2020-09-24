/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.tugas;

/**
 *
 * @author HUAWEI
 */
public class Penonton {

    private String ktp;
    private String nama;

    public Penonton(String k, String n) {
        ktp = k;
        nama = n;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String getKtp() {
        return ktp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        String info = "";
        info += "Ktp : " + ktp + "\n";
        info += "Nama : " + nama + "\n";
        return info;
    }
}
