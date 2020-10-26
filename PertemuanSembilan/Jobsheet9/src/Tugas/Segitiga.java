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
public class Segitiga {

    private int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        System.out.println(sudut + " derajat");
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        System.out.println(sudut + " derajat");
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        int keliling = sisiA + sisiB + sisiC;
        System.out.println(keliling);
        return keliling;
    }

    public double keliling(int sisiA, int sisiB) {
        double c = sisiA + sisiB;
        System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
        
        Segitiga s = new Segitiga();
        s.totalSudut(30);
        s.totalSudut(30, 60);
        s.keliling(17, 8);
        s.keliling(4, 7, 12);
    }
}
