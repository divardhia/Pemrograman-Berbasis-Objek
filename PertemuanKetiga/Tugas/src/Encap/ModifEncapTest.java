/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encap;

/**
 *
 * @author HP 14-BW005AU
 */
public class ModifEncapTest {

    public static void main(String[] args) {
        ModifEncapDemo encap = new ModifEncapDemo();
        encap.setName("James");
        encap.setAge(35);
        encap.status();

        encap.setName("Diva Ardhia");
        encap.setAge(19);
        encap.status();
    }
}
