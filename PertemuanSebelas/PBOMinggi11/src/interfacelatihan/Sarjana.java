/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author HUAWEI
 */
public class Sarjana extends Mahasiswa implements ICumlaude, IBerprestasi {

    public Sarjana(String nama) {
        super(nama);
    }

    @Override
    public void Lulus() {
        System.out.println("Aku sudah menyelesaikan skripsi"); //To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("saya menerbitkan artikel di jurnal NASIONAL"); //To change body of generated methods, choose Tools | Templates.
    }
}
