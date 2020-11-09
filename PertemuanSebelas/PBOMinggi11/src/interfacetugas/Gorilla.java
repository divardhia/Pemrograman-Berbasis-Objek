/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacetugas;

/**
 *
 * @author HUAWEI
 */
public class Gorilla extends Binatang implements IHerbivora, IKarnivora {

    private String suara;
    private String warnaBulu;

    public Gorilla(String suara, String warnaBulu, String nama, int jmlKaki) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Makanan : " + "Daging + Tumbuhan"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayMakanan() {
        System.out.println("Jenis : " + "Karnivora + Herbivora"); //To change body of generated methods, choose Tools | Templates.
    }

    public void displayData() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Jumlah Kaki : " + this.jmlKaki);
        System.out.println("Suara : " + this.suara);
        System.out.println("Warna Bulu : " + this.warnaBulu);
    }
}
