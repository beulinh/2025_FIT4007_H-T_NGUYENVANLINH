public class KiemThuVien extends NhanVien {
    private int soBugTimDuoc;

    public KiemThuVien(String maNV, String ten, double luongCoBan, int soBugTimDuoc) {
        super(maNV, ten, luongCoBan);
        this.soBugTimDuoc = soBugTimDuoc;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + soBugTimDuoc * 10000;
    }
}
