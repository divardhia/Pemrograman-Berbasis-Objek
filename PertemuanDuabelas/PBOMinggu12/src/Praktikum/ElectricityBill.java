/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author HUAWEI
 */
public class ElectricityBill implements Payable {

    private int kwh;
    private String category;

    public ElectricityBill(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }

    public void setKwh(int kwh) {
        this.kwh = kwh;
    }

    public int getKwh() {
        return kwh;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public int getBasePrice() {
        int bPrice = 0;
        switch (category) {
            case "R-1":
                bPrice = 100;
                break;
            case "R-2":
                bPrice = 200;
                break;
        }
        return bPrice;
    }

    @Override
    public int getPaymetAmount() {
        return kwh * getBasePrice(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getBillInfo() {
        return "KWH: " + kwh + "\n"
                + "Category = " + category + "(" + getBasePrice() + " per KWH)\n";
    }
}
