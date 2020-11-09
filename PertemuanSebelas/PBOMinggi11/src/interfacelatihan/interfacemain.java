/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

import interfacelatihan.ICumlaude;
import interfacelatihan.Mahasiswa;
import interfacelatihan.PascaSarjana;
import interfacelatihan.Rektor;
import interfacelatihan.Sarjana;

/**
 *
 * @author HUAWEI
 */
public class interfacemain {

    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        

        //pakrektor.beriSertifikatCumlaude(mhsBiasa);
        
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        sarjanaCumlaude.kuliahDiKampus();
        sarjanaCumlaude.Lulus();
        sarjanaCumlaude.meraihIPKTinggi();

        System.out.println("--------------------------------------------------");
        
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
        masterCumlaude.kuliahDiKampus();
        masterCumlaude.Lulus();
        masterCumlaude.meraihIPKTinggi();
        System.out.println("--------------------------------------------------");
        
        
        pakrektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakrektor.beriSertifikatMawapres(masterCumlaude);
    }
}
