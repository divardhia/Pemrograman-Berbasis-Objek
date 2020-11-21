/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teori;

/**
 *
 * @author HUAWEI
 */
public class Manajer extends Pegawai {

    private int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    public int getTunjangan() {
        return this.tunjangan;
    }

    @Override
    public int getGaji() {
        return this.gaji;
    }

}
