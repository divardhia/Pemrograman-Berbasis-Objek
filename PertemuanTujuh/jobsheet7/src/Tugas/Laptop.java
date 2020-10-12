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
public class Laptop extends Komputer {

    public String jnsBatrei;

    public Laptop() {
    }

    public Laptop(String jnsBatrei, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }

    public void tampilLaptop() {
        super.tampilData();
        System.out.println("Jenis Baterai : " + jnsBatrei);
    }

}
