/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author HUAWEI
 */
public class Tugas {

    public static void main(String[] args) {
        System.out.println("========== Data Laptop ==========");
        Laptop L = new Laptop("Li-Ion", "Asus", 3, 8, "Intel Core i5");
        L.tampilLaptop();
        System.out.println();

        System.out.println("========== Data PC ==========");
        Pc P = new Pc(205200, "Fifa", 4, 8, "4 Core");
        P.tampilPc();
        System.out.println();

        System.out.println("========== Data MacBook ==========");
        Mac M = new Mac("Chip Apple T2", "Lithium-ion", "MacBook Air 2020", 1, 8, "Intel Core i5");
        M.tampilMac();
        System.out.println();

        System.out.println("========== Data Laptop Windows =========");
        Windows W = new Windows("desain stylish", "Lithium-Polymer Battery", "ASUS VivoBook Pro F571GD", 4, 8, "Core I7");
        W.tampilWindows();
        System.out.println();
    }
}
