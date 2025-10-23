public class LapTrinhVien extends NhanVien {
    private int soGioOT;

    public LapTrinhVien(String maNV, String ten, double luongCoBan, int soGioOT) {
        super(maNV, ten, luongCoBan);
        this.soGioOT = soGioOT;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + soGioOT * 50000;
    }
}
