public class Main {
    public static void main(String[] args) {
        QuanLyNhanSu ql = new QuanLyNhanSu();

        System.out.println("--- THEM NHAN VIEN ---");
        ql.themNhanVien(new LapTrinhVien("DEV001", "Binh", 12000000, 10));
        ql.themNhanVien(new KiemThuVien("QC001", "Chi", 11000000, 50));

        System.out.println("--- LUU FILE ---");
        ql.luuFile("nhansu.dat");

        System.out.println("\n--- TAO DOI TUONG QUAN LY MOI (RONG) ---");
        QuanLyNhanSu qlMoi = new QuanLyNhanSu();
        System.out.println("Danh sach cua qlMoi truoc khi doc file:");
        qlMoi.inDanhSach(); 

        System.out.println("\n--- DOC FILE VAO qlMoi ---");
        qlMoi.docFile("nhansu.dat");

        System.out.println("\n--- DANH SACH CUA qlMoi SAU KHI DOC FILE ---");
        qlMoi.inDanhSach(); 
    }
}
