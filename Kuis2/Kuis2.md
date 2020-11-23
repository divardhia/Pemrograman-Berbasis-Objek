# Kuis 2

# Penerbit
public interface Penerbit {
    public void reputasi();
    public void alamatPenerbit(String alamat);
    public void tahunBerdiri(int tahun);
}

# MediaInformasi

public class MediaInformasi implements Penerbit {

    public int jmlHalaman;
    private int tahunSekarang;

    public int getTahunSekarang(int tahun) {
        return tahunSekarang = tahun;
    }

    public void setJmlHalaman(int jmlHalaman) {
        this.jmlHalaman = jmlHalaman;
    }

    @Override
    public void reputasi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alamatPenerbit(String alamat) {
        System.out.println("Alamat Penerbit : " + alamat); //To change body of generated methods, choose Tools | Templates.
        System.out.println();
    }

    @Override
    public void tahunBerdiri(int tahun) {
        int total = tahunSekarang - tahun;
        System.out.println("Penerbit ini berdiri pada tahun: " + tahun + ", sehingga penerbit ini berusia: " + total + " tahun"); //To change body of generated methods, choose Tools | Templates.
        System.out.println();
    }
}

# Majalah

public class Majalah extends MediaInformasi {

    public void setJmlHalaman(int jmlHalaman) {
        System.out.println("Majalah ini memiliki : " + jmlHalaman);
        System.out.println("Jika dihitung dengan covernya, halaman dari majalah tersebut: " + (jmlHalaman + 2));
        System.out.println();
    }

    public void reputasi() {
        System.out.println("Majalah ini Bereputasi!");
        System.out.println();
    }
}

# Buku

public class Buku extends MediaInformasi {

    public void setJmlHalaman(int jmlHalaman) {
        System.out.println("Buku ini memiliki : " + jmlHalaman);
        System.out.println("Jika dihitung dengan covernya, halaman dari majalah tersebut: " + (jmlHalaman + 4) + ", lebih tebal daripada majalah karena terdapat cover dalam dan cover luar");
    }

    public void reputasi() {
        System.out.println("Buku ini Bereputasi!");
        System.out.println();
    }

# TestClass

public class TestClass {

    public static void Proses(MediaInformasi med) {
        if (med instanceof Majalah) {
            System.out.println("Majalah adalah media informasi! \n");
        } else if (med instanceof Buku) {
            System.out.println("Buku adalah Media informasi! \n");
        } else {
            System.out.println("Kategori belum diketahui");
        }
    }

    public static void main(String[] args) {
        Majalah maj = new Majalah();
        Buku buk = new Buku();
        Proses(maj);
        Proses(buk);

        MediaInformasi medMaj = new Majalah();
        medMaj.setJmlHalaman(46);
        medMaj.reputasi();
        medMaj.alamatPenerbit("Malang");
        int tahunSekarang = medMaj.getTahunSekarang(2020);
        medMaj.tahunBerdiri(1995);
        
        MediaInformasi medBuk = new Buku();
        medBuk.setJmlHalaman(340);
        medBuk.reputasi();
        medBuk.alamatPenerbit("Surabaya");
        medBuk.getTahunSekarang(2030);
        medBuk.tahunBerdiri(1978);
    }
}

# out[ut

<img src = 'output.png'>