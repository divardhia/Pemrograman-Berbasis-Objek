/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan3;

/**
 *
 * @author HUAWEI
 */
public class KeretaApi {

    private String kelas;
    private String nama;
    private Pegawai masinis;
    private Pegawai asisten;

    public KeretaApi(String n, String k, Pegawai m) {
        nama = n;
        kelas = k;
        masinis = m;
    }

    public KeretaApi(String n, String k, Pegawai m, Pegawai a) {
        kelas = k;
        nama = n;
        masinis = m;
        asisten = a;
    }

    public void setKelas(String nip) {
        this.kelas = kelas;
    }

    public String getKelas() {
        return kelas;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setMasinis(Pegawai masinis) {
        this.masinis = masinis;
    }

    public Pegawai getMasinis() {
        return masinis;
    }

    public void setAsisten(Pegawai asisten) {
        this.asisten = asisten;
    }

    public Pegawai getAsisten() {
        return asisten;
    }

    public String info() {
        String info = "";
        info += "Nama : " + this.nama + "\n";
        info += "Kelas : " + this.kelas + "\n";
        info += "Masinis : " + this.masinis.info() + "\n";
        if (this.asisten != null) {
            info += "Asisten : " + this.asisten.info() + "\n";
        }
        return info;
    }
}
