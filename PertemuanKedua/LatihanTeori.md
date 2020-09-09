# Latihan Teori PBO

## Latihan 1
Jurusan Teknologi Informasi akan membangun system
informasi pemberian nilai secara online kepada setiap
mahasiswa yang menempuh perkuliahan. Setiap nilai mata
kuliah yang akan dimasukkan dalam system di inputkan secara
langsung oleh dosen yang bersangkutan. Dari system ini
diharapkan mahasiswa akan lebih mudah untuk melakukan
evaluasi terhadap setiap matakuliah yang sudah pernah diikuti.

1) Identifikasi, ada berapa class yang bisa dibuat dari sistem
diatas?
jawaban : 3 yaitu mahasiswa, mata kuliah, dan nilai.
2) Implementasikan class dalam bahasa pemrograman java.
jawaban : 
- mahasiswa 

<img src = 'class mahasiswa.png'>

public class Mahasiswa{

}
- mata kuliah

<img src = 'class MataKuliah.png'>

public class MataKuliah{

}

## Latihan 2
Tambahkan secara lengkap attribute pada setiap class
yang sudah anda identifikasi pada latihan sebelumnya
(Latihan 1)?
jawaban :
- atribut mahasiswa: nim, nama, no telp.

<img src = 'atribut mahasiswa.png'>

public class Mahasiswa{
    public int nim;
    public String nama;
    public int noTelp;
}

- atribut mata kuliah: kode, nama mata kuliah, sks, nilai angka, dan nilai huruf.

<img src = 'atribut mata kuliah.png'>

public class MataKuliah{
    public String kode;
    public String namaMK;
    public int sks;
    public int nilaiAngka;
    public char nilaiHuruf;
}

## Latihan 3
› Buatlah implementasi dengan menggunakan bahasa pemrograman java
dari soal berikut :
› Class Persegi dengan atribut sisi dengan tipe data integer.
› Terdapat tiga method :
Method data persegi untuk menampilkan data panjang sisi dari persegi
tersebut.
Method luas persegi untuk menghitung luas dari persegi tersebut dengan
rumus : sisi x sisi.
Method keliling persegi untuk menghitung keliling dengan rumus : 4 x sisi.
› Tampilkan data persegi, nilai luas persegi dan keliling persegi pada class
TampilPersegi.
jawaban: 

<img src = 'persegi.png'>

- class Persegi

public class Persegi {

    public int sisi;

    public void dataPersegi() {
        System.out.println("Panjang sisi persegi : " + sisi);
    }

    public int luasPersegi() {
        int luas = sisi * sisi;
        System.out.println("Luas Persegi : " + luas);
        return luas;
    }

    public double kelilingPersegi() {
        int keliling = sisi * 4;
        System.out.println("Keliling Persegi : " + keliling);
        return keliling;
    }
}
- class TampilPersegi

public class TampilPersegi {

    public static void main(String[] args) {
        Persegi p = new Persegi();

        p.sisi = 9;
        p.dataPersegi();
        p.luasPersegi();
        p.kelilingPersegi();
    }
}

