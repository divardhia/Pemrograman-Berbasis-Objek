# Laporan Tugas

## Source Code Pegawai

public class Pegawai {

    public String nip;
    public String nama;
    public String alamat;
    public int gaji;

    public Pegawai() {

    }

    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        return 0;
    }
}

## Source Code Dosen

public class Dosen extends Pegawai {

    public int jumlahSKS;
    public int tarif_SKS;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int sks) {
        this.jumlahSKS = sks;
    }

    public int getGaji() {
        super.getGaji();
        return jumlahSKS * tarif_SKS;
    }
}

## Source Code DaftarGaji

public class DaftarGaji {

    public Pegawai[] listPegawai;

    public void initPegawai() {
        for (int i = 0; i < listPegawai.length; i++) {
            this.listPegawai[i] = new Pegawai();
        }
    }

    public DaftarGaji(int jumlah) {
        this.listPegawai = new Pegawai[jumlah];
        initPegawai();
    }

    public void addPegawai(Pegawai p) {
        this.listPegawai[Integer.parseInt(p.nip) - 1] = p;
    }

    public void printSemuaGaji() {
        int nomor = 1;
        System.out.println("Daftar Gaji Pegawai");
        for (Pegawai pegawai : listPegawai) {
            System.out.println("===========================");
            System.out.println("Pegawai " + nomor);
            System.out.println("Nama : " + pegawai.getNama());
            System.out.println("Gaji : " + pegawai.getGaji());
            nomor++;
        }
    }
}

## Source Code Tugas (Main)

public class Tugas {

    public static void main(String[] args) {
        Dosen d1 = new Dosen("1", "diva ardhia", "Mojokerto");
        Dosen d2 = new Dosen("2", "ilham alfa", "Bandung");
        Dosen d3 = new Dosen("3", "muhammad iqbal", "Malang");

        d1.tarif_SKS = 10000;
        d2.tarif_SKS = 20000;
        d3.tarif_SKS = 10000;
        d1.setSKS(28);
        d2.setSKS(20);
        d3.setSKS(24);

        DaftarGaji g = new DaftarGaji(3);
        g.addPegawai(d1);
        g.addPegawai(d2);
        g.addPegawai(d3);
        g.printSemuaGaji();
        System.out.println("===========================");
    }
}

## Output

<img src = 'Output.png'>

## Penjelasan 

Daftar Gaji menggunakan array untuk listPegawai sehingga output menampilkan seluruh data Pegawai atau Dosen berupa nama dan gaji.