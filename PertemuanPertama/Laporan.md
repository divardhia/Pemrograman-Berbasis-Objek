# Laporan Tugas Jobsheet 1

## Kode Program Mobil :
public class Mobil {

    private String merek, warna;
    private int kecepatan;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void tambahKecepatan(int increment) {
        kecepatan = kecepatan + increment;
    }

    public void rem(int decrement) {
        kecepatan = kecepatan - decrement;
    }

    public void cetakStatus() {
        System.out.println("Merek : " + merek);
        System.out.println("Warna : " + warna);
        System.out.println("Kecepatan : " + kecepatan);
    }
}
### Main --
public class Main {

    public static void main(String[] args) {

        Mobil m1 = new Mobil();
        Mobil m2 = new Mobil();

        m1.setMerek("Avanza");
        m1.setWarna("Kuning");
        m1.tambahKecepatan(10);
        m1.setWarna("biru");
        m1.cetakStatus();
        System.out.println();

        m2.setMerek("Honda");
        m2.setWarna("Putih");
        m2.tambahKecepatan(17);
        m2.rem(3);
        m2.cetakStatus();
    }
}
## output mobil :
<img src = 'OMobil.png'>

## penjelasan :
mobil memiliki atribut atau ciri-ciri merek, warna, dan kecepatan sehingga dapat melakukan pekerjaan atau method set merek, set warna, mengganti warna, menambah kecepatan, dan rem.


## kode progam Kipas Angin :
public class KipasAngin {

    private String merek, warna, size;
    private int tombol, baling2;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void setSize(String newValue) {
        size = newValue;
    }

    public void tambahKecepatan(int increment) {
        tombol = tombol + increment;
    }

    public void kurangKecepatan(int decrement) {
        tombol = tombol - decrement;
    }

    public void setBaling2(int newValue) {
        baling2 = newValue;
    }

    public void cetakStatus() {
        System.out.println("Merek : " + merek);
        System.out.println("Ukuran : " + size);
        System.out.println("Warna : " + warna);
        System.out.println("Baling - baling : " + tombol);
        System.out.println("kecepatan : " + tombol);
    }
}
### main --
public class Main {

    public static void main(String[] args) {

        //Buat dua buah objek kipas angin
        KipasAngin ka1 = new KipasAngin();
        KipasAngin ka2 = new KipasAngin();

        ka1.setMerek("Advance");
        ka1.setWarna("Biru");
        ka1.setSize("kecil");
        ka1.setBaling2(3);
        ka1.tambahKecepatan(2);
        ka1.cetakStatus();
        System.out.println();

        ka2.setMerek("Maspion");
        ka2.setWarna("Hitam");
        ka2.setSize("Besar");
        ka2.setBaling2(2);
        ka2.tambahKecepatan(3);
        ka2.kurangKecepatan(2);
        ka2.cetakStatus();
    }
}
## output Kipas Angin :
<img src = OKipasAngin.png>

## penjelasan :
Kipas Angin memiliki atribut Merek, warna, ukuran, baling-baling, dan kecepatan sehingga mendapatkan method atau melakukan pekerjaan set merek, set warna, set ukuran, set jumlah baling-baling, menambah kecepatan baling-baling, mengurangi kecepatan baling-baling, menyalakan dan mematikan kipas angin.

## kode program Lemari Buku :
public class AlmariBuku {

    private String warna;
    private int panjang, lebar;

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void setPanjang(int newValue) {
        panjang = newValue;
    }

    public void setLebar(int newValue) {
        lebar = newValue;
    }

    public void cetakStatus() {
        System.out.println("Warna : " + warna);
        System.out.println("Size : " + (panjang * lebar) + " cm");
    }
}
## kode program lemari pakaian :
public class AlmariPakaian extends AlmariBuku {

    private int pintu, besiPengait;

    public void setPintu(int newValue) {
        pintu = newValue;
    }

    public void setbesiPengait(int newValue) {
        besiPengait = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Jumlah Pintu : " + pintu);
        System.out.println("Pengait Besi : " + besiPengait);
    }
}
### main --
public class Almari {
    
    public static void main(String[] args) {
        
        AlmariBuku b1 = new AlmariBuku();
        AlmariBuku b2 = new AlmariBuku();
        AlmariPakaian p = new AlmariPakaian();
        
        b1.setWarna("hitam dan putih");
        b1.setPanjang(200);
        b1.setLebar(40);
        System.out.println("Lemari buku 1");
        b1.cetakStatus();
        System.out.println();
        
        b2.setWarna("Coklat");
        b2.setPanjang(300);
        b2.setLebar(60);
        System.out.println("Lemari Buku 2");
        b2.cetakStatus();
        System.out.println();
        
        p.setWarna("Putih");
        p.setPanjang(100);
        p.setLebar(50);
        p.setPintu(4);
        p.setbesiPengait(2);
        System.out.println("Lemari Pakaian");
        p.cetakStatus();
    }
}
## output lemari :
<img src = OLemari.png>

## penjelasan :
Lemari Buku pada dasarnya adalah sama dengan Lemari Pakaian (memiliki panjang, memiliki lebar, memiliki warna, memiliki merek, dsb) namun ada fitur tambahan yaitu pintu, dimana Lemari buku tidak memiliki pintu dan besi pengait. jadi lemari pakaian extends atau mewarisi class AlmariBuku, kemudian tinggal tambahkan saja fitur yang sebelumnya belum ada di class AlmariBuku. 

