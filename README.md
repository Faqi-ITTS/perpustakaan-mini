# 📚 Perpustakaan Mini – Aplikasi Console Java
- Nama Mahasiswa    : Muhammad Nur Faqi
- NIM               : 1001250014
- Kelas             : Eksekutif

Project ini adalah **aplikasi perpustakaan mini berbasis console** yang dibuat untuk memenuhi tugas mata kuliah **Pemrograman Berorientasi Objek (PBO)**.  
Aplikasi ini menunjukkan implementasi konsep dasar OOP di Java seperti **class, object, enkapsulasi, constructor, overloading, ArrayList, dan method dengan parameter & return value**.

---

## 🎯 Fitur Utama
- Menampilkan daftar buku beserta status ketersediaannya.
- Menampilkan daftar anggota perpustakaan.
- Menambah buku baru.
- Menambah anggota baru.
- Mencatat peminjaman buku oleh anggota.
- Mencatat pengembalian buku.
- Menampilkan riwayat peminjaman.
- Demo sederhana konsep **pass by value** di Java.

---

## 🧱 Struktur Class
Project ini menggunakan 5 class utama:

### 1. `Book`
- Mewakili data buku.
- Atribut: `id`, `title`, `author`, `available`.
- Fitur:
  - Constructor overloading (`Book()` dan `Book(String, String, String)`).
  - Enkapsulasi (getter/setter).
  - `tampilkanInfo()` untuk menampilkan info buku.

### 2. `Member`
- Mewakili data anggota perpustakaan.
- Atribut: `id`, `name`, `phone`.
- Fitur:
  - Enkapsulasi (getter/setter).
  - `tampilkanInfo()`.

### 3. `Loan`
- Mewakili transaksi peminjaman buku.
- Atribut: `book`, `member`, `loanDate`, `returned`.
- Fitur:
  - Mencatat status peminjaman & pengembalian.
  - `tampilkanInfo()`.

### 4. `Library`
- Menjadi “otak” aplikasi (business logic).
- Menyimpan koleksi:
  - `ArrayList<Book> books`
  - `ArrayList<Member> members`
  - `ArrayList<Loan> loans`
- Fitur utama:
  - `addBook(Book book)`
  - `addMember(Member member)`
  - `listBooks()`
  - `listMembers()`
  - `listLoans()`
  - `findBookById(String id)`
  - `findMemberById(String id)`
  - `borrowBook(String bookId, String memberId, String loanDate)`
  - `returnBook(String bookId, String memberId)`
  - `countActiveLoansByMember(String memberId)`

### 5. `LibraryApp`
- Berisi method `main`.
- Menyiapkan data awal (buku & anggota).
- Menampilkan menu dan membaca input user dengan `Scanner`.
- Memanggil method di `Library`.
- Memiliki method `demoPassByValue(int x)` untuk contoh **pass by value**.

---

## 📂 Struktur Folder
```text
PerpustakaanMini/
├─ Book.java
├─ Member.java
├─ Loan.java
├─ Library.java
├─ LibraryApp.java
└─ README.md
