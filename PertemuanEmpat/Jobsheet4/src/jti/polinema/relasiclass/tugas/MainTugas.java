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
public class MainTugas {

    public static void main(String[] args) {
        Penonton p = new Penonton("194184", "Diva Ardhia");
        Petugas loket = new Petugas("010", "Misamo");
        Petugas keamanan = new Petugas("005", "Jamal");
        Petugas asisten = new Petugas("001", "Arin");

        Venue v = new Venue("A", loket, keamanan, 20);
        v.setPenonton(p, 1);
        Penonton f = new Penonton("194199", "Fadhila Khoirun");
        v.setPenonton(f, 7);
        Penonton d = new Penonton("194168", "dannie salsabila");
        v.setPenonton(d, 7);
        System.out.println(v.info());

        Venue ve = new Venue("A", loket, keamanan, asisten, 10);
        System.out.println(ve.info());
    }
}
