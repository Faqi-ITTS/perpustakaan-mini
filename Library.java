import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    private ArrayList<Loan> loans;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        loans = new ArrayList<>();
    }

    // Operasi terhadap koleksi objek
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Buku berhasil ditambahkan.");
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Anggota berhasil didaftarkan.");
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("Belum ada buku.");
            return;
        }
        System.out.println("=== DAFTAR BUKU ===");
        for (Book b : books) {
            b.tampilkanInfo();
        }
    }

    public void listMembers() {
        if (members.isEmpty()) {
            System.out.println("Belum ada anggota.");
            return;
        }
        System.out.println("=== DAFTAR ANGGOTA ===");
        for (Member m : members) {
            m.tampilkanInfo();
        }
    }

    // Mencari objek tertentu (by id)
    public Book findBookById(String id) {
        for (Book b : books) {
            if (b.getId().equalsIgnoreCase(id)) {
                return b;
            }
        }
        return null;
    }

    public Member findMemberById(String id) {
        for (Member m : members) {
            if (m.getId().equalsIgnoreCase(id)) {
                return m;
            }
        }
        return null;
    }

    public boolean borrowBook(String bookId, String memberId, String loanDate) {
        Book b = findBookById(bookId);
        if (b == null) {
            System.out.println("Buku dengan ID tersebut tidak ditemukan.");
            return false;
        }
        if (!b.isAvailable()) {
            System.out.println("Buku sedang dipinjam.");
            return false;
        }

        Member m = findMemberById(memberId);
        if (m == null) {
            System.out.println("Anggota dengan ID tersebut tidak ditemukan.");
            return false;
        }

        Loan loan = new Loan(b, m, loanDate);
        loans.add(loan);
        b.setAvailable(false);

        System.out.println("Peminjaman berhasil dibuat.");
        loan.tampilkanInfo();
        return true;
    }

    public boolean returnBook(String bookId, String memberId) {
        for (Loan loan : loans) {
            if (!loan.isReturned()
                    && loan.getBook().getId().equalsIgnoreCase(bookId)
                    && loan.getMember().getId().equalsIgnoreCase(memberId)) {
                loan.setReturned(true);
                loan.getBook().setAvailable(true);
                System.out.println("Pengembalian berhasil dicatat.");
                return true;
            }
        }
        System.out.println("Data peminjaman tidak ditemukan.");
        return false;
    }

    public void listLoans() {
        if (loans.isEmpty()) {
            System.out.println("Belum ada data peminjaman.");
            return;
        }
        System.out.println("=== DAFTAR PEMINJAMAN ===");
        for (Loan l : loans) {
            l.tampilkanInfo();
        }
    }

    // Contoh method dengan return (untuk laporan)
    public int countActiveLoansByMember(String memberId) {
        int count = 0;
        for (Loan l : loans) {
            if (!l.isReturned()
                    && l.getMember().getId().equalsIgnoreCase(memberId)) {
                count++;
            }
        }
        return count;
    }
}
