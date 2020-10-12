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
public class Mac extends Laptop {

    public String security;

    public Mac() {
    }

    public Mac(String security, String jnsBatrei, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(jnsBatrei, merk, kecProsesor, sizeMemory, jnsProsesor);
        this.security = security;
    }

    public void tampilMac() {
        super.tampilLaptop();
        System.out.println("Security : " + security);
    }
}
