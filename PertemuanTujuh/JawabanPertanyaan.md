# Jawaban Pertanyaan Percobaan

## Percobaan 1

1.	Sebutkan class mana yang termasuk super class dan sub class dari percobaan 1 diatas!

Jawaban: Karyawan adalah superclass, Manager dan Staff adalah subclass.

2.	Kata kunci apakah yang digunakan untuk menurunkan suatu class ke class yang lain?

Jawaban: Extends.

3.	Perhatikan kode program pada class Manager, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Karyawan!

Jawaban:

Atribut class Manager : tunjangan

Atribut yang diwarisi class Karyawan : nama, alamat, jk, umur, dan gaji

4.	Jelaskan kata kunci super pada potongan program dibawah ini yang terdapat pada class Manager!

Jawaban: Artinya atribut gaji terdapat pada pewarisan class atau superclass.

5.	Program pada percobaan 1 diatas termasuk dalam jenis inheritance apa? Jelaskan alasannya!

Jawaban: Hierarchical inheritance, karena sebuah kelas memiliki lebih dari satu kelas turunan (subclass) dengan kelas induk yang sama.

## Percobaan 2

1.	Berdasarkan class diatas manakah yang termasuk single inheritance dan mana yang termasuk multilevel inheritance?

Jawaban: single inheritance adalah Karyawan-Manager, sedangkan multilevel inheritance adalah Karyawan-Staff-StaffTetap, Karyawan-Staff-StaffHarian.

2.	Perhatikan kode program class StaffTetap dan StaffHarian, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Staff!
Jawaban:

class StaffTetap memiliki atribut asuransi dan golongan, sedangkan Class StaffHarian memiliki atribut jmlJamKerja (jumlah jam kerja).

atribut yang diwarisi dari Class Staff adalah lembur dan potongan.

3.	Apakah fungsi potongan program berikut pada class StaffHarian

Jawaban: untuk memanggil konstruktor berparameter dari superclass

4.	Apakah fungsi potongan program berikut pada class StaffHarian

Jawaban: untuk menampilkan method tampilDataStaff() yang juga berisi method tampilDataKaryawan().

5.	Perhatikan kode program dibawah ini yang terdapat pada class StaffTetap Terlihat dipotongan program diatas atribut gaji, lembur dan potongan dapat diakses langsung. Kenapa hal ini bisa terjadi dan bagaimana class StaffTetap memiliki atribut gaji, lembur, dan potongan padahal dalam class tersebut tidak dideklarasikan atribut gaji, lembur, dan potongan?

jawaban: karena terdapat konstruktor berparameter public Staff(int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji){} dan super(nama, alamat, jk, umur, gaji); yang memanggil konstruktor berparameter dari superclass