# Pertanyaan diskusi:

Bolehkah apabila sebuah class yang meng-extend suatu abstract class tidak mengimplementasikan method abstract yang ada di class induknya? Buktikan!

jawaban: tidak boleh karena class yang meng-extends class abstract harus di overriding atau akan tetap error.

<img src = 'diskusi.png'>

jika di overriding tidak error lagi

<img src = 'diskusi2.png'>

# Pertanyaan Jobsheet 10

1. Berikan penjelasan terkait tentang jalannya program diatas

jawaban: Hewan sebagai abstract class tidak dapat diinstansiasi dan memiliki abstract method atau method yang tidak diisi yaitu method bergerak() sehingga class yang mengextends Hwan seperti class Ikan dan Kucing memiliki method bergerak() yang terisi aturan. kemudian class Orang adalah class yang dapat memanggil class Hewan dan extends nya dengan atribut hewanPeliharaan. 

2. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika method bergerak() diubah menjadi method abstract!

jawaban:

<img src = 'pertanyaanabstract.png'>


error karena class Ikan dan Kucing bukanlah class abstract

3. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika tidak dilakukan overriding terhadap method bergerak()

jawaban: 

<img src = 'overridePertanyaan.png'>

terjadi error pada penamaan class yang extends dengan class abstract (Kucing.java:12) karena method abstract harus di overriding

4. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika abstract method
bergerak() yang dideklarasikan dalam Class Ikan 

jawaban: 

<img src = 'ikanAbstract.png'>

output atau program error karena terjadi error di class Ikan yg bukan class abstrak, tidak dapat memiliki method abstract sehingga instansiasi Ikan ikut error.

