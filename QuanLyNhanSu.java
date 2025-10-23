import java.io.*; 
import java.util.ArrayList;

public class QuanLyNhanSu {

    private ArrayList<NhanVien> danhSach;

    public QuanLyNhanSu() {
        this.danhSach = new ArrayList<>();
    }

    public void themNhanVien(NhanVien nv) {
        this.danhSach.add(nv);
    }

    public void inDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }
        for (NhanVien nv : this.danhSach) {
            System.out.println("Ten: " + nv.getTen() + ", Luong: " + nv.tinhLuong());
        }
    }

    // Luu file
    public void luuFile(String tenFile) {
        try (FileOutputStream fos = new FileOutputStream(tenFile);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            // Ghi toàn bộ danh sách xuống file
            oos.writeObject(this.danhSach);

            System.out.println("Luu file thanh cong!");
        } catch (IOException e) {
            System.out.println("Loi khi luu file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Đoc file
    public void docFile(String tenFile) {
        try (FileInputStream fis = new FileInputStream(tenFile);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            // Ép kiểu về ArrayList<NhanVien>
            this.danhSach = (ArrayList<NhanVien>) ois.readObject();

            System.out.println("Doc file thanh cong!");
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file de doc! Tao danh sach moi.");
            this.danhSach = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Loi khi doc file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
