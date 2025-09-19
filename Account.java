
public class Account {
    private String idaccount;
    private double sotien;

    public Account(String idaccount, double sotien) {
        this.idaccount = idaccount;
        this.sotien = sotien;
    }

    public String getIdaccount() {
        return idaccount;
    }

    public void setIdaccount(String idaccount) {
        this.idaccount = idaccount;
    }

    public double getSotien() {
        return sotien;
    }

    public void setSotien(double sotien) {
        this.sotien = sotien;
    }

    public void hienthisotien() {
        System.out.println("Thong tin tai khoan hien tai:");
        System.out.println("- Ma so tai khoan: " + idaccount);
        System.out.println("- So tien: " + sotien);
    }

    public static void main(String[] args) {
        Account account = new Account("123456", 1000000);
        account.hienthisotien();
        System.out.println();
        account.setSotien(800000);
        System.out.println("Thong tin tai khoan sau khi cap nhat:");
        System.out.println("- Ma so tai khoan: " + account.getIdaccount());
        System.out.println("- So tien: " + account.getSotien());
    }
}