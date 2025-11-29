import java.util.Scanner;

public class LibraryApp {

    // Contoh pass by value (bisa dijelaskan di laporan)
    public static void demoPassByValue(int x) {
        System.out.println("Nilai x di dalam method sebelum ditambah: " + x);
        x = x + 10;
        System.out.println("Nilai x di dalam method setelah ditambah: " + x);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Data awal (contoh di main)
        library.addBook(new Book("B001", "Pemrograman Java Dasar", "Andi"));
        library.addBook(new Book("B002", "Struktur Data", "Budi"));
        library.addBook(new Book("B003", "Basis Data", "Cici"));

        library.addMember(new Member("M001", "Reza", "081234567890"));
        library.addMember(new Member("M002", "Dewi", "089876543210"));

        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("=== MENU PERPUSTAKAAN MINI ===");
            System.out.println("1. Lihat daftar buku");
            System.out.println("2. Lihat daftar anggota");
            System.out.println("3. Tambah buku baru");
            System.out.println("4. Daftarkan anggota baru");
            System.out.println("5. Pinjam buku");
            System.out.println("6. Kembalikan buku");
            System.out.println("7. Lihat daftar peminjaman");
            System.out.println("8. Demo pass by value");
            System.out.println("9. Keluar");
            System.out.print("Pilih menu: ");

            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    library.listBooks();
                    break;
                case "2":
                    library.listMembers();
                    break;
                case "3":
                    System.out.print("Masukkan ID buku: ");
                    String idBuku = scanner.nextLine();
                    System.out.print("Masukkan judul buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan nama penulis: ");
                    String penulis = scanner.nextLine();

                    Book bookBaru = new Book(idBuku, judul, penulis);
                    library.addBook(bookBaru);
                    break;
                case "4":
                    System.out.print("Masukkan ID anggota: ");
                    String idAnggota = scanner.nextLine();
                    System.out.print("Masukkan nama anggota: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan no. telepon: ");
                    String telp = scanner.nextLine();

                    Member memberBaru = new Member(idAnggota, nama, telp);
                    library.addMember(memberBaru);
                    break;
                case "5":
                    System.out.print("Masukkan ID buku yang akan dipinjam: ");
                    String idBukuPinjam = scanner.nextLine();
                    System.out.print("Masukkan ID anggota peminjam: ");
                    String idAnggotaPinjam = scanner.nextLine();
                    System.out.print("Masukkan tanggal pinjam (mis. 2025-11-29): ");
                    String tglPinjam = scanner.nextLine();

                    library.borrowBook(idBukuPinjam, idAnggotaPinjam, tglPinjam);
                    break;
                case "6":
                    System.out.print("Masukkan ID buku yang dikembalikan: ");
                    String idBukuKembali = scanner.nextLine();
                    System.out.print("Masukkan ID anggota: ");
                    String idAnggotaKembali = scanner.nextLine();

                    library.returnBook(idBukuKembali, idAnggotaKembali);
                    break;
                case "7":
                    library.listLoans();
                    break;
                case "8":
                    int nilaiAsli = 5;
                    System.out.println("Nilai x sebelum dipanggil method: " + nilaiAsli);
                    demoPassByValue(nilaiAsli);
                    System.out.println("Nilai x setelah keluar dari method: " + nilaiAsli);
                    System.out.println("(Ini menunjukkan Java menggunakan pass by value untuk tipe primitif)");
                    break;
                case "9":
                    running = false;
                    System.out.println("Terima kasih, program dihentikan.");
                    break;
                default:
                    System.out.println("Menu tidak valid, silakan pilih 1-9.");
            }
        }

        scanner.close();
    }
}
