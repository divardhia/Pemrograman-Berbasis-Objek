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
public class SepedaMotor {

    private Mesin mesin;
    private String merekMotor;

    public SepedaMotor(String merekMotor, Mesin mesin) {
        this.merekMotor = merekMotor;
        this.mesin = mesin;
    }

    public void setMerekMotor(String merekMotor) {
        this.merekMotor = merekMotor;
    }

    public  String getMerekmesin() {
        return mesin.getMerk();
    }

    public String getMerekMotor() {
        return merekMotor;
    }

    public void tambahKecepatanMotor() {
        mesin.tambahKecepatan();
    }

    public void kurangiKecepatanMotor() {
        mesin.kurangiKecepatan();
    }
}
