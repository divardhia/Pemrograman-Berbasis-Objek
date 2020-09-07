# Laporan Tugas Jobsheet 1

## tugas 1
<img src = 'uml_tugas1.png'>

### penjelasan :
menggunakan power designer untuk membuat diagram sesuai dengan petunjuk yang berikan yaitu class peminjaman, atribut id, namaMember, namaGame, harga, dan lamaSewa, juga method sebanyak 2 yaitu, hitungHarga dimana total yang harus dibayarkan dengan operasi hitung lama sewa dikalikan harga dan method tampilData untuk memperlihatkan data transaksi penyewaan video game.

## tugas 2

### kode program :
public class Peminjaman {

    public String id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamaSewa;

    public int hitungHarga() {
        int hargaBayar = harga;
        hargaBayar *= lamaSewa;
        return hargaBayar;
    }

    public void tampilData() {
        System.out.println("Data Peminjaman Video Game");
        System.out.println("===========================");
        System.out.println("id : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game : " + namaGame);
        System.out.println("harga : Rp " + harga);
        System.out.println("Lama Sewa : " + lamaSewa + " hari");
        System.out.println("Harga Bayar : " + hitungHarga());
        System.out.println("===========================");
        System.out.println();
    }
}

### Main Peminjaman :
public class Main {

    public static void main(String[] args) {
        Peminjaman p = new Peminjaman();
        
        p.id = "P002";
        p.namaMember = "Diva Ardhia";
        p.namaGame = "The Sims";
        p.harga = 5000;
        p.lamaSewa = 2;
        p.tampilData();
    }
}

### output peminjaman :
<img src = 'outputPeminjaman.png'>

### penjelasan 
disini dibuat data peminjaman sesuai dengan diagram yang telah dibuat pada nomer 1 berisi id transaksi, nama member yang meminjam, nama game yang dipinjam, harga per harinya, lama sewa yang yang dihitung hari, dan total pembayaran sesuai lama sewanya.

## tugas 3
### kode program :
public class Lingkaran {

    public double phi = 3.14;
    public double r;

    public double hitungLuas() {
        double luas = r * r * phi;
        return luas;
    }

    public double hitungKeliling() {
        double keliling = (r * 2) * phi;
        return keliling;
    }

    public void tampil() {
        System.out.println("Operasi Hitung Lingkaran");
        System.out.println("===========================");
        System.out.println("jari-jari lingkaran = " + r);
        System.out.println("Keliling Lingkaran = " + hitungKeliling());
        System.out.println("Luas Lingkaran = " + hitungLuas());
        System.out.println("===========================");
        System.out.println();
    }
}
### Main Lingkaran :
public class Main {

    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        Lingkaran l2 = new Lingkaran();

        l1.r = 7;
        l1.tampil();

        l2.r = 13.2;
        l1.tampil();
    }
}

### output Lingkaran :
<img src = 'outputLingkaran.png'>

### penjelasan :
dibuatlah program operasi menghitung luas dan keliling sebuah bangun lingkaran sesuai diagram yang telah ditentukan class, atribut, method dan modifiernya. disitu saya membuat program dimana atribut phi tidak bisa diubah dan sejak awal adalah 3,14 sehingga tinggal mengubah jari-jarinya saja kemudian hasil hitung luas dan kelilingnya didapatkan. 

## tugas 4
### kode program barang :
public class Barang {

    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        int hargaJual = hargaDasar;
        diskon /= 100;
        hargaJual *= diskon;
        return hargaJual;
    }

    public void tampilData() {
        System.out.println("Data Barang");
        System.out.println("===========================");
        System.out.println("Kode : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : Rp " + hargaDasar);
        System.out.println("diskon : " + diskon + " %");
        System.out.println("Harga Jual : Rp " + hitungHargaJual());
        System.out.println("===========================");
        System.out.println();
    }

}
### main barang :
public class Main {

    public static void main(String[] args) {
        Barang b1 = new Barang();
        Barang b2 = new Barang();

        b1.kode = "A001";
        b1.namaBarang = "Party Dress Anak Perempuan";
        b1.hargaDasar = 170000;
        b1.diskon = 50;
        b1.tampilData();

        b2.kode = "102";
        b2.namaBarang = "Xiaomi Redmi 8";
        b2.hargaDasar = 1800000;
        b2.diskon = 25;
        b2.tampilData();
    }
}
### output barang :
<img src = 'outputBarang.png'>

### penjelasan :
dibuat program data atau class barang yang berisi atribut kode, nama barang, harga dasar, diskon, harga jual dan method operasi menghitung harga jual barang yang telah diberi diskon dan method menampilkan seluruh data barang beserta diskonnya.   