public class Loan {
    private Book book;
    private Member member;
    private String loanDate;
    private boolean returned;

    public Loan(Book book, Member member, String loanDate) {
        this.book = book;
        this.member = member;
        this.loanDate = loanDate;
        this.returned = false;
    }

    // Getter & Setter
    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public void tampilkanInfo() {
        System.out.println("Peminjaman: Buku [" + book.getId() + " - " + book.getTitle() + "] "
                + "oleh Anggota [" + member.getId() + " - " + member.getName() + "] "
                + "tanggal " + loanDate
                + " | Status: " + (returned ? "Sudah dikembalikan" : "Belum dikembalikan"));
    }
}
