/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teori;

/**
 *
 * @author HUAWEI
 */
public class Manusia {

    public void nyalakanPerangkat(Elektronik perangkat) {
        if (perangkat instanceof TelevisiJadul) {
            TelevisiJadul tvjadul = (TelevisiJadul) perangkat;
            System.out.println(tvjadul.getModeInput());
            System.out.println("Voltase televisi : " + tvjadul.getVoltase());
        } else if (perangkat instanceof TelevisiModern) {
            TelevisiModern tvmodern = (TelevisiModern) perangkat;
            System.out.println(tvmodern.getModeInput());
            System.out.println("Voltase televisi : " + tvmodern.getVoltase());
        }
    }
}
