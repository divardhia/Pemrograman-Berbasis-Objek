/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.*;

/**
 *
 * @author HUAWEI
 */
public class TestBackendAnggota {

    public static void main(String[] args) {
        Anggota a1 = new Anggota("Diva Ardhia", "mojokerto", "081231145678");
        Anggota a2 = new Anggota("Fadhila", "Tulungagung", "083245234098");
        Anggota a3 = new Anggota("dhaifan", "solo", "089123456278");

        // test insert
        a1.save();
        a2.save();
        a3.save();

        // test update
        a2.setAlamat("Jombang");
        a2.save();

        // test delete
        a3.delete();

        // test select all
        for (Anggota an : new Anggota().getAll()) {
            System.out.println("Nama: " + an.getNama() + ", Alamat: " + an.getAlamat() + ", Telp: " + an.getTelepon());
        }

        // test search
        for (Anggota an : new Anggota().search("Diva")) {
            System.out.println("Nama: " + an.getNama() + ", Alamat: " + an.getAlamat() + ", Telp: " + an.getTelepon());
        }
    }
}
