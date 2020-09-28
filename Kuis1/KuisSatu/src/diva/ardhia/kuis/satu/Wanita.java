/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diva.ardhia.kuis.satu;

/**
 *
 * @author HUAWEI
 */
public class Wanita extends Manusia {

    private Pria suami;
    private Manusia anak;

    public Wanita() {

    }

    public Wanita(int umur, String nama, boolean dewasa, Pria suami, Manusia anak) {
        this.suami = suami;
        this.anak = anak;
    }

    public void setSuami(Pria newValue) {

        suami = newValue;
    }

    public void setAnak(Manusia newValue) {
        anak = newValue;
    }

    public void info() {
        super.info();

        if (this.getUmur() >= 20) {
            System.out.println("======== data suami ===========");
            suami.info();
            System.out.println("======== data anak ============");
            anak.info();
        } else {
            System.out.println("Wanita ini masih kuliah");
        }
    }
}
