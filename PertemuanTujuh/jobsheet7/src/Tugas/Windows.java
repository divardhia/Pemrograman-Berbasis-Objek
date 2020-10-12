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
public class Windows extends Laptop {

    public String fitur;

    public Windows() {
    }

    public Windows(String fitur, String jnsBatrei, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(jnsBatrei, merk, kecProsesor, sizeMemory, jnsProsesor);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        super.tampilLaptop();
        System.out.println("fitur : " + fitur);
    }
}
