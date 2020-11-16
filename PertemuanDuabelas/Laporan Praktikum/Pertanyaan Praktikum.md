# Jawaban Pertanyaan Praktikum Jobsheet 12

## Pertanyaan Percobaan 1

1. Class apa sajakah yang merupakan turunan dari class Employee?

jawaban: InternshipEmployee dan PermanentEmployee

2. Class apa sajakah yang implements ke interface Payable?

jawaban:PermanentEmployee dan ElectricityBill

3. Perhatikan class Tester1, baris ke-10 dan 11. Mengapa e, bisa diisi
dengan objek pEmp (merupakan objek dari class PermanentEmployee)
dan objek iEmp (merupakan objek dari class
InternshipEmploye) ?

jawaban: pEmp dan iEmp adalah objek dari class PermanentEmployee dan InternshipEmployee yang merupakan subclass dari class Employee.

4. Perhatikan class Tester1, baris ke-12 dan 13. Mengapa p, bisa diisi
dengan objek pEmp (merupakan objek dari class
PermanentEmployee) dan objek eBill (merupakan objek dari class
ElectricityBill) ?

jawaban: karena objek pEmp (merupakan objek dari class PermanentEmployee)
dan objek eBill (merupakan objek dari class
ElectricityBill mengimplements interface Payable.

5. Coba tambahkan sintaks:
p = iEmp;
e = eBill;
pada baris 14 dan 15 (baris terakhir dalam method main) ! Apa yang
menyebabkan error?

jawaban: karena iEmp tidak mengimplements interface Payable dan eBill bukan subclass dari class Employee.

6. Ambil kesimpulan tentang konsep/bentuk dasar polimorfisme!

jawaban: polimorfisme dapat diterapkan pada inheritance dan interface.

## Pertanyaan Percobaan 2

1. Perhatikan class Tester2 di atas, mengapa pemanggilan
e.getEmployeeInfo() pada baris 8 dan
pEmp.getEmployeeInfo() pada baris 10 menghasilkan hasil sama?

jawaban: karena terdapat upcasting yaitu, e=pEmp, artinya e.getEmployeeInfo() menghasilkan ouput yang sama dengan pEmp.getEmployeeInfo() yang merupakan subclassnya.

2. Mengapa pemanggilan method e.getEmployeeInfo() disebut sebagai
pemanggilan method virtual (virtual method invication), sedangkan
pEmp.getEmployeeInfo() tidak?

jawaban: karena hasil outputnya berbeda dengan output yang seharusnya terdapat pada class Employee.

3. Jadi apakah yang dimaksud dari virtual method invocation? Mengapa
disebut virtual?

jawaban:Virtual method invocation terjadi ketika ada pemanggilan overriding method dari
suatu objek polimorfisme. Disebut virtual karena antara method yang dikenali
oleh compiler dan method yang dijalankan oleh JVM berbeda.

## Pertanyaan Percobaan 3

1. Perhatikan array e pada baris ke-8, mengapa ia bisa diisi dengan objekobjek dengan tipe yang berbeda, yaitu objek pEmp (objek dari
PermanentEmployee) dan objek iEmp (objek dari
InternshipEmployee) ?

jawaban: karena pEmp dan iEmp adalah objek class dari subclass yang extends dengan class objek e (Employee).

2. Perhatikan juga baris ke-9, mengapa array p juga biisi dengan objek-objek
dengan tipe yang berbeda, yaitu objek pEmp (objek dari
PermanentEmployee) dan objek eBill (objek dari
ElectricityBilling) ?

jawaban: karena pEmp dan eBill adalah objek class dari class yang mengimplements interface objek p(Payable).

3. Perhatikan baris ke-10, mengapa terjadi error?

jawaban: karena eBill bukan merupakan objek class dari subclass yang extends dengan class objek e (Employee).

## Pertanyaan Percobaan 4

1. Perhatikan class Tester4 baris ke-7 dan baris ke-11, mengapa
pemanggilan ow.pay(eBill) dan ow.pay(pEmp) bisa dilakukan,
padahal jika diperhatikan method pay() yang ada di dalam class Owner
memiliki argument/parameter bertipe Payable?
Jika diperhatikan lebih detil eBill merupakan objek dari
ElectricityBill dan pEmp merupakan objek dari
PermanentEmployee?

jawaban: karena ElectricityBill dan PermanentEmployee mengimplements interface Payable dan class Owner mendeklarasikan parameter bertipe Payable yang merupakan class interface.

2. Jadi apakah tujuan membuat argument bertipe Payable pada method
pay() yang ada di dalam class Owner?

jawaban: untuk memanggil ElectricityBill dan PermanentEmployee yang telah mengimplements interface Payable.

3. Coba pada baris terakhir method main() yang ada di dalam class
Tester4 ditambahkan perintah ow.pay(iEmp); Mengapa terjadi error?

jawaban: karena iEmp merupakan objek yang tidak mengimplements interface Payable.

4. Perhatikan class Owner, diperlukan untuk apakah sintaks p
instanceof ElectricityBill pada baris ke-6 ?

jawaban:  untuk mengecek apakah p
merupakan hasil instansiasi dari class ElectricityBill (true), kemudian dibuatlah sebuah aturan. 

5. Perhatikan kembali class Owner baris ke-7, untuk apakah casting objek
disana (ElectricityBill eb = (ElectricityBill) p)
diperlukan ? Mengapa objek p yang bertipe Payable harus di-casting ke
dalam objek eb yang bertipe ElectricityBill ?

jawaban: suatu objek superclass, kemudian diubah menjadi
objek dari subclass. agar membuat aturannya lebih detail antara ElectricityBill dan PermanentEmployee yang sama sama mengimplements interface class Payable.