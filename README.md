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
## ⚙️ Kebutuhan Sistem
- JDK: Minimal Java 8 (disarankan versi terbaru).
- OS: Windows / Linux / macOS (selama ada JVM).
- Editor: VS Code / IntelliJ / NetBeans / text editor lain.
- Terminal: Command Prompt / PowerShell / Terminal.

## ▶️ Cara Compile & Jalankan
`cd PerpustakaanMini`

### Compile semua file Java:
`javac *.java`
Jika berhasil, akan muncul file .class di folder yang sama.

### Jalankan aplikasi:
`java LibraryApp`

## Di console akan muncul menu:
=== MENU PERPUSTAKAAN MINI ===
1. Lihat daftar buku
2. Lihat daftar anggota
3. Tambah buku baru
4. Daftarkan anggota baru
5. Pinjam buku
6. Kembalikan buku
7. Lihat daftar peminjaman
8. Demo pass by value
9. Keluar

## 🧪 Contoh Alur Penggunaan
1. Pilih menu 1 → lihat daftar buku awal.
2. Pilih menu 3 → tambah buku baru (isi ID, judul, penulis).
3. Pilih menu 4 → daftar anggota baru.
4. Pilih menu 5 → pinjam buku:
5. Masukkan ID buku yang tersedia, misalnya B001.
6. Masukkan ID anggota yang valid, misalnya M001.
7. Pilih menu 7 → lihat daftar peminjaman.
8. Pilih menu 6 → kembalikan buku yang sudah dipinjam.
9. Pilih menu 8 → lihat demo konsep pass by value:
10. Nilai di dalam method berubah, nilai variabel awal tetap.
11. Pilih menu 9 → keluar dari program.
Selesai.

## 📂 Struktur Folder
```text
PerpustakaanMini/
├─ Book.java
├─ Member.java
├─ Loan.java
├─ Library.java
├─ LibraryApp.java
└─ README.md

