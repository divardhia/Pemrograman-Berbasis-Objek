# Tugas Praktikum

Buatlah sebuah program dengan konsep pewarisan seperti pada class diagram berikut ini.
Kemudian buatlah instansiasi objek untuk menampilkan data pada class Mac, Windows dan
Pc!

## Class Komputer

public class Komputer {

    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProsesor;

    public Komputer() {
    }

    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

    public void tampilData() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan Processor : " + kecProsesor + " GHz");
        System.out.println("Memory : " + sizeMemory + " GB");
        System.out.println("Jenis Processor : " + jnsProsesor);
    }
}

## Class Laptop

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

## Class Pc

public class Pc extends Komputer {

    public int ukuranMonitor;

    public Pc() {

    }

    public Pc(int ukuranMonitor, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        super.tampilData();
        System.out.println("ukuran Monitor : " + ukuranMonitor);
    }
}

## Class Mac

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

## Class Windows

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

## Output

<img src = 'outputTugas.png'>

## penjelasan 

terdapat 4 class (tidak termasuk Main class) hybrid inheritance. pertama yaitu Class Komputer yang berisi atribut atau data merk, kecepatan processor, memory, dan jenis processor. class komputer sendiri memiliki 2 subclass yaitu laptop dan pc, dimana pc mengambil data komputer dan menambahkan jenis baterai, sedangkan pc sama mengambil data komputer dan menambahkan ukuran monitor. kemudian laptop memiliki 2 subclass yang berarti kedua subclass tersebut memiliki data dari komputer dan laptop lalu menambahkan data atau atributnya sendiri seperti Mac yang menambahkan atribut security dan Windows menambahkan atribut fitur.