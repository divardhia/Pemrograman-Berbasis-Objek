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
public class Petugas {

    private String id;
    private String nama;

    public Petugas(String i, String nm) {
        id = i;
        nama = nm;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        String info = "";
        info += "id: " + this.id + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
