# Jawaban Pertanyaan Praktikum

## Percobaan 1

1.	Pada percobaan 1 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!

Jawaban: 
Ditambahkan extends ClassA pada class ClassB 

2.	Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!

Jawaban:
Karena tidak adanya extends yang menunjukkan bahwa class ClassB adalah turunan dari class ClassA.

## Percobaan 2

1.	Pada percobaan 2 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!

Jawaban:
Menambahkan extends ClassA pada class ClassB sebagai pewarisan.

2.	Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!

Jawaban:
Karena tidak adanya extends sebagai hak akses yang menunjukkan bahwa class ClassB adalah turunan dari class ClassA.

## Percobaan 3

1.	Jelaskan fungsi “super” pada potongan program berikut di class Tabung!

Jawaban: 
Digunakan untuk mengakses atribut di class Bangun atau superclass nya.

2.	Jelaskan fungsi “super” dan “this” pada potongan program berikut di class Tabung!

Jawaban:
Super digunakan untuk mengakses atribut di kelas lain, sedangkan this digunakan untuk memanggil atribut pada class itu sendiri.

3.	Jelaskan mengapa pada class Tabung tidak dideklarasikan atribut “phi” dan “r” tetapi class tersebut dapat mengakses atribut tersebut!

Jawaban: 
Karena terdapat extends sebagai hak akses super class pada sub class

## Percobaan 4

1.	Pada percobaan 4 sebutkan mana class yang termasuk superclass dan subclass, kemudian jelaskan alasannya!

Jawaban:
ClassA adalah superclass ClassB dan ClassB adalah subclass ClassA, sedangkan ClassB sendiri adalah superclass ClassC dan ClassC adalah subclass dari ClassB.

2.	Ubahlah isi konstruktor default ClassC seperti berikut: Tambahkan kata super() di baris Pertama dalam konstruktor defaultnya. Coba jalankan kembali class Percobaan4 dan terlihat tidak ada perbedaan dari hasil outputnya!

Jawaban:

<img src = 'Percobaan4.png'>

3.	Ketika mengubah posisi super() dibaris kedua dalam kontruktor defaultnya dan terlihat ada error. Kemudian kembalikan super() kebaris pertama seperti sebelumnya, maka errornya akan hilang. Perhatikan hasil keluaran ketika class Percobaan4 dijalankan. Kenapa bisa tampil output seperti berikut pada saat instansiasi objek test dari class ClassC Jelaskan bagaimana urutan proses jalannya konstruktor saat objek test dibuat!

Jawaban:
ClassC adalah subclass atau pewarisan dari ClassB sehingga jika instansiasi objek adalah ClassC secara otomatis output ClassB akan mengikuti dan ClassB sendiri adalah subclass dari ClassA sehingga output ClassApun mengikuti sebagaimana ClassB adalah pewarisan ClassB.

4.	Apakah fungsi super() pada potongan program dibawah ini di ClassC!

Jawaban:
Guna untuk memanggil konstruktor superclass atau parent class






