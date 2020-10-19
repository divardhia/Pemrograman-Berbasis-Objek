# Laporan UTS

## Class Mesin

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

## Class SepedaMotor

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

## Class DemoUts

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

## output

<img src = 'outputUTS.png'>