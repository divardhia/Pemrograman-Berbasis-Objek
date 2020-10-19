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
public class DemoUts {

    public static void main(String[] args) {
        Mesin h = new Mesin();
        h.setMerk("Honda");

        SepedaMotor honda = new SepedaMotor("Vario", h);
        System.out.println(honda.getMerekMotor());
        System.out.println(honda.getMerekmesin());
        honda.tambahKecepatanMotor();
        honda.tambahKecepatanMotor();
        honda.kurangiKecepatanMotor();

        System.out.println();

        Mesin y = new Mesin();
        y.setMerk("Yamaha");
        SepedaMotor yamaha = new SepedaMotor("NMax", y);
        System.out.println(yamaha.getMerekMotor());
        System.out.println(yamaha.getMerekmesin());
        yamaha.tambahKecepatanMotor();
        yamaha.tambahKecepatanMotor();
        yamaha.kurangiKecepatanMotor();
    }
}
