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
public class Program {

    public static void main(String[] args) {
        Keledai k = new Keledai("Hehehehe", "Abu-abu", "Kedelai", 4);
        Gorilla g = new Gorilla("Haaum Haaum", "Hitam Manis", "Gulali", 4);
        Singa s = new Singa("Roaar Roaaar", "Coklat", "CingaCing", 4);

        k.displayBinatang();
        k.displayMakanan();
        k.displayData();
        System.out.println();

        g.displayBinatang();
        g.displayMakanan();
        g.displayData();
        System.out.println();

        s.displayBinatang();
        s.displayMakanan();
        s.displayData();
        System.out.println();
    }
}
