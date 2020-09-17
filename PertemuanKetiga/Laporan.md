# Laporan Tugas Jobsheet 3

1. Cobalah program dibawah ini dan tuliskan hasil outputnya

source code EncapDemo :

public class EncapDemo {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 30) {
            age = 30;
        } else {
            age = newAge;
        }
    }
}

source code EncapTest :

public class EncapTest {

    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age : " + encap.getAge());
    }
}

output :

<img src = 'output encap.png'>

2. Pada program diatas, pada class EncapTest kita mengeset age dengan nilai 35, namun pada saat ditampilkan ke layar nilainya 30, jelaskan mengapa.

jawaban : karena terdapat if (newAge > 30) {
            age = 30;
        } yang artinya umur diatas 30 tahun dianggap 30 sehingga saat memasukkan nilai 35 yang keluar tetaplah 30.

3. Ubah program diatas agar atribut age dapat diberi nilai maksimal 30 dan minimal 18.

source code EncapDemo :

public class EncapDemo {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {;
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void status() {
        System.out.println("Name : " + getName());
        if (age > 18 && age < 30) {
            System.out.println("age : " + getAge());
        } else {
            System.out.println("age bernilai minimal 18 dan maksimal 30.");;
        }
        System.out.println();
    }
}

source code EncapTest :

public class EncapTest {

    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);
        encap.status();

        encap.setName("Diva Ardhia");
        encap.setAge(19);
        encap.status();
    }
}

output :

<img src = 'output modifEncap.png'>

4. Pada sebuah sistem informasi koperasi simpan pinjam, terdapat class Anggota yang memiliki
atribut antara lain nomor KTP, nama, limit peminjaman, dan jumlah pinjaman. Anggota
dapat meminjam uang dengan batas limit peminjaman yang ditentukan. Anggota juga dapat
mengangsur pinjaman. Ketika Anggota tersebut mengangsur pinjaman, maka jumlah
pinjaman akan berkurang sesuai dengan nominal yang diangsur. Buatlah class Anggota
tersebut, berikan atribut, method dan konstruktor sesuai dengan kebutuhan. Uji dengan
TestKoperasi berikut ini untuk memeriksa apakah class Anggota yang anda buat telah sesuai
dengan yang diharapkan

class Anggota :

public class Anggota {

    private String ktp;
    private String nama;
    private int limitPinjam;
    private int pinjam;

    Anggota(String ktp, String nama, int limitPinjam) {
        this.ktp = ktp;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
    }

    public void setKTP(String ktp) {
        this.ktp = ktp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setLimitPinjam(int limitPinjam) {
        this.limitPinjam = limitPinjam;
    }

    public String getKTP() {
        return ktp;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjam;
    }

    public void pinjam(int pinjam) {
        this.pinjam = pinjam;
    }

    public void angsur(int angsur) {
        pinjam -= angsur;
    }

    public int getJumlahPinjaman() {
        if (pinjam > limitPinjam) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }
        return pinjam;
    }
}

output :

<img src = 'output4.png'>

5. Modifikasi soal no. 4 agar nominal yang dapat diangsur minimal adalah 10% dari jumlah
pinjaman saat ini. Jika mengangsur kurang dari itu, maka muncul peringatan “Maaf,
angsuran harus 10% dari jumlah pinjaman”.

source code Anggota :
public class Anggota {

    private String ktp;
    private String nama;
    private int limitPinjam;
    private int pinjam;

    Anggota(String ktp, String nama, int limitPinjam) {
        this.ktp = ktp;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
    }

    public void setKTP(String ktp) {
        this.ktp = ktp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setLimitPinjam(int limitPinjam) {
        this.limitPinjam = limitPinjam;
    }

    public String getKTP() {
        return ktp;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjam;
    }

    public void pinjam(int pinjam) {
        this.pinjam = pinjam;
    }

    public void angsur(int angsur) {
        if(angsur >= 0.1 * pinjam){
            pinjam -= angsur;
        }
        else{
            System.out.println("Maaf,angsuran harus 10% dari jumlah pinjaman");
        }
    }

    public int getJumlahPinjaman() {
        if (pinjam > limitPinjam) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }
        return pinjam;
    }
}

source code TestKoperasi :

public class TestKoperasi {

    public static void main(String[] args) {
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(10000000);
        donny.getJumlahPinjaman();

        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 200.000");
        donny.angsur(200000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 1.000.000");
        donny.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}

output :

<img src = 'output5.png'>

6. Modifikasi class TestKoperasi, agar jumlah pinjaman dan angsuran dapat menerima input
dari console.

source code :

public class TestKoperasi {

    public static void menu() {
        System.out.println("\nKOPERASI");
        System.out.println("==============================");
        System.out.println("memilih menu : ");
        System.out.println("1.) Pinjaman");
        System.out.println("2.) Angsuran");
        System.out.println("3.) Jumlah Pinjaman");
        System.out.println("4.) selesai");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        int select;

        do {
            menu();
            System.out.print("Pilih Menu : ");
            select = sc.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Masukkan pinjam : ");
                    int p = sc.nextInt();
                    donny.pinjam(p);
                    donny.getJumlahPinjaman();
                    break;
                case 2:
                    System.out.print("Masukkan angsuran : ");
                    int a = sc.nextInt();
                    donny.angsur(a);
                    break;
                case 3:
                    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (select == 1 || select == 2 || select == 3 || select
                == 4);
    }
}

output :

<img src = 'output6-1.png'>
<img src = 'output6-2.png'>
<img src = 'output6-3.png'>