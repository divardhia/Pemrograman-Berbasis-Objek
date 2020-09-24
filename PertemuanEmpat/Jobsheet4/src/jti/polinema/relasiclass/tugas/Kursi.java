/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.tugas;

import jti.polinema.relasiclass.percobaan4.Penumpang;

/**
 *
 * @author HUAWEI
 */
public class Kursi {

    private String nomor;
    private Penonton penonton;

    public Kursi(String n) {
        nomor = n;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public void setPenonton(Penonton penonton) {
        this.penonton = penonton;
    }

    public Penonton getPenonton() {
        return penonton;
    }

    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penonton != null) {
            info += "Penumpang: " + penonton.info() + "\n";
        }

        return info;
    }
}
