/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author HUAWEI
 */
public class Mesin {

    private String merek;
    private double kecepatan;

    public Mesin() {
    }

    public void setMerk(String merek) {
        if (merek == "Yamaha") {
            this.merek = merek;
        } else if (merek == "Honda") {
            this.merek = merek;
        } else {
            System.out.println("Mesin hanya berjenis Honda dan Yamaha");
        }
    }

    public String getMerk() {
        System.out.println(merek);
        return merek;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void tambahKecepatan() {
        if (this.merek == "Honda" && this.kecepatan < 100) {
            kecepatan += 10;
            System.out.println(kecepatan + "Km/jam");
        } else if (this.merek == "Yamaha" && this.kecepatan < 100) {
            kecepatan += 15;
            System.out.println(kecepatan + "Km/jam");
        } else if (this.merek == "Honda" && this.kecepatan >= 100) {

            System.out.println("kecepatan maksimal 100 Km/jam");
            System.out.println(kecepatan + "Km/jam");
        } else if (this.merek == "Yamaha" && this.kecepatan >= 100) {

            System.out.println("kecepatan maksimal 100 Km/jam");
            System.out.println(kecepatan + "Km/jam");
        } else {
            System.out.println("tidak dapat menambah kecepatan");
        }
    }

    public void kurangiKecepatan() {
        if (this.merek == "Honda" && this.kecepatan > 0) {
            kecepatan -= 5;
            System.out.println(kecepatan + "Km/jam");
        } else if (this.merek == "Yamaha" && this.kecepatan > 0) {
            kecepatan -= 10;
            System.out.println(kecepatan + "Km/jam");
        } else if (this.merek == "Honda" && this.kecepatan <= 0) {
            System.out.println("Mesin Mati");
            System.out.println(kecepatan + "Km/jam");
        } else if (this.merek == "Yamaha" && this.kecepatan <= 0) {
            System.out.println("Mesin Mati");
            System.out.println(kecepatan + "Km/jam");
        }
    }
}
