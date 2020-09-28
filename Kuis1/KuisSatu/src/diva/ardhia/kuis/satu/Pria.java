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
public class Pria extends Manusia {

    private Wanita istri;

    public Pria() {

    }

    public void setIstri(Wanita istri) {
        this.istri = istri;
    }

    public Wanita getIstri() {
        return istri;
    }

    public void info() {
        super.info();
        if(super.getUmur() >= 22){
            System.out.println("==== data istri =====");
            istri.info();
        }
        else{
            System.out.println("Pria ini masih kuliah");
        }
    }
}
