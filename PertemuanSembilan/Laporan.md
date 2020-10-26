# Laporan Tugas Jobsheet 9

## overloading

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

output :

<img src = 'segitiga.png'>

penjelasan :

program segitiga terdiri dari dua method overloading yaitu totalSudut dan keliling. pada total sudut pertama terdapat parameter sudutA, aturannya 180 - sudutA. pada totalSudut kedua terdapat parameter sudutA dan sudutB yang aturannya 180 - (sudutA + sudutB). pada method keliling yang pertama bertipe data int memiliki parameter yang terdapat 3 variabel sisi bertipe data int, sedangkan method keliling kedua bertipe data double juga berparameter yang terdapat 2 variabel sisi bertipe data int dan aturan keduanya semua sisi ditambahkan.

## overriding

- Class Manusia

public class Manusia {

    public void bernafas() {
        boolean bernafas = true;
        System.out.println("Manusia bernafas = " + bernafas);
    }

    public void makan() {
        System.out.println("Manusia Pemakan segala (omnivora)");
    }
}

- Class Dosen

public class Dosen extends Manusia {

    public void makan() {
        super.makan();
        System.out.println("Dosen makan rujak di runang dosen");
    }

    public void lembur(boolean lembur) {
        System.out.println("Dosen Lembur : " + lembur);
    }
}

- Class Mahasiswa

public class Mahasiswa extends Manusia {

    public void makan() {
        super.makan();
        System.out.println("Mahasiswa makan indomie diakhir bulan");
    }

    public void tidur(boolean tidur) {
        System.out.println("Mahasiswa Tidur = " + tidur);
    }
}

- Main Class

public class MainOverriding {

    public static void main(String[] args) {
        Manusia mm = new Mahasiswa();
        Manusia md = new Dosen();
        Dosen d = new Dosen();
        Mahasiswa m = new Mahasiswa();
        
        mm.bernafas();
        mm.makan();
        m.tidur(true);
        System.out.println();
        
        md.bernafas();
        md.makan();
        d.lembur(true);
    }

    public void dosenMakan(Dosen d) {
        d.bernafas();
        d.makan();
        d.lembur(true);
    }
}

output :

<img src = 'overriding.png'>

penjelasan : 

terdapat 3 class yaitu Manusia (parentclass), Dosen, dan Mahasiswa (subclass) yang memiliki overriding pada method makan() disetiap class dan membuat class main dengan menggunakan teknik dynamic method dispatch.