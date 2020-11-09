# jawaban pertanyaan praktikum

## PERTANYAAN PERCOBAAN 1

1. Pada langkah ke 9, pada baris program ke 3 terdapat warning pada script tersebut. 
Jelaskan penyebab terjadinya hal tersebut ?

<img src = 'P101.png'>

- Jawaban: karena output akan tetap berjalan meski tanpa import tersebut sehingga import tidak diperlukan

2. Pada langkah ke 9, pada baris program ke 3. Apa yang terjadi jika script tersebut
dihilangkan? Jelaskan menurut pemahaman anda. 

- Jawaban: output akan tetap berjalan karena berada dalam satu package yang sama.

3. Mengapa pada langkah nomor 9 terjadi error? Jelaskan!

- Jawaban: karena pada class rektor terdapat method beriSertifikatCumlaude hanya memanggil method lulus dan meraihIPKTinggi() di kelas Sarjana dan PascaSarjana agar mahasiswa biasa (class mahasiswa) tidak dapat menerima sertifikat cumlaude.

4. Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class
Program? Mengapa demikian?

- Jawaban: bisa, karena sarjanaCumlaude adalah instansiasi objek dari class Sarjana, dimana Class Sarjana adalah subclass dari class Mahasiswa.

5. Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method
beriSertifikatCumlaude() pada class Rektor? Mengapa demikian?

- Jawaban: tidak bisa, karena class Mahasiswa adalah parent class yang sama sekali tidak berhubungan dengan interface class.

6. Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi
class Program menjadi seperti berikut ini:

<img src = 'P106.png'>

- Jawaban:

-- SOURCE CODE --
- REKTOR

public class Rektor {

    public void beriSertifikatCumlaude(ICumlaude mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat silahkan perkenalkan diri Anda..");
        
    }
} 

- MAIN

public class interfacemain {

    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        sarjanaCumlaude.kuliahDiKampus();
        sarjanaCumlaude.Lulus();
        sarjanaCumlaude.meraihIPKTinggi();

        System.out.println("--------------------------------------------------");
        
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
        masterCumlaude.kuliahDiKampus();
        masterCumlaude.Lulus();
        masterCumlaude.meraihIPKTinggi();
    }
}

-- OUTPUT --

<img src = 'output106.png'>

## PERTANYAAN PERCOBAAN 2

1. Pada script code interface IBerprestasi, modifikasi script tersebut sesuai dengan gambar
dibawah ini :

<img src = 'P201.png'>

Dari perubahan script diatas, apa yang terjadi ? serta jelaskan alasannya (capture hasilnya) 

- Jawaban: error karena secara implisit, modifier untuk method di interface adalah public dan abstract sehingga tanpa menuliskan modifier akan otomatis public dan abstract. artinya method abstract interface harus public, tidak boleh selain public.

<img src = 'J201.png'>

2. Perhatikan script code dibawah ini :

<img src = 'P202.png'>

Jelaskan menurut anda, mengapa hasil dari script code tersebut error ? 

- Jawaban: karena Interface tidak dapat dibuat objek instance-nya dengan kata kunci new.

3. Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan
menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait
pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat
mawapres pada objek sarjanaCumlaude.

<img src = 'P203.png'>

- Jawaban: 

-- SOURCE CODE --

- Class Sarjana

public class Sarjana extends Mahasiswa implements ICumlaude, IBerprestasi {

    public Sarjana(String nama) {
        super(nama);
    }

    @Override
    public void Lulus() {
        System.out.println("Aku sudah menyelesaikan skripsi"); //To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("saya menerbitkan artikel di jurnal NASIONAL"); //To change body of generated methods, choose Tools | Templates.
    }
}

-- OUTPUT --

<img src = 'output203.png'>