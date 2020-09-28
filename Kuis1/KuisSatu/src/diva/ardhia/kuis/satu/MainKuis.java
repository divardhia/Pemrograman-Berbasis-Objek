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
public class MainKuis {

    public static void main(String[] args) {
        
        // class manusia
        Manusia iqbal = new Manusia(20, "Muhammad Iqbaale", false);
        iqbal.info();
        System.out.println();

        // class wanita
        Wanita d = new Wanita();
        d.setNama("diva ardhia");
        d.setUmur(19);
        d.setDewasa(false);
        d.info();
        System.out.println();

        //class pria        
        Pria i = new Pria();
        i.setNama("Ilham Alfa");
        i.setUmur(20);
        i.info();
        System.out.println();
        
        // class wanita
        Wanita istri = new Wanita();
        istri.setNama("Zila ulfia");
        
        // class manusia
        Manusia anak = new Manusia();
        anak.setNama("Vano");
        anak.setUmur(5);
        anak.setDewasa(false);
        
        
        // class pria
        Pria suami = new Pria();
        suami.setNama("Sony");
        suami.setUmur(25);
        suami.setDewasa(true);
        suami.setIstri(istri);
        
        
        // class wanita
        Wanita z = new Wanita();
        z.setNama("Zila Ulfia");
        z.setUmur(21);
        z.setDewasa(true);
        z.setAnak(anak);
        z.setSuami(suami);
        z.getUmur();
        z.info();
        System.out.println();
    }
}
